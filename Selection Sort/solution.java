public class Arrays1 {
    public static void selectionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int minPos =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp =arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,43,67,231,890,12};
        selectionSort(arr);
        printArr(arr);
    }
}


/*
Output:-
12
12
32
43
67
231
890
*/
