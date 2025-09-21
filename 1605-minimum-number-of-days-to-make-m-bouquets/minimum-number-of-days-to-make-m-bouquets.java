class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long resultFlower = (long) m * k;
        if(resultFlower > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        
        for(int bloom : bloomDay){
            low = Math.min(low , bloom);
            high = Math.max(high , bloom);
        }

        while(low < high){
            int mid = low + (high - low) /2;

            if(canMake(bloomDay,m , k ,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean canMake(int[] bloomDay, int m, int k, int days){
        int bouquet =0 , flower=0;
        for(int bloom : bloomDay){
            if(bloom <= days){
                flower++;
                if(flower == k){
                    bouquet++;
                    flower=0;
                }
            }else{
                flower=0;
            }
        }
        return bouquet >= m;
    }
}