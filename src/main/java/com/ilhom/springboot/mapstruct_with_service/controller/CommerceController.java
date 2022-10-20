package com.ilhom.springboot.mapstruct_with_service.controller;


import javax.validation.Valid;
import java.util.List;


import com.ilhom.springboot.mapstruct_with_service.dto.CommerceDto;
import com.ilhom.springboot.mapstruct_with_service.service.CommerceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/commerce")
@RequiredArgsConstructor
public class CommerceController {

    private final CommerceService commerceService;

    @GetMapping
    public List<CommerceDto> getList() {
        return commerceService.getList();
    }

    @GetMapping("/{id}")
    public CommerceDto getItem(@PathVariable(value = "id") Integer id) {
        return commerceService.getItem(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody @Valid CommerceDto commerceDto) {
        commerceService.save(commerceDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable(value = "id") Integer id) {
        commerceService.deleteItem(id);
    }

}
