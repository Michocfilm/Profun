public class Lab2_57 {
    public static void main(String[] args){
        int x=5,y=4,temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x >> 2);
        System.out.printf("X = %d Y = %d",x,y);
        
    }
}
