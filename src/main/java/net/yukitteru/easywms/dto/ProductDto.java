package net.yukitteru.easywms.dto;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"article", "size"})
public class ProductDto {
    @NonNull
    private Long article;

    @NonNull
    private String name;

    @NonNull
    private String brand;

    @NonNull
    private BigDecimal price;

    @NonNull
    private Integer size;

    @NonNull
    private BigInteger quantity;
}
