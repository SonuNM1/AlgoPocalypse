public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5} ; 

        int[] reverseArray = new int[arr.length] ; 

        int index = 0 ; 

        for(int i=arr.length-1 ; i >= 0 ; i--){
            reverseArray[index] = arr[i] ; 
            index++ ; 
        }

        System.out.println("Original array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

        System.out.println("Reverse array: ");

        for(int element: reverseArray){
            System.out.print(element + " ");
        }

    }
}
