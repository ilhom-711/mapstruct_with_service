package com.ilhom.springboot.mapstruct_with_service.service;

import java.util.List;
import java.util.stream.Collectors;


import com.ilhom.springboot.mapstruct_with_service.dto.CommerceDto;
import com.ilhom.springboot.mapstruct_with_service.mapper.CommerceMapper;
import com.ilhom.springboot.mapstruct_with_service.repository.CommerceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommerceService {

    private final CommerceMapper mapper;
    private final CommerceRepository repository;

    @Transactional(readOnly = true)
    public List<CommerceDto> getList() {
        var list = repository.findAll();
        return list.stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CommerceDto getItem(Integer id) {
        var commerce = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Commerce item with id: %d not found", id)));
        return mapper.toDTO(commerce);
    }

    @Transactional
    public void save(CommerceDto commerceDto) {
        var commerce = mapper.toEntity(commerceDto);
        repository.save(commerce);
    }

    @Transactional
    public void deleteItem(Integer id) {
        repository.deleteById(id);
    }
}
