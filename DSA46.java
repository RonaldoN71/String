import java.util.Arrays;

public class DSA46 {

    static void stringCount(String str){
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedArray = new String(chars);

        for(int i=0;i<len;i++){
            int count = 1;
            while(i<len-1 && sortedArray.charAt(i)==sortedArray.charAt(i+1)){
                count ++;
                i++;
            }
            if(count>1){
                System.out.println(sortedArray.charAt(i)+", count: "+count);
            }
        }
    }
    public static void main(String[] args) {
       String str = "truee passion";
       stringCount(str);
    }
}
