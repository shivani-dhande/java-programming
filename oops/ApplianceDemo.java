public class ApplianceDemo {
    public static void main(String[] args){
        Appliance appliance1 = new WashingMachine();
        appliance1.turnOn();
        appliance1.showMessage();

        Appliance appliance2 = new Television();
        appliance2.turnOn();
        appliance2.showMessage();

        Television tv = new Television();
        tv.showChannel();
    }
}
