package dao.impl;

import dao.IProductDAO;
import model.ProductManga;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAOImpl implements IProductDAO {
    private static final String INSERT_PRODUCT_SQL = "Insert into truyen(idTruyen, tentruyen, tacgia, sochuong,quocgia) values (?, ?, ?, ?,?)";
    private static final String SELECT_PRODUCT_BY_ID = "Select * from truyen where id = ?";
    private static final String SELECT_ALL_PRODUCT = "Select * from truyen";
    private static final String DELETE_PRODUCT_BY_ID = "Delete from truyen where id = ?";
    private static final String UPDATE_PRODUCT = "Update Truyen set tentruyen = ?, tacgia = ?, sochuong = ? , quocgia = ? where id = ?";


    @Override
    public void insertProduct(ProductManga productManga) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);

        preparedStatement.setInt(1, productManga.getId());
        preparedStatement.setString(2, productManga.getNameManga());
        preparedStatement.setString(3, productManga.getAuthor());
        preparedStatement.setString(4, productManga.getEpisodes());
        preparedStatement.setString(5,productManga.getNation());

        preparedStatement.executeUpdate();

    }

    @Override
    public ProductManga getProductManga(int id) throws SQLException {
        ProductManga productManga = null;

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String nameManga = resultSet.getNString("tentruyen");
            String episodes = resultSet.getNString("sochuong");
            String author = resultSet.getNString("tacgia");
            String nation = resultSet.getNString("nation");

            productManga = new ProductManga(id, nameManga, nation, episodes, author);
        }

        return productManga;
    }

    @Override
    public List<ProductManga> getAllProduct() throws SQLException {
        List<ProductManga> productMangaList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nameManga = resultSet.getNString("tentruyen");
            String episodes = resultSet.getNString("sochuong");
            String author = resultSet.getNString("tacgia");
            String nation = resultSet.getNString("nation");

            productMangaList.add(new ProductManga(id, nameManga, episodes, author, nation));
        }

        return productMangaList;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateProduct(ProductManga productManga) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
        preparedStatement.setInt(1,productManga.getId());
        preparedStatement.setString(2,productManga.getNameManga());
        preparedStatement.setString(3,productManga.getAuthor());
        preparedStatement.setString(4,productManga.getNation());
        preparedStatement.setString(5,productManga.getEpisodes());
        return preparedStatement.executeUpdate() > 0;
    }
}


