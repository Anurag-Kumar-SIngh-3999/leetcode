class Solution {
    public void reverseString(char[] s) {
        if(s.length==0||s.length==1){
            return ;
        }
        int n=s.length;
        int i=0;
        while(i<n){
            char temp =s[i];
            s[i]=s[n-1];
            s[n-1]=temp;
            n--;
            i++;
        }
    }
}