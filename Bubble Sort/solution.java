public class Arrays1{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i])  ;
        }
    }
    public static void main(String[] args) {
        int arr[] ={12,342,45,23,67,21,};
        bubbleSort(arr);
        printArr(arr);
    }
}

/*Output:-
12
21
23
45
67
342


*/
