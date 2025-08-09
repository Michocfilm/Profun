import java.util.Scanner;
public class Lab7_1680449{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        String[] token = input.split(" ");
        System.out.println("Output : "+q2_1_myIndexOF(token[0], token[1]));
        sc.close();
    }
    static int q2_1_myIndexOF(String str,String sub){
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean match = true;
            // ตรวจทีละตัวอักษรใน sub
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1; 
    }
}