package Task1;

public class Cat extends Animal{

    public Cat(int age, String name, char gender) {
        super (age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

}
