import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

    int size = arr.size();
    int pos=0, neg=0, zero=0;
    for(int i=0; i<size; i++){
        if(arr.get(i)>0) pos++;
        else if(arr.get(i)<0) neg++;
        else if(arr.get(i) == 0) zero++;
    }
    
    float posRatio = (float) pos / size;
    float negRatio = (float) neg / size;
    float zeroRatio = (float) zero / size;
    
    System.out.println(String.format("%.6f", posRatio));
    System.out.println(String.format("%.6f", negRatio));
    System.out.println(String.format("%.6f", zeroRatio));


    }

}

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
