public class OOPs {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColour("blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myACC = new BankAccount();
        myACC.username="Vinit";
        myACC.setPassword("kgf");

    }
}

class BankAccount
{
     public String username;
     private String password;
     public void setPassword(String pwd)
     {
        password=pwd;
     }
}
 class Pen
 {
    String colour;
    int tip;

    void setColour(String newColor)
    {
        colour= newColor;       
    }

    void setTip(int newtip)
    {
        tip=newtip;
    }
 }

 class Student{

    String name;
    int age;
    float percentage;

    void calpercentage(int phy,int chem,int maths)
    {
       percentage=(phy+chem+maths)/3; 
    }
 }