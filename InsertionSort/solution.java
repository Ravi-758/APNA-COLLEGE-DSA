public class pattern {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev =i-1;
            while(prev>=0&&arr[prev] >arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] =curr;
        }
    }
    public static void main(String[] args) {
    int[] arr ={12,24,21,56,32,89,31};
    insertionSort(arr);
    
    }
}

