import java.util.Scanner;
public class Lab6Q2_2680449 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Input : ");
       String input = sc.nextLine();
       String[] token = input.split(" "); 
       String pre = "" ;
       int segment = 0 ;
       for(String current : token){
            if(!current.equals(pre)){
                segment++;
                pre = current;
            }
       }
       sc.close();
       System.out.println(segment);
    }
}
