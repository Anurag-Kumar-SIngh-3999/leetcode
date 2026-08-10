class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        int n=word.length();
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper++;
            }
        }
       if(upper==n){
           return true;
       }
       else if(upper==0){
           return true;
       }
       else if(upper==1 && Character.isUpperCase(word.charAt(0))){
           return true;
       }
       else return false ;

        

    }
}