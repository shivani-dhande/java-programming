public class Circle extends Shape {
    int radius=5;

    @Override
    void calculateArea(){
         double area=Math.PI*radius*radius;
         System.out.println("Area of circle= "+area);
    }
}
