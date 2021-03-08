package dao;

import model.Phongtro;

import java.sql.SQLException;
import java.util.List;

public interface IPhongtroDAO {
    public void insertPhongtros(Phongtro phongtro) throws SQLException;

    public Phongtro getPhongtro(int id) throws SQLException;

    public List<Phongtro> getAllPhongtro() throws SQLException;

    public boolean deletePhongtro(int id) throws SQLException;

    public Phongtro getCusById(int id);

    public void insertPhongtro(Phongtro phongtro) throws SQLException;
}

