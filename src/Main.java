public class Main {

    public static void main(String[]args){

        Desk desk= new Desk(4);
        desk.addShape(new Circle(new Point(2,8),new Point(9,7)));
        desk.addShape(new Triangle(new Point(2,8),new Point(9,7),new Point(8,11)));
        desk.addShape(new Quad(new Point(2,5),new Point(9,7),new Point(15,8),new Point(9,17)));
        desk.addShape(new Circle(new Point(2,8),new Point(9,7)));
        desk.showAll();
    }
}
