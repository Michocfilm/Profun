public class Lab6Q2_1680449{
    public static void main(String[] args){
        int[] data1 = {58,4,13,15,63,9,8,81,1,78};
        int[] data2 = {12,14,16,18,20,22,23,25,37,38,39,40};
        System.out.println("data1 : "+change(data1));
        System.out.println("data2 : "+change(data2));
    }
    static boolean change(int[]arr){
        boolean bool = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                bool = true;
            }else{
                bool = false;
                break;
            }
        }
        return bool;
    }
}