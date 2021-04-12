package com.codegym.dienthoai.service.impl;

import com.codegym.dienthoai.model.Smartphone;
import com.codegym.dienthoai.repository.SmartRepository;
import com.codegym.dienthoai.service.SmartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartServiceImpl implements SmartService {
    @Autowired
    private SmartRepository smartRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartRepository.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        return smartRepository.findById(id).orElse(null);

    }

    @Override
    public Smartphone save(Smartphone phone) {
        smartRepository.save(phone);
        return phone;
    }

    @Override
    public void remove(Integer id) {
        smartRepository.deleteById(id);
    }
}
