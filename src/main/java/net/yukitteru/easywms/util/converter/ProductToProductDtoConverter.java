package net.yukitteru.easywms.util.converter;

import net.yukitteru.easywms.dto.ProductDto;
import net.yukitteru.easywms.entity.Brand;
import net.yukitteru.easywms.entity.Product;
import net.yukitteru.easywms.entity.Size;
import org.springframework.core.convert.converter.Converter;

import java.util.Objects;
import java.util.Optional;

public class ProductToProductDtoConverter implements Converter<Product, ProductDto> {
    @Override
    public ProductDto convert(Product source) {
        return ProductDto.builder()
                .article(source.getArticle())
                .brand(Objects.requireNonNull(Optional.ofNullable(source.getBrand()).map(Brand::getBrandName).orElse(null)))
                .name(source.getName())
                .size(Objects.requireNonNull(Optional.ofNullable(source.getSize()).map(Size::getSizeInteger).orElse(null)))
                .price(source.getPrice())
                .quantity(source.getQuantity())
                .build();
    }
}
