import java.util.*;

class DSA41{
    static boolean CheckAnagram(String s,String t){
        char[] CharS = s.toCharArray();
        char[] CharT = t.toCharArray();

        Arrays.sort(CharS);
        Arrays.sort(CharT);
        return Arrays.equals(CharS,CharT);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if(CheckAnagram(s,t)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}