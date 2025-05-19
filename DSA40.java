class DSA40{
    static boolean Palindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char CurrFirst = s.charAt(start);
            char CurrEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(CurrFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(CurrEnd)){
                end--;
            }
            else{
                if(Character.toLowerCase(CurrFirst)!=Character.toLowerCase(CurrEnd)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "A man, a Plan, a canal: Panama";

        if(Palindrome(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}