package Task1;

public abstract class Animal {

    int age;
    String name;
    char gender;

    public Animal(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public abstract void makeSound();

}
