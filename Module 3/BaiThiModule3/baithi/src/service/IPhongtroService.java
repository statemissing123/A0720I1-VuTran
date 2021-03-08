package service;

import model.Phongtro;

import java.util.List;

public interface IPhongtroService {
    List<Phongtro> findAll();

    void save (Phongtro phongtro);

    Phongtro findById(int id);

    void remove(int id);
    List<Phongtro> findByName(String ten);
    void insertPhongtro(Phongtro phongtro);
}
