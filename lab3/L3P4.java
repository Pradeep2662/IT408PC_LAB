import java .util.*;
class L3P4{
    public static void main(String args[]){
        Animal a ;
        a=new lion();
        a.sound();
        a=new Tiger();
        a.sound();
    }
}
abstract class Animal {
    abstract void sound();
}
class lion extends Animal{
    public void sound(){
        System.out.println("Roar");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("raawwwr!!");
    }
}