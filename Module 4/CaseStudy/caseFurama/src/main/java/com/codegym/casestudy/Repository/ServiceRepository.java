package com.codegym.casestudy.Repository;

import com.codegym.casestudy.model.service.FuramaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<FuramaService,Integer> {
}
