import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DSA49 {
    static void GroupAna(String [] strs){
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortstr = new String(ch);

            if(map.containsKey(sortstr)){
                map.get(sortstr).add(str);
            }else{
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(sortstr,li);
            }
        }
        result.addAll(map.values());
        for(List<String> strsl : result){
           System.out.print("[");
            for(String str: strsl){
                System.out.print(str+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
       String [] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAna(strs);
    }
}
