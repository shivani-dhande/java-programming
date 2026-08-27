public class Car extends Vehicle {
    void drive(){
        System.out.println("Car is driving");
    }

    @Override
    void start() {
        System.out.println("Car is starting");
    }
}
