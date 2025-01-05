
import java.util.Scanner ; 

public class MinMaxElement{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter the size of array: ");

        int n = sc.nextInt() ; 

        int[] arr = new int[n] ; 

        System.out.println("\nEnter array elements: ");

        for(int i=0 ; i < n; i++){
            arr[i] = sc.nextInt() ;
        }

        // initialize min and max with first element of the array 

        int min = arr[0];
        int max = arr[0];

        for(int i=1 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i] ; 
            }

            if(arr[i] > max){
                max = arr[i] ; 
            }
        }

        System.out.println("\n min: " + min);
        System.out.println("\n max: " + max);

    }
}