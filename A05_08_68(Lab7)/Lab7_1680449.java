//import java.util.Scanner;
public class Lab7_1680449{
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        // 2.1
        System.out.print("Input 2.1 : ");
        String[] input2_1 = sc.nextLine().split(" ");
        System.out.println("Output 2.1 : "+q2_1_myIndexOF(input2_1[0], input2_1[1]));
        // 2.2
        System.out.print("Input 2.2 : ");
        String[] input2_2 = sc.nextLine().split(" ");
        System.out.println("Output 2.2"+q2_2_containsAndBefore(input2_2[0], input2_2[1], input2_2[2]));
        // 2.3
        System.out.print("Input 2.3 : ");
        String[] input2_3 = sc.nextLine().split(" ");
        System.out.println("Outpuut 2.3 :"+q2_3_replceWith(input2_3[0], input2_3[1], input2_3[2]));
        // 2.4
        System.out.print("Input 2.4 : ");
        String[] input2_4 = sc.nextLine().split(" ");
        System.out.println("Output 2.4 :"+q2_4_isClockwiseRoate(input2_4[0], input2_4[1]));
        sc.close();*/
        String[] input2_1 = {"PMRQNO","PM"}; // 2.1
        String[] input2_2 = {"PMRQNO","PM","QNO"}; // 2.2
        String[] input2_3 = {"At KMITL CHALONGKRUNG BMI MTL","MI","CSP"}; // 2.3
        String[] input2_4 = {"KMITL","LK"}; // 2.4
        // 2.1
        System.out.println("2.1"+"\nInput : "+input2_1[0]+" "+input2_1[1]+"\nOutput :"+q2_1_myIndexOF(input2_1[0], input2_1[1]));
        // 2.2
        System.out.println("2.2"+"\nInput : "+input2_2[0]+" "+input2_2[1]+" "+input2_2[2]+"\nOutput :"+q2_2_containsAndBefore(input2_2[0], input2_2[1], input2_2[2]));
        // 2.3
        System.out.println("2.3"+"\nInput : "+input2_3[0]+" "+input2_3[1]+" "+input2_3[2]+"\nOutput :"+q2_3_replceWith(input2_3[0], input2_3[1], input2_3[2]));
        // 2.4
        System.out.println("2.4"+"\nInput : "+input2_4[0]+" "+input2_4[1]+"\nOutput :"+q2_4_isClockwiseRoate(input2_4[0], input2_4[1]));
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
    static boolean q2_4_isClockwiseRoate(String str, String pattern) {
        if (pattern.length() > str.length()) {
            return false;
        }

        String doublet = str + str;
        int textLength = doublet.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            boolean match = true;
            for (int j = 0; j < patternLength; j++) {
                if (doublet.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}