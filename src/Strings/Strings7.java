package Strings;

import java.util.Arrays;

public class Strings7 {
    public static int countVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static boolean anagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean result = Arrays.equals(string1, string2);
        if (result) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "aeioufghjo";
        System.out.println(countVowels(str));

        String str1 = "race";
        String str2 = "care";
        System.out.println(anagrams(str1, str2));
    }
}
