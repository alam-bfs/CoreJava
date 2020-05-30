package com.collection;

public class Lesson1 {

    public static String convertCharArrayToString(char[] chs){
        return new String(chs);
    }

    public static void main(String[] args){
        char[] chars = {'a', 'b', 'c'};
        System.out.println(convertCharArrayToString(chars));
    }
}
