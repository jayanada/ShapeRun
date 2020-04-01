abstract class Shape {

    private double length;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {

       return length;
    }

    public abstract void calArea();

    public abstract void calCircumference();

}

class Circle extends Shape {

    static final double pi = 3.14;

    @Override
    public void calArea() {
        System.out.println("Area of the circle is "+pi*(super.getLength()*super.getLength()));

    }

    @Override
    public void calCircumference() {
        System.out.println("Circumference of the circle is " +2*pi*super.getLength());
    }
}


public class ShapeRun {
    public static void main(String[] args) {

       Circle shape1 = new Circle();
       shape1.setLength(5.8);

       shape1.calArea();
       shape1.calCircumference();

    }
}
