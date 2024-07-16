public class abstraction {
    public static void main(String[] args) {
       Horse H = new Horse();
       H.eat();
       H.walk(); 

       Chicken C = new Chicken();
       C.eat();
       C.walk();
    }
}
//hidding of all the unnecessary data and showing only the important parts to the user

abstract class Animal{// Abstract class
    void eat(){
        System.out.println("animals eates");
    }

    abstract void walk();//Abstract function
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 leg");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}