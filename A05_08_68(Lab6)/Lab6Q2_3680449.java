import java.util.Scanner;
public class Lab6Q2_3680449 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
       	System.out.print("Input : ");
       	String input = sc.nextLine();
       	String[] token = input.split(" ");
       	String output  = "";
       	for(int i=Integer.parseInt(token[token.length-2]);i<Integer.parseInt(token[token.length-1]);i++){
			output += token[0].charAt(i);
       	}
		System.out.printf("Output : %s",output);
		sc.close();
    }
}
