public class Rectangle {
    double width=1.0, height= 1.0;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height= height;
    }
    public double getArea (){
        double area = width*height;
        return area;
    }
    public double getPerimeter(){
        double perimeter= (width+height)*height;
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area is: "+ rectangle.getArea());
        System.out.println("Perimeter is: "+ rectangle.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("Area is: " + rectangle1.getArea());
        System.out.println("Perimeter is:" + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Area is: " + rectangle2.getArea());
        System.out.println("Perimeter is:" + rectangle2.getPerimeter());
    }
}

