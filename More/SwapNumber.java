public class SwapNumber {
    public static void main(String[] args){
        int x = 5;
        int y = 4;
        int temp; // สำหรับเก็บค่าชั่วคลาว
        System.out.println("ก่อนสลับ"+"\nค่า x = "+x+"\nค่า y = "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("หลังสลับ"+"\nค่า x = "+x+"\nค่า y = "+y);
    }
}
