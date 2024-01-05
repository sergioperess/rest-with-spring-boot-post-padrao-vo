package com.example.restwithspringboot.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    // O -> origem; D -> destino
    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<D>();

        for (O o : origin) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
}
