package txu.hrm.mainapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "ACCOUNT")
public class AccountEntity implements Serializable {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_gen")
    @SequenceGenerator(name = "emp_seq_gen", sequenceName = "EMP_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "FIRSTNAME")
    private  String firstName;

    @Column(name = "PHONENUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @Column(name = "UPDATED_AT")
    private Date updatedAt;


//    @JsonManagedReference
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<CommentEntity> commentList;

//    @Getter
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<PostEntity> postList;

//    public UserEntity orElseThrow(Object userNotFound) {
//        return null;
//    }
}
