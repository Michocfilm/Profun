public class Lab5Q5_4680449 {
    public static void main(String[] args){
        int layer = 3;
        int numLines = 4;
        int numStars=0;
        for(int i=0;i<layer;i++){
            numStars = (2*i)-1;
            for(int j=0;j<numLines;j++){
                numStars +=2;
                for(int k=j;k<layer-i+2;k++){
                    System.out.print(" ");
                }
                for(int k=0;k<numStars;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<(numStars/2)-(layer/2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<layer;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
