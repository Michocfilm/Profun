// ให้สร้าง method รับค่าtextและsub เช่น text=Michoc sub=hoc แล้วเช็คว่า text ลงท้ายด้วย sub มั้ย แล้วreturnค่า boolean true false กลับมา
public class Lastsub {
    public static void main(String[] args){
        System.out.println(T3_Lastsub("Michoc","hoc"));
    }
    static boolean T3_Lastsub(String text,String sub){
        int index = text.length()-sub.length(); // บอกให้โปรแกรมเริ่มนับจากตำแหน่งหลังสุด
        int count = 0; // สำหรับเช็คว่า text ซ้ำกับ sub ครบทุกตัวไหมถ้าครบแสดงว่า text ลงท้ายด้วย sub
        for(int i=0;i<sub.length();i++){
            if(text.charAt(index+i)==sub.charAt(i)){
                count++;
                if(count == sub.length()){ // ถ้าcount==จำนวนsub แสดงว่าtext ลงท้ายด้วย sub
                    return true;
                }
            }
        }
        return false;
    }
}
