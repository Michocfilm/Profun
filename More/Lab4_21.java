public class Lab4_21 {
    public static void main(String[] args){
        int p1,p2,p3;
        int total;
        p1 = Integer.parseInt(args[0]);
        p2 = Integer.parseInt(args[1]);
        p3 = Integer.parseInt(args[2]);
        if(p1 <= p2 && p1<= p3){
            total = p2+p3;
        }
        else if(p2 <= p1 && p2 <= p3){
            total = p1+p3;
        }
        else{
            total = p1+p2;
        }
        System.out.println(total);
    }
}
