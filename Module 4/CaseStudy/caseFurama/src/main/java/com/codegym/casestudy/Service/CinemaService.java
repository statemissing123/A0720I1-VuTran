package com.codegym.casestudy.Service;

import com.codegym.casestudy.model.Cinema;
import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CinemaService {
    Page<Cinema> findAll(Pageable pageable);
    void save(Cinema cinema);
    void delete(int id);
    Cinema findById(int id);
    Page<Cinema>findAllByPriceContaining(Long price,Pageable pageable);
}
