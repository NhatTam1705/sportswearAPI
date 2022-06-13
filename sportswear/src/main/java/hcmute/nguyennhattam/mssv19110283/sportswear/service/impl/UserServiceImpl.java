package hcmute.nguyennhattam.mssv19110283.sportswear.service.impl;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.User;
import hcmute.nguyennhattam.mssv19110283.sportswear.repositories.UserRepository;
import hcmute.nguyennhattam.mssv19110283.sportswear.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:15 PM
 * Filename : UserServiceImpl
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email)
                .orElseThrow(() -> new RuntimeException("User have email " + email + " not found"));
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User have id " + id + " not found"));
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.getUserByName(name)
                .orElseThrow(() -> new RuntimeException("User have name " + name + " not found"));
    }
}
