public class mod {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int nummod = Integer.parseInt(args[1]);
        int result = num % nummod;
        System.out.printf("result = %d",result);
    }
}
