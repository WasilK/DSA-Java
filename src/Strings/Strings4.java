package Strings;

public class Strings4 {
    public static String printLargestString(String fruits[]){
        String largest = fruits[0];
        for(int i = 0; i < fruits.length; i++){
           if(largest.compareTo(fruits[i]) < 0){
               largest = fruits[i];
           }

        }
        return largest;
    }


    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "orange"};
        System.out.println(printLargestString(fruits));
    }
}
