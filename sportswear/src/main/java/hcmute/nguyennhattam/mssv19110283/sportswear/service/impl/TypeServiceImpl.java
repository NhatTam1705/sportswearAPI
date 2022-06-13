package hcmute.nguyennhattam.mssv19110283.sportswear.service.impl;

import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Type;
import hcmute.nguyennhattam.mssv19110283.sportswear.repositories.TypeRepository;
import hcmute.nguyennhattam.mssv19110283.sportswear.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:49 PM
 * Filename : TypeServiceImpl
 */
@Slf4j
@Service
public class TypeServiceImpl implements TypeService {
    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }


}
