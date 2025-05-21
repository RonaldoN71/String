// public class DSA47 {
//     static void FindSubnr(String str){
//         int len = str.length();
//         int maxlength = 0;
//         for(int i=0;i<len;i++){
//             int [] hash = new int[255];
//             for(int j=i;j<len;j++){
//                 if(hash[str.charAt(j)]!=0) break;
//                 hash[str.charAt(j)]++;
//                 int tlen = j-i+1;
//                 maxlength = Math.max(maxlength,tlen);
//             }
//         }
//        System.out.println("maxLength: "+maxlength);
//     }
//     public static void main(String[] args) {
//         String str = "abcabcebb";
//         FindSubnr(str);
//     }
// }

public class DSA47 {
    static void FindSubnr(String str){
        int len = str.length();
        int maxlength = 0; int r=0,l=0;
        int [] has = new int[255];
        while(r<len){
        if(has[str.charAt(r)] !=0 && has[str.charAt(r)] >= l ){
            l = has[str.charAt(r)] + 1;
        }
       int tlen = (r-l)+ 1;
        maxlength = Math.max(maxlength,tlen);
        has[str.charAt(r)] = r;
        r++;
        }
       
       System.out.println("maxLength: "+maxlength);
    }
    public static void main(String[] args) {
        String str = "abcabcebb";
        FindSubnr(str);
    }
}
