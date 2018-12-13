package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] wordsOne = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
        String[] wordsTwo = {"one", "two", "three"};
        isPalindrome(wordsOne);
    }

    private static boolean isPalindrome(String[] words) {
        int mid = words.length / 2;
        int right_pointer = words.length - 1;
        int left_pointer = 0;
        boolean palindrome = true;

        while (left_pointer < mid) {
            if(!words[left_pointer].equals(words[right_pointer])){
                palindrome = false;
            } else if (words[left_pointer].equals(words[right_pointer])) {
                palindrome = true;
            }
            left_pointer++;
            right_pointer--;
            System.out.println(palindrome);
        }
        return palindrome;
    }
}
