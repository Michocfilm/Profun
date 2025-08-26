import java.util.Scanner;
public class Muu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        String[] input = sc.nextLine().split(" ");
        sc.close();
        for(int i=0;i<input.length;i++){
            int sum = 0;   
            int num = Integer.parseInt(input[i]);
            for(int j=0;j<input[i].length();j++){
                sum += num%10;
                num/=10;
            }
            boolean check = (sum == 9);
            System.out.printf("%s %b%n",input[i],check);
        }
    }
}
