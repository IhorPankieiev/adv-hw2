package Task2;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list = doubleValues(list);

        for (String s : list) {
            System.out.println(s);;
        }

    }//main

    public static List<String> doubleValues(List<String> list){
        List<String> listWithDoubleValue = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listWithDoubleValue.add(list.get(i));
            listWithDoubleValue.add(list.get(i));
        }
        return listWithDoubleValue;
    }
}//class
