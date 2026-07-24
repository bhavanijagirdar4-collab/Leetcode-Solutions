class Solution {
    public int[] searchRange(int[] nums, int target) {

        int arr[] = new int[2];
        arr[0]= fun1(nums,target);
        arr[1] = fun2(nums,target);
        
     return arr;

    }

    static int fun2(int arr[],int t){
        int n = arr.length;

        int low = 0,high = n-1;

        int l = -1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(t==arr[mid]){
                l = mid;
                low = mid+1;
            }else if(t<arr[mid]){
                      high = mid-1;

            }else{
                low = mid+1;
            }

        }
        return l;
    }

    static int fun1(int arr[],int t){
        int n = arr.length;

        int low = 0,high = n-1;

        int f = -1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(t==arr[mid]){
                f = mid;
                high = mid-1;
            }else if(t<arr[mid]){
                      high = mid-1;

            }else{
                low = mid+1;
            }

        }
        return f;
    }


}