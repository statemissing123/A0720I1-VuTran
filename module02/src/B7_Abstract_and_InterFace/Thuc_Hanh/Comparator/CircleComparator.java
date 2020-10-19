package B7_Abstract_and_InterFace.Thuc_Hanh.Comparator;

import B6_Ke_Thua.Bai_Tap.Circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
