public class Desk {
    private Shape[] shapes;
    private int top;

    public Desk() {
        shapes= new Shape[4];
        top = 0;
    }

    public void addShape(Shape shape){
        if(top<4)
            shapes[top++]=shape;
        else
            System.out.println("Desk is full");
    }

    public Shape delShape(int count){
        if(top>0)
            return shapes[top--];
        else{
            System.out.println("Desk is empty");
            return null;
        }
    }

    public String showAll(){
        double allArea=0;
        String outputInfo="";
        for(int i=0;i<top; i++) {
            if(shapes[i]!=null) {
                outputInfo = outputInfo + shapes[i].toString()+"\n";
                allArea += shapes[i].getArea();
            } else {
                return "Empty";
            }

        }
        return outputInfo + "Area of all shapes: " + allArea;
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
