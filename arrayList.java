import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //add element
        list.add(1);
        list.add(2);
        list.add(3);

        //get element 
        int elemnt= list.get(2);
        System.out.println(list);
        System.out.println(elemnt);

        //delete element
        list.remove(2);
        System.out.println(list);

        //set element
        list.set(1, 10);
        System.out.println(list);

        //contain
        System.out.println(list.contains(10));

        //size of the array list
        System.out.println(list.size());
    }

   
}
