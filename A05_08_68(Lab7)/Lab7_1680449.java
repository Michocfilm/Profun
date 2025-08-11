import java.util.Scanner;
public class Lab7_1680449{
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] input = sc.nextLine().split(" ");*/
        //System.out.println("Output : "+q2_1_myIndexOF(input[0], input[1]));
        //sc.close();
        System.out.println(q2_3_replceWith("At KMITL CHALONGKRUNG BMI MTL", "MI", "CSP"));
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
    static String q2_3_replceWith(String str, String pattern, String newPattern) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            boolean match = true;
            if (i + pattern.length() <= str.length()) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (str.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }
            if (match) {
                for (int j = 0; j < newPattern.length(); j++) {
                    result += newPattern.charAt(j);
                }
                i += pattern.length();
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }
    //2.4
    static boolean q2_4_isClockwiseRoate(String str,String pattern){
        return true;
    }
}