package hcmute.nguyennhattam.mssv19110283.sportswear.repositories;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Type;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:46 PM
 * Filename : TypeRepository
 */
public interface TypeRepository extends MongoRepository<Type, String> {

    Optional<Type>findByName(String name);
}
