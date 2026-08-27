public class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
