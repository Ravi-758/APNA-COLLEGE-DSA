
public class Arrays1 {
    public static void printSubarry(int number[]){
        
       for(int i=0;i<number.length;i++){
           int start = i;
           for(int j=i+1;j<number.length;j++){
               int end= j;
               for(int k=start;k<=end;k++){
                   System.out.print(number[k]+" ");
               }
               System.out.println();

           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        printSubarry(arr);
    }
}


// output:-

/*
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 6 
4 6 8 
4 6 8 10 

6 8 
6 8 10 

8 10 
*/
