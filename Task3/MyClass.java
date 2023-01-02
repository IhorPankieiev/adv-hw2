package Task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("\n" + getMinimum(list));

    }//main

    public static LinkedList<Integer> getIntegerList(){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter an amount of numbers:");
        int amNum = amount.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < amNum; i++) {
            Scanner enterNum = new Scanner(System.in);
            Integer num = enterNum.nextInt();
            list.add(num);
        }
        return list;
    }//method1

    public static int getMinimum(LinkedList<Integer> list){
        int min = Collections.min(list);
        return min;
    }//method2
}//class
