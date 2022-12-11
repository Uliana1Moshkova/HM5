import java.util.ArrayList;

public class MyList <T extends Number> {

 ArrayList<T> List = new ArrayList<>();

 T value;

 public void add(T value) {
  List.add(value);
 }

 public T max() {

  T value = List.get(0);
  {
   for (int i = 0; i < List.size(); i++) {
    if (List.get(i).doubleValue() > value.doubleValue()) {
     value = List.get(i);
    }
   }
   }

   return value;

  }
  public T min () {

   value = List.get(0);
   {
    for (int i = 1; i < List.size(); i++) {
     if (List.get(i).doubleValue() < value.doubleValue()) {
      value = List.get(i);
     }
    }
    return value;
   }
  }

}
