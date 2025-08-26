import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        int count = 1;
        sc.close();
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int sum = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.printf("Perfect num%d : %d%n",count,i);
                count++;
                if(count-1 == num){
                    break;
                }
            }
        }
    }
}
