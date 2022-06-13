package hcmute.nguyennhattam.mssv19110283.sportswear.service.impl;

import hcmute.nguyennhattam.mssv19110283.sportswear.dto.ProductDTO;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Product;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Type;
import hcmute.nguyennhattam.mssv19110283.sportswear.exceptions.NotFoundException;
import hcmute.nguyennhattam.mssv19110283.sportswear.repositories.ProductRepository;
import hcmute.nguyennhattam.mssv19110283.sportswear.repositories.TypeRepository;
import hcmute.nguyennhattam.mssv19110283.sportswear.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Thu, 5/5/2022
 * Time     : 1:37 PM
 * Filename : ProductServiceImpl
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    private final TypeRepository typeRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product have id " + id + " not found"));
    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        Boolean productExist = productRepository.findByName(productDTO.getName()).isPresent();

        if (productExist) {
            throw new IllegalStateException("Product already!");
        }

        Type type = typeRepository.findByName(productDTO.getType().getName())
                .orElseThrow(() -> new NotFoundException(String.format("Type not exist!")));

        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setImage(productDTO.getImage());
        product.setType(type);

        productRepository.save(product);

        return product;
    }

    @Override
    public Product modifyProduct(String id, ProductDTO productDTO) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Product not exist!")));

        Type type = typeRepository.findByName(productDTO.getType().getName())
                .orElseThrow(() -> new NotFoundException(String.format("Type not exist!")));

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setImage(productDTO.getImage());
        product.setType(type);
        productRepository.save(product);
        return product;
    }
}
