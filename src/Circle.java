public class Circle extends Shape{

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public Circle(){}

    @Override
    public double getPerimeter() {
        return 2*Math.PI*a.getSide(b);
    }

    @Override
    public double getArea() {
        return (Math.PI*Math.pow(a.getSide(b),2));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString(){
        return "Circle\n"+
                "A"+ a.toString() + " B" + b.toString() + "\n" +
                "Perimeter: " + getPerimeter() + " Area: " +getArea() + "\n";
    }
}
