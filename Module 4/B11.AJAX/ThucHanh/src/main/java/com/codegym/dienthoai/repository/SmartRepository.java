package com.codegym.dienthoai.repository;

import com.codegym.dienthoai.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartRepository extends CrudRepository<Smartphone,Integer> {
}
