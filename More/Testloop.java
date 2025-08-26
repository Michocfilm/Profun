public class Testloop {
    public static void main(String[] args){
        int sum = 0;
        for(;sum<200;){
            sum += 9;
        }
        if(sum>200){
            sum-=9;
        }
        System.out.println(sum);
    }
}
