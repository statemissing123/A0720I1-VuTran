package service;

import model.ProductManga;

import java.util.List;

public interface ProductService {
    List<ProductManga> findAll();

    void save (ProductManga productManga);

    ProductManga findById(int id);

    void update(int id, ProductManga productManga);
    void remove(int id);
    List<ProductManga> findByName(String nameManga);
}
