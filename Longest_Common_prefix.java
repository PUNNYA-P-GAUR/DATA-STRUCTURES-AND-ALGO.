class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st=strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){
                return "";
            }
            while(strs[i].startsWith(st)!=true){
                st=st.substring(0,st.length()-1);
            }
        }
        return st;
        
    }
}
