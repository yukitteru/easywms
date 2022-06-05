package net.yukitteru.easywms.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@RequiredArgsConstructor
@Getter
public enum Brand {
    ENGLISH_LAUNDRY("ENGLISH LAUNDRY"),
    LACOSTE("LACOSTE"),
    DOLCE("DOLCE & GABBANA Dolce");

    private final String brandName;

    public static Brand byName(String brandName) {
        Objects.requireNonNull(brandName);
        return Arrays.stream(values())
                .filter(brand -> brand.getBrandName().equalsIgnoreCase(brandName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Cannot find brand by %s", brandName)));
    }
}
