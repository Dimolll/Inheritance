public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){}

    @Override
    public double getPerimeter() {
        return (a.getSide(b)+b.getSide(c)+c.getSide(a));
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt((p - a.getSide(b)) * (p - b.getSide(c)) * (p - c.getSide(a)));
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString(){
        return "Triangle\n"+
                "A"+ a.toString() + " B" + b.toString() + " +C" + c.toString() + " D" + "\n" +
                "Perimeter: " + getPerimeter() + " Area: " +getArea() + "\n";
    }
}
