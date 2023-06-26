public class pattern {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){ //outer loop
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


output:-
  12345
  1234
  123
  12
  1
