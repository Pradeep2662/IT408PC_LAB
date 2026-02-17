class L3P5 {
    public static void main(String args[]) {
        System.out.println("Tiger class");

        tiger t = new tiger();
        t.sound();
        t.behave();
    }
}

abstract class Animal {
    abstract void sound();
}

abstract class lion extends Animal {
    abstract void behave();
}

class tiger extends lion {
    public void sound() {
        System.out.println("Roar");
    }

    public void behave() {
        System.out.println("Wild");
    }
}
