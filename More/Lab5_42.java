import java.util.Scanner;
public class Lab5_42 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine().toLowerCase();
        String aeiou = "aeiou";
        boolean check = false;
        sc.close();
        for(int i=0;i<input.length();i++){
            for(int j=0;j<aeiou.length();j++){
                if(input.charAt(i) == aeiou.charAt(j)){
                    System.out.printf("%s index %d",input,i);
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }
        if(!check){
            System.out.print("-1");
        }
    }
}
