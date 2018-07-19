public class Desk {
    private Shape[] shapes;
    private int top;

    public Desk(int size) {
        shapes= new Shape[size];
        top = 0;
    }

    public Desk(){}

    public void addShape(Shape shape){
        shapes[top++]=shape;
    }

    public Shape delShape(int count){
        return shapes[top--];
    }

    public void showAll(){
        double allArea=0;
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null) {
                System.out.println(shapes[i].toString());
                allArea += shapes[i].getArea();
            } else {
                System.out.println("Empty");
            }

        }
        System.out.println("Area of all shapes: " + allArea);
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
