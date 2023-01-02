package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i >= 0 ; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            list.add(str);
            if(str.equals("end")){
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.contains("end")){
                list.remove("end");
            }
            System.out.print(list.get(i) + " ");
        }

    }
}
