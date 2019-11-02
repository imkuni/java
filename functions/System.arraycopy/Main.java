package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> daa = new ArrayList<>();
        daa.add("first");
        daa.add("second");
        daa.add("third");
        Object[] obj1 = daa.toArray();
        String[] obj2 = new String[obj1.length];

        System.arraycopy(obj1,0,obj2,0,obj1.length);
        System.out.println(Arrays.toString(obj1));
        System.out.println(Arrays.toString(obj2));
    }
}
