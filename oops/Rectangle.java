public class Rectangle extends Shape{
    int length=10;
    int width=4;

    @Override
    void calculateArea(){
        int area=length*width;
        System.out.println("Area of rectangle= "+area);
    }
}
