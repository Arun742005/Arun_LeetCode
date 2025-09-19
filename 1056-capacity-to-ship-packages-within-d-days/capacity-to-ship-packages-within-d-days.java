class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0 , high = 0;

        for(int w : weights){
            low = Math.max(w,low);
            high += w; 
        }

        while(low < high){
            int mid = low + (high - low) /2;

            if(canShip(weights , days , mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean canShip(int[] weights , int day , int limit){
        int currentLoad=0,daycount=1;

        for(int w : weights){
            if(currentLoad + w > limit){
                daycount++;
                currentLoad = w;
            }else{
                currentLoad+=w;
            }
        }
        return daycount <= day;
    }
}