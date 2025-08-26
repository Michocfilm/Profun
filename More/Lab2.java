import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] num = sc.nextLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int result = a-(a/b)*b;
        System.out.println(result);
        sc.close();
    }
}
