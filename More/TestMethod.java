public class TestMethod {
    public static void main(String[] args){
        String[] fruit=new String[3];
        fruit[0] = "Apple"; 
        fruit[1] = "Banana"; 
        fruit[2] = "Avocado"; 
        display(fruit);
    }
    static void display(String[] arr){
            System.out.print("{");
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]);
                if(j<arr.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("}");
    }
}
