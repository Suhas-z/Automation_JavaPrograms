package repeats.array.array_programs.practice;

import java.util.Stack;

public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels());
    }

    public static String reverseVowels() {
        String s = "Done to make sure that the software is ready";
        Stack<Character> stack= new Stack<>();
        //push only vowels into stack
        String vowels="aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(vowels.contains(String.valueOf(c))) stack.push(c);
        }

        //when we encounter a vowel we pop the character from the stack and
        //  append it to the string. just do a dry run you will understand it

        String res="";

        for(int i=0;i<s.length();i++){
            char d= s.charAt(i);
            if(vowels.contains(String.valueOf(d))){
                //pop the stack and append the popped character
                res+=stack.pop();
            }else res+=d;
        }
        return res;
    }
}
