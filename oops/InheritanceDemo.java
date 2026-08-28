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

        Animal animal1=new Dog();
        animal1.eat();
        Animal animal2=new Cat();
        animal2.eat();

        Animal[] animals={
                new Dog(),
                new Cat(),
                new Dog()
        };
        for(int i=0;i<animals.length;i++){
            animals[i].eat();
        }
    }
}
