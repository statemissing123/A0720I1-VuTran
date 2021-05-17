package com.codegym.casestudy.Repository;

import com.codegym.casestudy.model.Cinema;
import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
    Page<Cinema> findAll(Pageable pageable);
    Page<Cinema> findAllByPriceContaining(Long price , Pageable pageable);
}
