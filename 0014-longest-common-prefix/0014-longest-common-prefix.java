class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            ans=commonPrefix(ans,strs[i]);
        }
        return ans;
    }
    public String commonPrefix(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int n=Math.min(l1,l2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}