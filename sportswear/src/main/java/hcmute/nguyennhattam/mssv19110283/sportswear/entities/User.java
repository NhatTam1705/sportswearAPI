package hcmute.nguyennhattam.mssv19110283.sportswear.entities;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:03 PM
 * Filename : User
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String email;
    private String password;
    private String fullname;
    private Collection<Role> roles = new ArrayList<>();

    public User(String id, String email, String password, String fullname, Collection<Role> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.roles = roles;
    }
}
