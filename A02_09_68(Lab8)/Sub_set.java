public class Sub_set {
    public static void main(String[] args){
        int[] a = {2,3,5,7};
        int[] b = {4,6,7,8};
        boolean result = q3_common_element(a, b);
        System.out.printf("Subset : %b",result);
    }

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
}
