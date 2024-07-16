public class bitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }

    public static void getBit(int n,int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println("The bit at ith position is 0");
        } else {
            System.out.println("The bit at ith position is 1");
        }
    }

    public static int setBit(int n,int i)
    {
        int bitMask= 1<<i;
        return n|bitMask;
    }

    public static int clearBit(int n,int i)
    {
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int updateBit(int n,int i,int newBit)
    {
        if(newBit==0)
        {
            return clearBit(n, i);
        }
        else
        {
            return setBit(n,i);
        }
    }

    public static void main(String[] args) {
        System.out.println(5 & 6);// AND operation in binary
        System.out.println(5 | 6);// OR operation in binary
        System.out.println(5 ^ 6);// XOR operation in binary
        System.out.println(~5);// once copliment(NOT) in binary
        System.out.println(5 << 2);// Left shift
        System.out.println(5 >> 2);// Right Shift
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(2);
        getBit(10,2);
        getBit(11,3);
        System.out.println(setBit(0,2));
        System.out.println(clearBit(10,1));
        System.out.println(updateBit(10, 2, 1));
        System.out.println(updateBit(11, 2, 0));

    }
}
