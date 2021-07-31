package Bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    private  double a,b,c;

    public XayDungLopQuadraticEquation() {

    }

    public XayDungLopQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double  getDiscriminant(){
        double delta=(b*b)-(4*a*c);
        return  delta;
    }
    public  double getRoot1(){
        double r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        return r1;
    }
    public  double getRoot2(){
        double r2 =(-b-Math.sqrt(b*b-4*a*c))/2*a;
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so a");
        double a=sc.nextDouble();
        System.out.println("nhap so b");
        double b=sc.nextDouble();
        System.out.println("nhap so c");
        double c=sc.nextDouble();
        XayDungLopQuadraticEquation QuadraticEquation=new XayDungLopQuadraticEquation(a,b,c);
        if(QuadraticEquation.getDiscriminant()>0){
        System.out.println("phuong trinh co 2 nghiem x1= "+QuadraticEquation.getRoot1()+" x2 = "+QuadraticEquation.getRoot2());
        }else if(QuadraticEquation.getDiscriminant()==0){
            System.out.println("phuong trinh co nghiem kep x1 = x2 = "+QuadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}

