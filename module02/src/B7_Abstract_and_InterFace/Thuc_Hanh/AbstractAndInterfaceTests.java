package B7_Abstract_and_InterFace.Thuc_Hanh;

import B7_Abstract_and_InterFace.Thuc_Hanh.Animal.Animal;
import B7_Abstract_and_InterFace.Thuc_Hanh.Animal.Chicken;
import B7_Abstract_and_InterFace.Thuc_Hanh.Animal.Tiger;
import B7_Abstract_and_InterFace.Thuc_Hanh.Edible;
import B7_Abstract_and_InterFace.Thuc_Hanh.Fruit.Apple;
import B7_Abstract_and_InterFace.Thuc_Hanh.Fruit.Fruit;
import B7_Abstract_and_InterFace.Thuc_Hanh.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
