package com.company;
//new git
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("How many numbers?");
        int total = input.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number:");
            nums.add(input.nextInt());
        }

        sort(nums);
        print(nums);

    }

    public static void sort(ArrayList<Integer> numbers) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < numbers.size() -1; i++) {
                if(numbers.get(i) > numbers.get(i+1)){
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(i+1)) ;
                    numbers.set(i+1, temp) ;
                    sorted = false;
                }
            }
        }

    }

    public static void print(ArrayList numbers) {

        for (int i = numbers.size(); i > 0; i--) {
            System.out.println(numbers.get(i - 1));
        }
    }


}