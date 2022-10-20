package com.ilhom.springboot.mapstruct_with_service.repository;



import com.ilhom.springboot.mapstruct_with_service.model.Commerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommerceRepository extends JpaRepository<Commerce, Integer> {

}
