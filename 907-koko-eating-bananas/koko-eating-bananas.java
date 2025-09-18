class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1, right =0;

        for(int pile : piles){
            right = Math.max(pile , right);
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            if(canEatAll(piles ,h,mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canEatAll(int[] piles , int h , int speed){
        long hour = 0;
        for(int pile : piles){
            hour += (pile + speed -1) / speed;
        }   
        return hour <=h;
    }
}