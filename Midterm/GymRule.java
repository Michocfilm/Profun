// คือจะให้คำนวน ค่าเข้ายิมโดยราคาปกติ = 120 ถ้าวันธรรมดา = 100(1-5) แล้วถ้าสูงกว่า100แต่ไม่เกิน160คิดครึ่งราคา แล้วถ้าสูงไม่ถึงร้อยฟรี
public class GymRule {
    public static void main(String[] args){
        System.out.printf("Price : %d ฿",T5_price(170, 6)); // เรียกใช้ Method
    }
    
    static int T5_price(int heigh,int day){
        int price = 120;
        if(day>=1&&day<=5){ // เช็คว่าเป็นวันธรรมดามั้ย
            if(heigh>100&&heigh<=160){ // สูงเกินหรือเตี้ยเกินหรือมั้ย
                return 100/2;
            }
            else if(heigh>160){
                return 100;
            }
            else{
                return 0;
            }
        }
        else{
            if(heigh>100&&heigh<=160){ 
                return price/2;
            }
            else if(heigh>160){
                return price;
            }
            else{
                return 0;
            }
        }
    }
}
