class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int i=0,j=0,c=0,m=0;
        int l=s.length();
        while(i<l){
            while(h.get(s.charAt(i))!=null){
                h.remove(s.charAt(j));
                j++;
            }
            h.put(s.charAt(i),i);
            c=(i-j)+1;
            i++;
            if(c>m)
            {
                m=c;
            }
        }
        return m;
    }
}
