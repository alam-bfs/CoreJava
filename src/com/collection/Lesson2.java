package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2 {

    // this method traverse (or iterate) ArrayList
    public static void iterateArrayList(String[] data){

        // to add item in an existing array, create new ArrayList object.
        List<String> fruitsBasket = new ArrayList<>(Arrays.asList(data));

        System.out.print("before adding item in array: ");
        for(String s: fruitsBasket){
            System.out.print(s + " ");
        }
        System.out.println("");
        fruitsBasket.add("tomato");
        System.out.print("after adding item in array: ");
        for(String s: fruitsBasket){
            System.out.print(s + " ");
        }
    }

    // to convert List to Array
    public static void convertListToArray(List<String> items){

        String[] strings = new String[items.size()];
        strings = items.toArray(strings);

        System.out.print("\nconverting list to array: ");
        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }

    // check specific element exist in List
    public static void checkElementInList(List<?> list, Object element){
        System.out.println("\nelements found: " + list.contains(element));
    }

    // sort an array
    public static void sortGivenArray(int[] scores){
        System.out.print("before sort: ");
        for(int i: scores){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("after  sort: ");
        Arrays.parallelSort(scores);
        for(int i=0; i<scores.length; i++){
            System.out.print(scores[i] + " ");
        }
    }

    public static void main(String[] args){

        String[] fruits = new String[5];

        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "mango";
        fruits[3] = "banana";
        fruits[4] = "strawberry";

        iterateArrayList(fruits);

        List<String> cities = new ArrayList<>();
        cities.add("New York City");
        cities.add("Los Angeles");
        cities.add("San Francisco");

        convertListToArray(cities);
        checkElementInList(cities, "Angeles");

        int[] scores = {75, 34, 98, 21, 2, 87, 45};
        sortGivenArray(scores);
    }
}
