//Single level inheritance
public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base class
class Animal{
    String color;
    void eat()
    {
        System.out.println("eats");
    }

    void breathe()
    {
        System.out.println("breathes");
    }
}

//Derived class

class Fish extends Animal
{
    int fins;
    void swims()
    {
        System.out.println("Swims in water");
    }
}