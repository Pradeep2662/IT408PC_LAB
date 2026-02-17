class L3P3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
