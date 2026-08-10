class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null && word.isEmpty()){
            return false;
        }

        String upt=word.toUpperCase();
        //if all words are in uppercase 
        if(word.equals(upt)){
            return true ;
        }

        //if all are lowercaase
         String lwt=word.toLowerCase();
         

        //for 1st uppercase and others to be lowercase 
        if(word.charAt(0)==upt.charAt(0)){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)!=lwt.charAt(i)){
                    return false;
                }
            }
        }else{
            if(word.equals(lwt)){
                return true;
            }else {return false;}
        }


        return true;

    }
}