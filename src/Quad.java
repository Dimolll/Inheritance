public class Quad extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quad(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quad(){}

    @Override
    public double getPerimeter() {
        return a.getSide(b)+b.getSide(c)+c.getSide(d)+d.getSide(a);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt((p - a.getSide(b)) * (p - b.getSide(c)) * (p - c.getSide(d)) * (p - d.getSide(d)));
    }


    public void setA(Point a) {
        this.a = a;
    }

    public Point getA() {
        return a;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString(){
        return "Quad\n"+
                "A"+ a.toString() + " B" + b.toString() + " +C" + c.toString() + " D" + d.toString() +"\n" +
                "Perimeter: " + getPerimeter() + " Area: " +getArea() + "\n";
    }
}
