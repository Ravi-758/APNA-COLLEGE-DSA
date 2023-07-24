public class Arrays1 {
    public static void reverse(int number[]){
        int first=0,last = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last]=number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,23,45,890,45,432};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// output:-{432,45,890,45,23,12}
