package Task1;

public class Frog extends Animal {

    public Frog(int age, String name, char gender) {
        super (age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Croak");
    }
}
