package Backtracking;

public class Backtracking2 {
    public static void findSubsets(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Yes choice
        findSubsets(str, i+1, ans+str.charAt(i));
        findSubsets(str, i+1, ans); //No choice
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}
