public class DSA50 {
    static boolean isPalindrome(String sub){
        int l = 0;  int r = sub.length()-1;
        while(l<r){
            if(sub.charAt(l) != sub.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }

    static void lPalin(String str){
        int len = str.length();
        int maxlen = 0; String result = null;
        for(int i=0;i<len;i++){
            for(int j=i;j<=len;j++){
                String sub = str.substring(i,j);
                if(isPalindrome(sub)){
                    int lent = sub.length();
                    maxlen = Math.max(lent,maxlen);
                    if(maxlen == lent){
                         result = sub;
                    }
                }
                
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "ababa";
        lPalin(str);
    }
}
