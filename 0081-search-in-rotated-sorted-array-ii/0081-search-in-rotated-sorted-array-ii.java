class Solution {
    public boolean search(int[] ar, int t) {
        int i=0, n=ar.length, j=n-1, m;
        while(i<=j){
            m=(i+j)/2;
            if(ar[m]==t || ar[i]==t || ar[j]==t) return true;
            if(ar[i]==ar[j]){
                i++; j--;
                continue;
            }
            if((ar[i]<=ar[m] && (ar[i]>t || ar[m]<t)) || (ar[i]>t && ar[m]<t)) i=m+1;
            else j=m-1;
        }
        return false;
    }
}