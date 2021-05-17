package com.codegym.casestudy.Service.impl;

import com.codegym.casestudy.Repository.CinemaRepository;
import com.codegym.casestudy.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CinemaService implements com.codegym.casestudy.Service.CinemaService {

    @Autowired
    CinemaRepository cinemaRepository;
    @Override
    public Page<Cinema> findAll(Pageable pageable) {
        return cinemaRepository.findAll(pageable);
    }

    @Override
    public void save(Cinema cinema) {
        cinemaRepository.save(cinema);
    }

    @Override
    public void delete(int id) {
        cinemaRepository.deleteById(id);
    }

    @Override
    public Cinema findById(int id) {
        return cinemaRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Cinema> findAllByPriceContaining(Long price, Pageable pageable) {
        return cinemaRepository.findAllByPriceContaining(price,pageable);
    }
}
