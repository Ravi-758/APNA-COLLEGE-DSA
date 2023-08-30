public class pattern {
    public static int sqrt(int arr[],int target){
        int s=0,e=arr.length-1,mid =s+(e-s)/2;
        int ans =0;
        for(int i=0;i< arr.length;i++){
            if(mid *mid>target){
                e =mid-1;
            }
            if(mid*mid<target){
                ans = mid;
                s=mid+1;
            }
            if(mid*mid==target){
                return mid;
            }
           mid = s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        int target =17;
        System.out.println(sqrt(arr,target));
    }
}
