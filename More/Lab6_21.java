public class Lab6_21 {
    public static void main(String[] args){
        int[] data1 = { 58, 4, 13, 15, 63, 9, 8, 81, 1, 78 };
        int[] data2 = { 12, 14, 16, 18, 20, 22, 23, 25, 37, 38, 39, 40 };
        System.out.println(check(data1));
        System.out.println(check(data2));
    }
    static boolean check(int[] arr){
        boolean n = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                n = true;
            }
            else{
                return false;
            }
        }
        return n;
    }
}
