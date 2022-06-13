package hcmute.nguyennhattam.mssv19110283.sportswear.repositories;

import hcmute.nguyennhattam.mssv19110283.sportswear.dto.ProductDTO;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Product;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Type;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:25 PM
 * Filename : ProductRepository
 */
public interface ProductRepository extends MongoRepository<Product, String> {

    Optional<Product> findByName(String name);

    @Query(value = "{'type': ?0}")
    Optional<Product> getProductByType(Type type);

}
