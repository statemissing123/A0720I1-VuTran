package com.codegym.casestudy.Service.impl;

import com.codegym.casestudy.Repository.ServiceRepository;
import com.codegym.casestudy.Service.ServicesService;
import com.codegym.casestudy.model.service.FuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<FuramaService> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void save(FuramaService furamaService) {
        serviceRepository.save(furamaService);
    }

    @Override
    public FuramaService findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }
}
