public class Lab5_51{
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i||j==n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}