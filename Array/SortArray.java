
public class SortArray {
    public static void main(String args[]){

        int[] arr = {4,1,3,2} ; 

        System.out.println("\n Original array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

        aterArraySort(arr) ; 

        System.out.println("\n After array sorted: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static void aterArraySort(int[] arr){

        int temp = 0 ; 

        for(int i=0 ; i < arr.length ; i++){
            for(int j=i+1 ; j < arr.length ; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i] ; 
                    arr[i] = arr[j] ; 
                    arr[j] = temp ; 
                }

            }
        }

    }

}

// 1 3 4 2
