package Task1;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog(3, "Balkan", 'M');
        Animal frog = new Frog(1, "Cermit", 'M');
        Animal cat = new Cat(4, "Lisa", 'F');
        Animal kitten = new Kitten(1, "Dora", 'F');
        Animal tomcat = new Tomcat(3, "Dusty", 'M');

        Animal[] animals = new Animal[]{dog, frog, cat, kitten, tomcat};

        for(Animal animal : animals) {
            System.out.printf("Animal with name %s is %d years old and gender %s\n", animal.name, animal.age, animal.gender);
            animal.makeSound();
        }

    }

}
