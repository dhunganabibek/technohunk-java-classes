package constructor;

class Dog{
    String color = "blue";
    int tail = 2;
    int price = 100;

    public Dog() {
    }

    public Dog(String c, int t, int p){
        color = c;
        tail = t;
        price = p;
    }

}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("yellow",1,89);
//        Dog d1 = new Dog();    default constructor injected by compiler if there is no constructor.
        System.out.println(d);
    }
}
