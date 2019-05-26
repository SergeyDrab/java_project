package ru.exp.project.sandbox;

public class MyFirstProgram  {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    Square s = new Square(5);

    System.out.println("Площадь кадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(4,8);
    Point p2 = new Point(1,2);

    System.out.println("Расстояние между точками " + p1.x + "," + p1.y + " и " + p2.x + "," + p2.y + " = " + p1.distance(p2));
  }



}
