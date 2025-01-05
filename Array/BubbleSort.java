public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 5, 4} ; 
        int temp = 0 ; 

        System.out.println("\n Before sorting: ");

        for(int num: arr){
            System.out.print(num + " ");
        }

        for(int i=0 ; i < arr.length ; i++){
            for(int j=0 ; j < arr.length-i-1 ; j++){

                if(arr[j] > arr[j+1]){
                    temp = arr[j] ; 
                    arr[j] = arr[j+1] ; 
                    arr[j+1] = temp ; 
                }

            }
        }

        System.out.println("\n After sorting");

        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
