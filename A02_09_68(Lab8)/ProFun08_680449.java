import java.util.*;
public class ProFun08_680449{
    public static void main(String[] args){
        // 3
        print(3);
        int[] a = {2,3,5,7};
        int[] b = {4,6,7,8};
        boolean result = q3_common_element(a, b);
        System.out.printf("a = %s\nb = %s\n",Arrays.toString(a),Arrays.toString(b));
        System.out.printf("Subset : %b\n",result);

        // 4
        print(4);
        int[] c = {2,3,5,6,0};
        int[] d = {2,3,5,6,0};
        int[] e = {2,3,5,6,8};
        q4_1(c, 4);
        q4_2(d, 7);
        q4_3(e, 9);

        // 5 
        print(5);
        int[] input = {-4,-1,0,3,10};
        sortedSquares(input);

        // 6
        print(6);
        ArrayList<Integer> num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter num : ");
            int number = sc.nextInt();
            if (number <= 0 || (!num.isEmpty() && number == num.get(0))){
                break;
            }
            num.add(number);
        }
        sc.close();
        int[] arr = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            arr[i] = num.get(i);
        }
        q5_topK(arr);
    }
    
    // 3
    static boolean q3_common_element(int [] a, int [] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                return true;
            }else if(a[i]<b[j]){
                i++;
            }else {
                j++;
            }
        }
        return false;
    }

    // 4.1
    static void q4_1(int[] nums, int d) {
        int n = nums.length;
        int i;
        for (i = 0; i < n; i++) {
            if (nums[i] == 0 || nums[i] > d) break;
        }
        for (int j = n - 1; j > i; j--) {
            nums[j] = nums[j - 1];
        }
        nums[i] = d;
        System.out.println(Arrays.toString(nums));
    }
    //4.2
    static void q4_2(int[] nums,int d){
        int n = nums.length;
        int i;
        for (i = 0; i < n; i++) {
            if (nums[i] == 0 || nums[i] > d) break;
        }
        for (int j = n - 1; j > i; j--) {
            nums[j] = nums[j - 1];
        }
        nums[i] = d;
        System.out.println(Arrays.toString(nums));
    }
    //4.3
    static void q4_3(int[] nums, int d) {
        int n = nums.length;
        if (d <= nums[n-1]) { 
            int i;
            for (i = 0; i < n; i++) {
                if (nums[i] > d) break;
            }
            for (int j = n - 1; j > i; j--) {
                nums[j] = nums[j - 1];
            }
            nums[i] = d;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }

    // 5
    static void sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1; // เริ่มใส่ตัวใหญ่สุดจากด้านหลัง

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }
        System.out.printf("Input : %s \nOutput : %s\n",Arrays.toString(nums),Arrays.toString(result));
    }

    // 6 
    static void q5_topK(int...data){
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

    // print
    static void print(int num){
        System.out.printf("กิจกรรม %d\n",num);
    }
}