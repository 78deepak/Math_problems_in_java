import java.util.*;
public class Prime_number_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the number from starting");
        int st = sc.nextInt();
        System.out.println("print the number form ending");
        int end = sc.nextInt();
        int number = 0;
        System.out.println("the prime number is given below");
        for(int i = st; i<end; i++){
            if(i==1) {continue;}
                int count=0;
                for(int j = 2; j<=i/2; j++){
                    if(i%j==0) {
                        count++;
                    }
                }
                if(count==0){
                    System.out.print(i+" ");
                    number++;
                }
        }
        System.out.println();
        System.out.println("the number of prime number is "+number);
    }
}
