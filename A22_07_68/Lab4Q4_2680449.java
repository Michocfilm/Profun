import java.util.Scanner;
public class Lab4Q4_2680449{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num1 = sc.nextInt();
        sc.close();
        int num2 = num1; // สำหรับเก็บค่าเพื่อไปแสดงผล
        int sum = 0;
        while (num1 > 0) {
            sum += num1 % 10;   
            num1 /= 10;        
        }
        boolean check = (sum == 9);
        System.out.println(num2+" "+check);
    }
}
