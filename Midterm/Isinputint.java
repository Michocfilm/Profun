// input ที่เข้ามาใช่ int มั้ย เช่น "42"=true "4A"=false;
public class Isinputint {
    public static void main(String[] args){
        String input1 = "42";
        String input2 = "A4";
        System.out.printf("Input : %s%nOutput : %b%n",input1,T6_checkInputInt(input1)); // เรียกใช้ Method
        System.out.printf("Input : %s%nOutput : %b%n",input2,T6_checkInputInt(input2)); // เรียกใช้ Method
    }
    static boolean T6_checkInputInt(String str){
        String num = "0123456789"; // สำหรับใช้เช็คว่า input เป็นตัวเลขมั้ย
        boolean check = false;
        for(int i=0;i<str.length();i++){
            check = false;
            for(int j=0;j<num.length();j++){
                if(str.charAt(i)==num.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(!check){ // ถ้าเช็คตัวแรกแล้วไม่ใช่ตัวเลขก็ retun false ได้เลยไม่ต้องเช็คตัวที่เหลือแล้ว
                return check;
            }
        }
        return check;
    }
}
