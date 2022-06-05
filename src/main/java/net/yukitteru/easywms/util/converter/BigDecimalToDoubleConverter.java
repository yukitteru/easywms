package net.yukitteru.easywms.util.converter;

import org.springframework.core.convert.converter.Converter;

import java.math.BigInteger;

public class BigDecimalToDoubleConverter implements Converter<BigInteger, Integer> {
    @Override
    public Integer convert(BigInteger source) {
        return source.intValue();
    }
}
