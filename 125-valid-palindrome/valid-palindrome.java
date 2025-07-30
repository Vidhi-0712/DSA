class Solution {
    public boolean isPalindrome(String s) {
        String lowerinput = s.toLowerCase();
        String cleaninput = lowerinput.replaceAll("[^a-zA-Z0-9]","");
        char[] chararray = cleaninput.toCharArray();
        String reversed = "";
        String start;

            for(int i=chararray.length -1; i >= 0; i--){
                reversed = reversed + chararray[i];
            }
        return cleaninput.equals(reversed);
        
    }
}
public class ValidPalindrome{
    public static void main(String[] args){
        Solution s = new Solution();
        String input = "A man, a plan, a canal: Panama";
        s.isPalindrome(input);
    }
}