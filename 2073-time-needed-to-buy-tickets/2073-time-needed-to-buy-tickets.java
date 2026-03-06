class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeCount = 0;
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    timeCount++;
                }
                if (tickets[k] == 0) {
                    return timeCount;
                }
            }
        }
        return timeCount;
    }
}
