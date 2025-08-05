import java.util.Scanner;
public class Lab4Q3_680449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of parking hours: ");
        int hrs = sc.nextInt();
        sc.close();
        int daily = hrs / 24;
        int hourly = hrs % 24;
        int fee = daily * 24;
        if (hourly > 0) {
            if (hourly <= 2) {
                fee += 4;
            } else if (hourly <= 4) {
                fee += 4 + (hourly - 2) * 3;
            } else {
                fee += 4 + 2 * 3 + (hourly - 4) * 1;
            }
            // ถ้าราคารายชั่วโมงเกิน 24 ฿ ก็เหมารายวันไปเลย
            if (fee - (daily * 24) > 24) {
                fee = (daily + 1) * 24;
            }
        }
        System.out.printf("Parking fee is: %d bath", fee);
    }
}
