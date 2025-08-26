import java.util.Scanner;
public class LabCar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Hr : ");
        int input = sc.nextInt();
        int day = input/24;
        int hour = input % 24;
        int total = day*24;
        sc.close();
        if(input>0){
            if(hour <= 2){
                total += 4;
            }
            else if(hour <= 4){
                total += 4+(hour-2)*3;
            }
            else{
                total += 4+6+(hour-4);
            }
            // จอดไม่ถึง 24 ชั่วโมงแล้วจ่ายเกิน 24฿
            if (total - (day * 24) > 24) {
                total = (day + 1) * 24;
            }
        }
        System.out.println("total : "+total);
    }
}
