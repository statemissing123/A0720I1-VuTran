package com.codegym.giohang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartMap= new HashMap<>();
    public Map<Product,Integer> getCartMap(){
        return cartMap;
    }
    public List<Product> getList() {
        return new ArrayList<>(cartMap.keySet());
    }
    public void addProduct(Product product) {
        if(!cartMap.containsKey(product)){
            cartMap.put(product,1);
        }else {
            int key = cartMap.get(product);
            cartMap.put(product,++key);
        }
    }
    public int getPrice(){
        int price = 0;
        for (Product product : cartMap.keySet()){
            price+= product.getPrice()*cartMap.get(product);
        }
        return price;
    }
}
