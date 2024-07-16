public class hierachial {
    public static void main(String[] args) {
        Birds crow=new Birds();
        crow.eat();
        crow.breathe();
        crow.Fly();
    }
}

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
    void runs()
    {
        System.out.println("Walk");
    }

}

class Birds extends Animal
{
    int wings;
    void Fly()
    {
        System.out.println("Fly");
    }
}

class Fish extends Animal
{
    int fins;
    void swims()
    {
        System.out.println("swims");
    }
    
}