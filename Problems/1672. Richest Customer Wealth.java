class Solution {
    public int maximumWealth(int[][] accounts) {
        //number of customers
        int[] wealth = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                wealth[i] += accounts[i][j];
            }
        }
        return Arrays.stream(wealth).max().getAsInt();
    }
}