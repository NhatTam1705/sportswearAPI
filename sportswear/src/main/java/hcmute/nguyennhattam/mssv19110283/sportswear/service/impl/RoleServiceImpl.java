package hcmute.nguyennhattam.mssv19110283.sportswear.service.impl;

import hcmute.nguyennhattam.mssv19110283.sportswear.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:56 PM
 * Filename : CategoryServiceImpl
 */
@Slf4j
@Service
public class RoleServiceImpl implements RoleService {
    private final CategoryRepository categoryRepository;

    public RoleServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository= categoryRepository;
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.getCategoryByName(name)
                .orElseThrow(() -> new RuntimeException("Category have name " + name + " not found"));
    }
}
