package ca.ardeshir.main.Animal;

public class Cat implements Animal, Pet {


    Toy toy;

    public Cat() {
        toy = new Toy("fish boy", "black");
    }

    public Cat(Toy toy) {
        this.toy = toy;

    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void makeSound() {
        System.out.println("meow meow");
    }

    public void eat() {
        System.out.println("I am eating tuna");
    }

    @Override
    public void wash() {

        System.out.println("I lick myself");

    }

    @Override
    public void cuddle() {
        System.out.println();

    }

    @Override
    public void feed() {
        System.out.println("Yummy!");

    }

    public void move() {
        System.out.println("I prefer not to move");
    }
}
