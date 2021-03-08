package dao.impl;

import dao.IPhongtroDAO;
import model.Phongtro;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongtroDAOImpl implements IPhongtroDAO {
    private static final String INSERT_PHONGTRO_SQL = "Insert into Phongtro(id,maphongtro, ten, sdt, ngaythue,thanhtoan,ghichu) values (?, ?, ?, ?)";
    private static final String SELECT_PHONGTRO_BY_ID = "Select * from Phongtro where id = ?";
    private static final String SELECT_ALL_PHONGTRO = "Select * from Phongtro";
    private static final String DELETE_nguoithue_BY_ID = "Delete from Phongtro where id = ?";

    @Override
    public void insertPhongtros(Phongtro phongtro) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PHONGTRO_SQL);

        preparedStatement.setInt(1, phongtro.getId());
        preparedStatement.setString(2, phongtro.getMaphongtro());
        preparedStatement.setString(3, phongtro.getTen());
        preparedStatement.setString(4, phongtro.getSdt());
        preparedStatement.setString(5, phongtro.getNgayThue());
        preparedStatement.setString(6, phongtro.getThanhtoan());
        preparedStatement.setString(7, phongtro.getGhichu());

        preparedStatement.executeUpdate();
    }

    @Override
    public Phongtro getPhongtro(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Phongtro> getAllPhongtro() throws SQLException {
        List<Phongtro> phongtroList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PHONGTRO);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String maphongtro = resultSet.getNString("maphongtro");
            String ten = resultSet.getNString("ten");
            String sdt = resultSet.getNString("sdt");
            String ngayThue = resultSet.getNString("ngaythue");
            String thanhtoan = resultSet.getNString("thanhtoan");
            String ghichu = resultSet.getNString("ghichu");

            phongtroList.add(new Phongtro(id, maphongtro, ten, sdt, ngayThue, thanhtoan, ghichu));
        }

        return phongtroList;
    }

    @Override
    public boolean deletePhongtro(int id) throws SQLException {
        return false;
    }


    @Override
    public Phongtro getCusById(int id) {
        return null;
    }

    @Override
    public void insertPhongtro(Phongtro phongtro) throws SQLException {

    }
}
