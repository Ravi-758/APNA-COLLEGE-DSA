public class Arrays1 {
    public static void printPairs(int number[]){
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr);

    }
}

// output:-(2,4)(2,6)(2,8)(2,10)
          // (4,6)(4,8)(4,10).....
