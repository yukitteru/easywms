package net.yukitteru.easywms.dao;

import net.yukitteru.easywms.entity.Brand;
import net.yukitteru.easywms.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ProductDao extends ReactiveMongoRepository<Product, String> {
    Flux<Product> findAll();

    Flux<Product> findByNameOrBrand(String name, Brand brand);

    Flux<Product> findByArticleIn(List<Long> articles);

    Flux<Product> findAllByQuantityIsLessThanEqualOrderByQuantityAsc(BigInteger lastSize);
}
