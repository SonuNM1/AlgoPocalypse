public class IntegerOccur{
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,12,3} ; 
        int target = 8; 

        int index = findOccurence(arr, target) ; 

        if(index != -1){
            System.out.println("\n Element found at index: " + index);
        }else{
            System.out.println("\n not found");
        }

    }
    public static int findOccurence(int[] arr, int target){

        for(int i=0 ; i < arr.length ; i++){
            if(target == arr[i]){
                return i ; 
            }
        }
        return -1 ; 
    }
}