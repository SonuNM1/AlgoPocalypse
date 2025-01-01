public class BinarySearch{
    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7,8} ; 

        int target = 7; 

        int result = search(arr, target) ; 

        if(result == -1){
            System.out.println("element not found in array");
        }
        else{
            System.out.println("element present at index: " + result);
        }

    }

    public static int search(int[] sortedArr, int target){

        int left = 0 ; 
        int right = sortedArr.length-1 ; 

        while (left <= right){
            
            int mid = (left+right)/2 ; 

            if(sortedArr[mid] == target){
                return mid ; 
            }
            else if(sortedArr[mid] < target){
                left = mid +1 ; 
            }
            else{
                right = mid-1 ; 
            }

        }


        return -1 ; 

    }
}