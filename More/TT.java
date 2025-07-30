import java.util.Scanner;
public class TT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] t = line.split(" ");
        for (String each : t){
            int x = Integer.parseInt(each);
            int pay = 0;
            if(x >= 20){
                pay = 24;
            }
            if(x == 0){
                pay = 0;
            }else {
                for (int o = 0;o <= x; o++){
                    if(o <= 2){
                        pay = 4;
                    }else if (o <= 4){
                        pay += 3;
                    }else if (o < 20){
                        pay += 1;
                    }else if (o < 123){
                        pay = 24;
                    }else{
                        pay = pay * 5 + 7;
                    }
                }
            }
            sc.close();
            System.out.println("parking for "+ x + " hours , pay " + pay + "bath.");
        }
    }
}