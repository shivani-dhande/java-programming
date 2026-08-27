public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Tommy";
        System.out.println(dog.name);
        dog.eat();
        dog.bark();
        dog.sleep();

        Cat cat=new Cat();
        cat.name="Kitty";
        System.out.println(cat.name);
        cat.eat();
        cat.meow();
        cat.sleep();
    }
}
