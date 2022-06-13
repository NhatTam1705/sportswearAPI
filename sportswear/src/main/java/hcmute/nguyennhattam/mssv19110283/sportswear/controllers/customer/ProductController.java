package hcmute.nguyennhattam.mssv19110283.sportswear.controllers.customer;

import hcmute.nguyennhattam.mssv19110283.sportswear.dto.ProductDTO;
import hcmute.nguyennhattam.mssv19110283.sportswear.entities.Product;
import hcmute.nguyennhattam.mssv19110283.sportswear.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Create by: IntelliJ IDEA
 * User     : NhatTam
 * Date     : Wed, 6/1/2022
 * Time     : 11:09 AM
 * Filename : ProductController
 */
@RestController
@RequestMapping("api/tv")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @PostMapping("/product/save")
    public ResponseEntity<Product> insertProduct(@RequestBody ProductDTO productDTO) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/tv/product/save").toUriString());
        return ResponseEntity.created(uri).body(productService.createProduct(productDTO));
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> modifyProduct(@PathVariable String id, @RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.modifyProduct(id, productDTO), HttpStatus.OK);
    }
}
