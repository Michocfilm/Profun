import java.util.Scanner;
public class Lab4Q4_1680449{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int sum = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.printf("%d is Perfect Number%n",i);
                count ++;
                if(count == k){
                    break;
                }
            }
        }
    }
}