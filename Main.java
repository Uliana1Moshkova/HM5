import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> Arraylist = new MyList<>();

        Arraylist.add(34);
        Arraylist.add(123);
        Arraylist.add(56);
        Arraylist.add(12);
        Arraylist.add(32870);
        Arraylist.add(871);
        Arraylist.add(-396);

        System.out.println("Max number in list is" + Arraylist.max() );
        System.out.println("Main number in list is" + Arraylist.min() );


    }
}
