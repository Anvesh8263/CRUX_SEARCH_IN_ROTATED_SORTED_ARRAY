class Solution {
    public int search(int[] nums, int target ) {
        return Search(nums,target);
    }
     public static int Search(int[] arr, int item) {
        int lo =0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>=arr[lo]){//upper line pr hoon
                if(arr[lo]<=item && arr[mid]>item){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        else{
            if(arr[mid]<item && arr[hi]>=item){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        
        }
        
    }
    return -1;
    }
}

