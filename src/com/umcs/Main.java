package com.umcs;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
    }
    /*Classic FizzBuzz*/
    public static void fizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /*https://www.codewars.com/kata/59dd2c38f703c4ae5e000014*/
    public static int solve(String s) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        List<Integer> nums = new ArrayList<Integer>();
        while (m.find()) {
            nums.add(Integer.parseInt(m.group()));
        }
        return Collections.max(nums);
    }

    /*https://www.codewars.com/kata/52fba66badcd10859f00097e*/
    public static String disemvowel(String str) {
        return str.replaceAll("A|E|O|U|I|a|e|u|i|o", "");
    }

    /*https://www.codewars.com/kata/55f8a9c06c018a0d6e000132*/
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    /*https://www.codewars.com/kata/55b22ef242ad87345c0000b2*/
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        else {
            return factorial(n - 1).multiply(BigInteger.valueOf(n));
        }
    }
    public static BigInteger choose(int n, int k) {
        if (n < k) {
            return BigInteger.valueOf(0);
        } else {
            return factorial(n).divide(factorial(k).multiply(factorial(n-k)));
        }
    }

    /*https://www.codewars.com/kata/5a3e1319b6486ac96f000049*/
    public static int solve (int [] arr){
        int counter = 0;
        for (int i = 1; i < arr.length; i+=2) {
            if (arr[i] == arr[i-1]+1 | arr[i] == arr[i-1]-1){
                counter ++;
            }
        }
        return counter;
    }

    /*https://www.codewars.com/kata/54ff3102c1bad923760001f3*/
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == 'a' | c == 'i' | c == 'o' | c == 'e' | c == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

    /*https://www.codewars.com/kata/54da5a58ea159efa38000836*/
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int counter = 0;
        int number = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                counter++;

            } else {
                if (counter % 2 == 0) {
                    number = a[i];
                    counter = 1;
                } else {
                    return a[i - 1];
                }
            }

        }
        return number;
    }

    /*https://www.codewars.com/kata/541c8630095125aba6000c00*/
    public static int digital_root(int n) {
        int sum = 0;
        if (n < 10) {
            return n;
        }
        while (n != 0) {
            int remainder = n % 10;
            n /= 10;
            sum += remainder;
        }
        return digital_root(sum);
    }

    /*https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec*/
    public static int persistence(long n) {
        int counter = 0;
        while (n >= 10){
            n = String.valueOf(n).chars().reduce(1, (acc, curr) -> acc * (curr - '0'));
            counter++;
        }
        return counter;
    }
}
