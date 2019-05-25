package ru.exp.project.sandbox;

public class MyFirstProgram  {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    double l =5;

    System.out.println("Площадь кадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;

    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));

    System.out.println();
  }

  public static double area (double l){
    return l * l;
  }

  public static double area (double a, double b){
    return a * b;
  }
  
}
