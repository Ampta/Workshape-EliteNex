package day_3.Area_Calculator;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14 * radius * radius;
    }
}
