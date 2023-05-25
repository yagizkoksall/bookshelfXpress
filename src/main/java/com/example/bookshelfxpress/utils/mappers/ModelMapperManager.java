package com.example.bookshelfxpress.utils.mappers;


import com.example.bookshelfxpress.utils.mappers.ModelMapperService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public class ModelMapperManager implements ModelMapperService {
    private final ModelMapper mapper;

    public ModelMapperManager(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ModelMapper forResponse() {
        mapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        return mapper;
    }

    @Override
    public ModelMapper forRequest() {
        mapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        return mapper;
    }
}
