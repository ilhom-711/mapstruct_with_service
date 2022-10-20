package com.ilhom.springboot.mapstruct_with_service.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class CommerceDto {

    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String department;
    private int salary;
}
