package service.impl;

import model.ProductManga;
import service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    public static Map<Integer,ProductManga> productMangaMap;

    static {
        productMangaMap = new HashMap<>();
        productMangaMap.put(1,new ProductManga(1,"One Piece","Oda","Japan","1000 Chapter"));
        productMangaMap.put(2,new ProductManga(2,"Naruto","Kishimoto","Japan","900 Chapter"));
        productMangaMap.put(3,new ProductManga(3,"Hunter x Hunter","Togashi","Japan","234 Chapter"));
    }
    @Override
    public List<ProductManga> findAll() {
        return new ArrayList<>(productMangaMap.values());
    }

    @Override
    public void save(ProductManga productManga) {
        productMangaMap.put(productManga.getId(),productManga);
    }

    @Override
    public ProductManga findById(int id) {
        return productMangaMap.get(id);
    }

    @Override
    public void update(int id, ProductManga productManga) {
        productMangaMap.put(id,productManga);
    }

    @Override
    public void remove(int id) {
        productMangaMap.remove(id);
    }
}
