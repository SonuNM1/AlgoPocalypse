
/* reverse the array without creating any new array - reverseInPlace - two pointers approach */

public class ReverseArray2 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5} ; 

        System.out.println("\n Original array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

        reverseInPlace(arr) ; 

        System.out.println("\n Reversed array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static void reverseInPlace(int[] arr){

        int left = 0 ; 
        int right = arr.length-1 ; 
        int temp = 0 ; 

        // swap elements at left and right indices 

        while(left < right){
             temp = arr[left] ; 
             arr[left] = arr[right] ; 
             arr[right] = temp ; 

             left++ ; 
             right-- ; 
        }

    }
}
