class L3P2 extends L3P1 {
    static int neu;

    public static void display() {
        System.out.println(view + neu);
    }

    public static int show() {
        return (view + neu);
    }

    public void pearl() {
        System.out.println("I am a child of parent class");
    }

    public static void main(String[] args) {
        view = 10;
        neu = 5;

        display();
        System.out.println(show());

        L3P2 obj = new L3P2();
        obj.pearl();
    }
}
