public class pattern {
    public static void main(String[] args){
        int counter=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter=counter+1;
            }
            System.out.println();
        }
    }
}


/*output:-
          1
          23
          456
          78910
          1112131415 */
