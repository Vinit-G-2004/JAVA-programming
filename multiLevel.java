public class multiLevel {
    public static void main(String[] args) {
       Dog  sheru= new Dog();
       sheru.eat();
       sheru.breathe();
       sheru.legs=4;
       System.out.println(sheru.legs);
       sheru.breed="pitbull";
       System.out.println(sheru.breed);
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

class Mammal extends Animal
{
    int legs;

}

class Dog extends Mammal
{
    String breed;
}

