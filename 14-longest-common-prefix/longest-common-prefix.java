class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder prefix = new StringBuilder();
       Arrays.sort(strs);

       char[] firstelement = strs[0].toCharArray();
       char[] lastelement = strs[strs.length-1].toCharArray();

       for(int i = 0; i<firstelement.length; i++){
        if(firstelement[i] != lastelement[i]){
            System.out.println("There is no common prefix among the input strings.");
            break;
        }
        prefix.append(firstelement[i]);
       }
      return prefix.toString();
    }
}