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
        return getSide(a,b)+getSide(b,c)+getSide(c,d)+getSide(a,d);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt((p - getSide(a, b)) * (p - getSide(b, c)) * (p - getSide(c, d)) * (p - getSide(a, d)));
    }


    private double getSide(Point a, Point b){
        return Math.sqrt(Math.pow((a.getX()-b.getX()),2)+ Math.pow((a.getY()-b.getY()),2));
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
