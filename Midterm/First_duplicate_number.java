// คือหาตัวเลขตัวแรกที่ซ้ำกันทุก Array เช่น 
/*
        int[] a = {2,4,6,4};
        int[] b = {2,7,6,4};
        int[] c = {4,1,6,7,9};
        result = 4
 */
public class First_duplicate_number {
    public static void main(String[] args){
        int[] a = {2,4,6,4};
        int[] b = {2,7,6,4};
        int[] c = {4,1,6,7,9};
        System.out.println(T4_checkFirstDuplicate(a, b, c)); // เรียกใช้ Method
    }

    static int T4_checkFirstDuplicate(int[]a,int[]b,int[]c){
        for(int i=0;i<a.length;i++){
            boolean check = false; //สำหรับเช็คว่าได้เข้าไปเช็คค่า c มายัง
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    for(int k=0;k<c.length;k++){
                        if(b[j]==c[k]){
                            return c[k];
                        }
                        check = true; // ถ้าเช็คแต่ไม่มีให้สถานะ true
                    }
                }
                if(check){ // เพื่อไม่ให้โปรแกรมไปเอา b ตัวอื่นมาแต่ให้โปรแกรมไปเอา a ตัวใหม่มาเลย
                break;
            }
            }
        }
        return -1;
    }
}
