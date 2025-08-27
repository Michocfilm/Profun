import java.util.*;
public class TestArray {
    public static void main(String[] args){
        var num = 2;
        String[] name = {"hiko","chibi","sakalo"};
        int[] arr = new int[4];
        arr[0] = 9;
        arr[1] = 7;
        arr[2] = 5;
        arr[3] = 8;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(name));
        int smallet = (arr[0]>arr[1])?arr[0]:arr[1];
        System.out.println(smallet);
    }
}
