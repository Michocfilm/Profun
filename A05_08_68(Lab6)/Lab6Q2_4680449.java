import java.util.Scanner;
public class Lab6Q2_4680449 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        String[] token = input.split(" ");
        String output = "";
        for(int i=0;i<token.length;i++){
            for(int j=0;j<i;j++){
                if(token[i].equals(token[j])){
                    output += token[i]+" ";
                    break;
                }
            }
        }
        if(output.equals("")){
            output+="-1";
        }
        System.out.printf("Output : %s",output);
        sc.close();
    }
}
