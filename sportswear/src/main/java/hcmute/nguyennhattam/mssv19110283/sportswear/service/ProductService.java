package hcmute.nguyennhattam.mssv19110283.sportswear.service;

import hcmute.nguyennhattam.mssv19110283.sportswear.dto.ProductDTO;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Product;

import java.util.List;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:24 PM
 * Filename : ProductService
 */
public interface ProductService {

    List<Product> getAllProduct();

    Product getProductById(String id);

    Product createProduct(ProductDTO productDTO);

    Product modifyProduct(String id, ProductDTO productDTO);
}
