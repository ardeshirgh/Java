package ca.ardeshir.main.Area;

public class Square extends Shape {

    private double lenght;

    public Square() {
        super("Square shape");
    }

    public Square(String name, double lenght) {
        super(name);
        this.lenght = lenght;
    }

    public Square(double lenght) {
        this.lenght = lenght;
    }


    @Override
    public double area() {
        return lenght * lenght;
    }

    @Override
    public double perimeter() {
        return 4 * lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
