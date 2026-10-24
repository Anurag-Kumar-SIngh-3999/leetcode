class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] balance = new int[accounts.length];
        for ( int i = 0 ; i<accounts.length;i++){
            balance[i]=0;
            for(int j =0 ;j<accounts[i].length;j++){
                balance[i]+=accounts[i][j];
            }
        }
        return Arrays.stream(balance).max().getAsInt();
    }
}