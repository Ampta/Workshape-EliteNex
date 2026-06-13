package day_3.Area_Calculator;

public class Square extends Shape{
    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }
}
