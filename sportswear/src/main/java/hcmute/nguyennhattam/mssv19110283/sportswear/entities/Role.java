package hcmute.nguyennhattam.mssv19110283.sportswear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Fri, 5/27/2022
 * Time     : 4:54 PM
 * Filename : Role
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "role")
public class Role {

    @Id
    private String id;
    private String name;
}
