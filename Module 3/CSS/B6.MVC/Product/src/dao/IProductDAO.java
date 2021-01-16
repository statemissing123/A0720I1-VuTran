package dao;

import model.ProductManga;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {

    public void insertProduct(ProductManga productManga) throws SQLException;
    public ProductManga getProductManga(int id) throws SQLException;

    public List<ProductManga> getAllProduct() throws SQLException;

    public boolean deleteProduct(int id) throws SQLException;

    public boolean updateProduct(ProductManga productManga ) throws SQLException;
}

