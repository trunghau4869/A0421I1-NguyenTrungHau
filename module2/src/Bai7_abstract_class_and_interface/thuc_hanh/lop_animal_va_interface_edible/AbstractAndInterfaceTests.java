package Bai7_abstract_class_and_interface.thuc_hanh.lop_animal_va_interface_edible;

import Bai7_abstract_class_and_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Apple;
import Bai7_abstract_class_and_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Fruit;
import Bai7_abstract_class_and_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
