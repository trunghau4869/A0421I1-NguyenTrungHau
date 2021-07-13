package Bai1_introduction_to_java.thuc_hanh.tinh_chi_so_can_nang_co_the;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
        double weight = scanner.nextDouble();
        System.out.print("Your height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
}}
