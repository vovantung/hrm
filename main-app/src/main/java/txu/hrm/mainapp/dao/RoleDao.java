package txu.hrm.mainapp.dao;


import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import txu.hrm.mainapp.base.AbstractDao;
import txu.hrm.mainapp.entity.RoleEntity;

import java.util.List;

@Repository
public class RoleDao extends AbstractDao<RoleEntity> {

    @Override
    public RoleEntity findById(Object Id) {
        return super.findById(Id);
    }

    @Transactional
    public void remove(RoleEntity roleEntity) {
        roleEntity = merge(roleEntity);
        getEntityManager().remove(roleEntity);
    }
}
