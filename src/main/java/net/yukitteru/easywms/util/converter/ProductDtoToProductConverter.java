package net.yukitteru.easywms.util.converter;

import net.yukitteru.easywms.dto.ProductDto;
import net.yukitteru.easywms.entity.Brand;
import net.yukitteru.easywms.entity.Product;
import net.yukitteru.easywms.entity.Size;
import org.springframework.core.convert.converter.Converter;

import java.util.Optional;

public class ProductDtoToProductConverter implements Converter<ProductDto, Product> {
    @Override
    public Product convert(ProductDto source) {
        return Product.builder()
                .article(source.getArticle())
                .brand(Optional.of(source.getBrand()).map(Brand::byName).orElse(null))
                .name(source.getName())
                .size(Size.bySizeInteger(source.getSize()))
                .price(source.getPrice())
                .quantity(source.getQuantity())
                .build();
    }
}
