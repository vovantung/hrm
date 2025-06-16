package txu.hrm.mainapp.dao;

import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import txu.hrm.mainapp.base.AbstractDao;
import txu.hrm.mainapp.entity.EmployeeEntity;

import java.util.List;

@Repository
public class EmployeeDao extends AbstractDao<EmployeeEntity> {

    @Transactional
    public EmployeeEntity save(EmployeeEntity employeeEntity) {
        if (employeeEntity.getId() == null) {
            persist(employeeEntity);
            return employeeEntity;
        } else {
            return merge(employeeEntity);
        }
    }

    @Override
    public EmployeeEntity findById(Object Id) {
        return super.findById(Id);
    }

    @Transactional
    public void delete(EmployeeEntity employeeEntity) {
        remove(employeeEntity);
    }

    public List<EmployeeEntity> getAll() {
        String queryString = "SELECT e FROM EmployeeEntity AS e ";
        Query query;
        query = getEntityManager().createQuery(queryString);
//        query.setParameter("keySearch", "%" + keySearch + "%");


        return getRessultList(query);
    }
}
