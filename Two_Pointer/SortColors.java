package Two_Pointer;

public class SortColors {
    public static void main(String[] args) {
        
        int[] nums = {0,0,2,1,2,1,0,1,2,2,0,1} ;

        int countOfZero = 0, countOfOne = 1 , countOfTwo = 0 ; 

        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] == 0) countOfZero ++ ; 
            if(nums[i] == 0) countOfOne ++ ; 
            if(nums[i] == 0) countOfTwo ++ ; 
        }

        for(int i=0 ; i < countOfZero ; i++){
            nums[i] = 0 ; 
        }

        for(int i=countOfZero ; i < (countOfZero + countOfOne) ; i++){
            nums[i] = 1 ; 
        }

        for(int i= (countOfZero+countOfOne) ; i < nums.length ; i++){
            nums[i] = 2 ; 
        }

        for(int element : nums){
            System.out.print(element + " ");
        }

    }
}
