package hcmute.nguyennhattam.mssv19110283.sportswear.repositories;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:17 PM
 * Filename : UserRepo
 */
public interface UserRepository extends MongoRepository<User, String> {
    @Query(value = "{'email': ?0}")
    Optional<User> getUserByEmail(String email);

    Optional<User> findByEmail(String email);
}
