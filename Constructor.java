public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Vinit";
        s1.roll=21;
        s1.password="sdshdgshd";

        Student s2=new Student(s1);
        Student s3 =new Student("Roman");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student
{
    String name;
    int roll;
    String password;

    Student(Student s1)//copy constuctor
    {
        this.name=s1.name;
        this.roll=s1.roll;
        this.password=s1.password;
    }

    Student()// non-parameterized constuctor
    {
        System.out.println("constructor is called");
    }

    Student( String name)//parameterized constuctor
    {
        this.name= name;
        

    }
}