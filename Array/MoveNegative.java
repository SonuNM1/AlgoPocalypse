
// move all negative numbers to one side of the array 

public class MoveNegative{
    public static void main(String[] args) {
        
        int[] arr = {1, -2, 3, -4, -5, 6, 7, -8, 9};

        System.out.println("\n Original array : ");

        for(int element : arr){
            System.out.print(element + " ");
        }

        int left = 0 , temp = 0 ; 

        for(int i=0 ; i < arr.length ; i++){

            if(arr[i] < 0){
                temp = arr[left] ; 
                arr[left] = arr[i] ; 
                arr[i] = temp ; 
                left++ ;  
            }
        }

        System.out.println("\n modified array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}