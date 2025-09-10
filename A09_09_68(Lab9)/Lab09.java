public class Lab09 {
    public static void main(String[] args){

    }

    /*q1*/ static int right_diag_sum(int [][] input){
        int n = input.length;
        int sum = 0;
        for(int i=0;i<input.length;i++){
            sum += input[i][n-1-i];
        }
        return sum;
    }

    /*q2*/ static int [] max_sum_row(int [][] input){
        int maxindex=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            int sum = 0;
            for(int num : input[i]){
                sum += num;
            }
            if(sum>maxsum){
                maxsum = sum;
                maxindex = i;
            }
        }
        int[] output = new int[input[maxindex].length];
        for(int i=0;i<input[maxindex].length;i++){
            output[i] = input[maxindex][i];
        }
        return output;
    }

    /*q3*/ static int [] retrieve_main_diagonal(int [][] input){
        int[] arr = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i] = input[i][i];
        }
        return arr;
    }

    /*q4*/static int[][] transpose(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length; 
        int[][] transposed = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }
    
    /*q5*/static int[][] by_point(int[][] raw_score) {
        int n = raw_score.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (raw_score[j][1] > raw_score[maxIndex][1]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int tempTeam = raw_score[i][0];
                int tempPoint = raw_score[i][1];

                raw_score[i][0] = raw_score[maxIndex][0];
                raw_score[i][1] = raw_score[maxIndex][1];

                raw_score[maxIndex][0] = tempTeam;
                raw_score[maxIndex][1] = tempPoint;
            }
        }
        return raw_score;
    }


}
