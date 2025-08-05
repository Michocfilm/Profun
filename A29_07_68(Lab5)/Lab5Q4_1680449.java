public class Lab5Q4_1680449{
    public static void main(String[] args){
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int w=0,m=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'W'){
                w++;
            }else{
                m++;
            }
        }
        System.out.printf("มีนักศึกษา W = %d คน\nมีนักศึกษา M = %d คน",w,m);
    }
}