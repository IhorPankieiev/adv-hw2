package Task4;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("New York", "Johnson");
        map.put("London", "Dickenson");
        map.put("Sydney", "Cave");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city name:");
        String ent = sc.nextLine();

        if(map.containsKey(ent)){
            System.out.println(map.get(ent));
        }
        else {
            System.out.println("There is no such city");
        }
    }
}
