import java.util.Arrays;

public class Arrangearray {
    public static void main(String[] args) {

        int[] arr = {1,0,0,1,0,0,1};
        int count1 = 0;

        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count1++;
            }
        }

        
        for(int i = 0; i < count1; i++){
            arr[i] = 1;
        }

        
        for(int i = count1; i < arr.length; i++){
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}