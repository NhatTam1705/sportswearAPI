package hcmute.nguyennhattam.mssv19110283.sportswear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:01 PM
 * Filename : Product
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private String description;
    private String image;
    private Type type;
    private boolean status;
}
