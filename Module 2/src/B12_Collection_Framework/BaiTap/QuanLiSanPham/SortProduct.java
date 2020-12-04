package B12_Collection_Framework.BaiTap.QuanLiSanPham;

import java.util.Comparator;

public class SortProduct implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice()>o2.getPrice()){
            return 1;
        }else if (o1.getPrice()==o2.getPrice()){
            return 0;
        }else {
            return -1;
        }
    }
}
