package hcmute.nguyennhattam.mssv19110283.sportswear.dto;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Wed, 6/1/2022
 * Time     : 11:21 AM
 * Filename : ProductDto
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private double price;
    private String description;
    private String image;
    private Type type;
    private boolean status;
}
