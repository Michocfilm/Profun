import java.util.*;
public class Lab8_6 {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter num : ");
            int input = sc.nextInt();
            if (input <= 0 || (!num.isEmpty() && input == num.get(0))){
                break;
            }
            num.add(input);
        }
        sc.close();
        int[] arr = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            arr[i] = num.get(i);
        }
        q5_topK(arr);
    }

    static void q5_topK(int...data) {
        int[] intArr = new int[10];
        for (int num : data) {
            int insertPos = -1;
            // หาช่องที่จะแทรก
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] == 0) {
                    insertPos = i;
                    break;
                } else if (intArr[i] < num) { // แทรกหลังตัวที่น้อยกว่า num
                    insertPos = i;
                    break;
                }
            }
            
            if (insertPos == -1){
                insertPos = intArr.length - 1; // ถ้าเต็มแล้ว
            }
            // เลื่อนขวา 1 ช่อง
            for (int j = intArr.length - 1; j > insertPos; j--) {
                intArr[j] = intArr[j - 1];
            }
            intArr[insertPos] = num; // ใส่เลขใหม่
            System.out.printf("insert %d -> %s\n",num,Arrays.toString(intArr));
        }
        
        System.out.printf("final %s\n",Arrays.toString(intArr));
    }

}
