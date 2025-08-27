import java.util.Scanner;
public class Lab6_23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int start = Integer.parseInt(input[1]);
        int stop = Integer.parseInt(input[2]);
        String sum = "";
        sc.close();
        for(int i=start;i<stop;i++){
            sum += input[0].charAt(i);
        }
        System.out.println(sum);
    }
}
