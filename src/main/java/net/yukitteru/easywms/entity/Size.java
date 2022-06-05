package net.yukitteru.easywms.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@RequiredArgsConstructor
@Getter
public enum Size {
    SIZE_50(50), SIZE_100(100);

    private final Integer sizeInteger;

    public static Size bySizeInteger(Integer sizeInteger) {
        Objects.requireNonNull(sizeInteger);
        return Arrays.stream(values())
                .filter(size -> size.getSizeInteger().equals(sizeInteger))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Cannot find size by %s", sizeInteger)));
    }
}
