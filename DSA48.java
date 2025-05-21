// public class DSA48 {
//     static void Replace(String str){
//         int k = 2;
//        int maxlen = 0;
//        int len = str.length();
//        for(int i=0;i<len;i++){
//         int []has = new int [255]; int maxfreq = 0;
//         for(int j=i;j<len;j++){
//             has[str.charAt(j)]++;
//             maxfreq = Math.max(maxfreq,has[str.charAt(j)]);

//             if(((j-i+1)-maxfreq)<=k){
//                 maxlen = Math.max(maxlen,j-i+1);
//             }
//         }
//        }
//        System.out.println("count: "+ maxlen);
//     }
//     public static void main(String[] args) {
//         String str = "AAABBBBD";
//         Replace(str);
//     }
// }

public class DSA48 {
    static void Replace(String str){
        int k = 2;
       int maxlen = 0,len = str.length();
       int maxfreq=0,r=0,l=0;
       int []has = new int[255];
       while(r<len){
        has[str.charAt(r)]++;
        maxfreq = Math.max(maxfreq,has[str.charAt(r)]);
        if(((r-l+1)-maxfreq)>k){
            has[str.charAt(l)]--;
            l++;
        }else{
            maxlen = Math.max(maxlen,r-l+1);
        }
        r++;
       }
       System.out.println("count: "+ maxlen);
    }
    public static void main(String[] args) {
        String str = "AAABBBBD";
        Replace(str);
    }
}