class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int closestSum = num[0] + num[1] + num[2];
        for(int i = 0; i<num.length - 2; i++){
            int j = i+1;
            int k = num.length -1;
            while(j<k){
                int sum = num[i] +num[j]+num[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; 
                }
                if(sum<target){
                    j++;
                } else{
                    k--;
                }
            }
        }
        return closestSum;
    }
}