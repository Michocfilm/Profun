// ให้สร้าง method สำหรับสร้างนาฬิกาทราย
public class Sandclock {
    public static void main(String[] args){
        T1_Sanclock(5); // เรียกใช้ Method
    }
    static void T1_Sanclock(int n){
        // แบ่งเป็น 2 ส่วนคือ ส่วนบน ส่วนล่าง
        for(int i=0;i<n;i++){ // ส่วนบน
            for(int j=n;j>n-i;j--){
                System.out.print(" ");
            }
            for(int j=n*2;j>i*2;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){ // ส่วนล่าง
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
