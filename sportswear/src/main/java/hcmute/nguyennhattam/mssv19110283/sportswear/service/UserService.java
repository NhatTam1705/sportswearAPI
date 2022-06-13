package hcmute.nguyennhattam.mssv19110283.sportswear.service;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.User;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:14 PM
 * Filename : UserService
 */
public interface UserService {
    User getUserByEmail(String email);

    User getUserById(String id);

    User getUserByName(String name);
}
