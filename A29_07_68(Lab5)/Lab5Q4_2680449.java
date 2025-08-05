import java.util.Scanner;
public class Lab5Q4_2680449 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String aeiou = "aeiou"; 
        boolean state = false;
        System.out.print("Enter : ");
        String str = sc.nextLine();
        sc.close();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<5;j++){
                if(str.toLowerCase().charAt(i) == aeiou.charAt(j)){
                    System.out.println(i);
                    state = true;
                    break;
                }
            }
            if(state == true){
                break;
            }
        }
        if(state == false){
            System.out.println("-1");
        }
    }
}