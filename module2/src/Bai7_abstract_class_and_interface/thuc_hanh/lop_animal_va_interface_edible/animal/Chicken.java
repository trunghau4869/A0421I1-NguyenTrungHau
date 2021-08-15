package Bai7_abstract_class_and_interface.thuc_hanh.lớp_animal_va_interface_edible.animal;

import Bai7_abstract_class_and_interface.thuc_hanh.lớp_animal_va_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
