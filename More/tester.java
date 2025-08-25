import java.util.Scanner;
public class tester {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] input = sc.nextLine().split(" ");
        System.out.println("Output : "+input.length);
    }
}
