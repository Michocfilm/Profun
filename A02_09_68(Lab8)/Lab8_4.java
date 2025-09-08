import java.util.Arrays;
public class Lab8_4{
    public static void main(String[] args){
        int[] a = {2,3,5,6,0};
        int[] b = {2,3,5,6,0};
        int[] c = {2,3,5,6,8};
        q4_1(a, 4);
        q4_2(b, 7);
        q4_3(c, 9);
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

}