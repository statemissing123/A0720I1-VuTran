package com.codegym.casestudy.Service;

import com.codegym.casestudy.model.service.FuramaService;

import java.util.List;

public interface ServicesService {
    List<FuramaService> findAll();
    void save (FuramaService furamaService);
    FuramaService findById (int id);
}
