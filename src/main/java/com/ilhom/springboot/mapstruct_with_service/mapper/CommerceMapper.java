package com.ilhom.springboot.mapstruct_with_service.mapper;



import com.ilhom.springboot.mapstruct_with_service.dto.CommerceDto;
import com.ilhom.springboot.mapstruct_with_service.model.Commerce;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface CommerceMapper {

    CommerceDto toDTO(Commerce commerce);

    Commerce toEntity(CommerceDto commerceDto);

}
