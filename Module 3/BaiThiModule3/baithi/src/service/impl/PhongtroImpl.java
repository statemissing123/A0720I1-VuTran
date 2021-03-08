package service.impl;

import dao.IPhongtroDAO;
import dao.impl.PhongtroDAOImpl;
import model.Phongtro;
import service.IPhongtroService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhongtroImpl implements IPhongtroService {
    //    public static Map<Integer,Phongtro> phongtroMap;
    private IPhongtroDAO phongtroDAO = new PhongtroDAOImpl();

    //    static {
//        phongtroMap = new HashMap<>();
//        phongtroMap.put(1,new Phongtro(1,"vu","0123","02-11-2020","theo quy","khong co"));
//        phongtroMap.put(2,new Phongtro(2,"linh","456","03-11-2020","theo nam","khong co"));
//    }
    @Override
    public List<Phongtro> findAll() {
        List<Phongtro> phongtroList = new ArrayList<>();
        try {
            phongtroList = phongtroDAO.getAllPhongtro();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phongtroList;
    }

    @Override
    public void save(Phongtro phongtro) {
        try {
            phongtroDAO.insertPhongtro(phongtro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Phongtro findById(int id) {
        try {
            return phongtroDAO.getPhongtro(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void remove(int id) {
        try {
            phongtroDAO.deletePhongtro(id);
        } catch (SQLException E) {
            E.printStackTrace();
        }
    }

    @Override
    public List<Phongtro> findByName(String ten) {
        return this.findAll().stream().filter(tro -> tro.getTen().toLowerCase().contains(ten.toLowerCase())).collect(Collectors.toList());
    }


    @Override
    public void insertPhongtro(Phongtro phongtro) {
        try {
            phongtroDAO.insertPhongtro(phongtro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
