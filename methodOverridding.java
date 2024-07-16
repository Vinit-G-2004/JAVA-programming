public class methodOverridding {
    public static void main(String[] args) {
        Deer D= new Deer();
        D.eat();
        Animal dog = new Animal();
        dog.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
