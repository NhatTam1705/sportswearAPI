package hcmute.nguyennhattam.mssv19110283.sportswear.repositories;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Wed, 6/1/2022
 * Time     : 11:02 AM
 * Filename : RoleRepository
 */
public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String name);
}
