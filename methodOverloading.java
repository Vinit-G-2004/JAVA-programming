public class methodOverloading {
    public static void main(String[] args) {
        Calculator clac = new Calculator();
        System.out.println(clac.sum(1,2));
        System.out.println(clac.sum((float)1.5,(float)2.5));
        System.out.println(clac.sum(1,2,3));
    }
}
// Method overloading means multiple functions with the same name but differe

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}