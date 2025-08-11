import java.util.Scanner;
public class Lab7_1680449{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] input = sc.nextLine().split(" ");
        System.out.println("Output : "+q2_1_myIndexOF(input[0], input[1]));
        sc.close();
    }
    // 2.1
    static int q2_1_myIndexOF(String str,String sub){
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean match = true;
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
        // 2.2
    static boolean q2_2_containsAndBefore(String input,String sub1,String sub2){
        int index1 = -1;
        int index2 = -1;

        for(int i = 0 ; i <= input.length() - sub1.length() ; i++){
            if(input.startsWith(sub1,i)){
                index1 = i;
                break;
            }
        }
        for(int i = 0 ; i <= input.length() - sub2.length() ; i++){
            if(input.startsWith(sub2,i)){
                index2 = i;
                break;
            }
        }
        return (index1 != -1 && index2 != -1 && index1 < index2);
    }
    //2.3
    static String q2_3_replceWith(String str,String pattern,String newPattern){
        return "Hello";
    }

}