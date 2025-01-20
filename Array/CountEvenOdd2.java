public class CountEvenOdd2 {
    public static void main(String[] args) {
        
        int num = 12345 ; 
        int oddCount = 0 , evenCount = 0 ; 
        int lastDigit = 0 ; 

        int[] evenArr ; 
        int[] oddArr ; 

        int tempNum = num ; 

        // counting the number of digits first 

        while(tempNum != 0){
            lastDigit = tempNum % 10 ; 
            tempNum = tempNum / 10 ; 

            if(lastDigit % 2 == 0){
                evenCount ++ ; 
            }else{
                oddCount++ ; 
            }
        }

        // initializing array with correct sizes 

        evenArr = new int[evenCount] ; 
        oddArr = new int[oddCount] ; 

        System.out.println("Even digit: " + evenCount + ", " + "Odd digit: " + oddCount) ; 

        // populating the arrays with the odd or even numbers 

        tempNum = num ; 
        int evenIndex = 0 , oddIndex = 0 ; 

        while(tempNum != 0){
            lastDigit = tempNum % 10 ; 
            tempNum = tempNum / 10 ;

            if(lastDigit % 2 == 0){
                evenArr[evenIndex] = lastDigit ; 
                evenIndex++ ;
            }
            else{
                oddArr[oddIndex] = lastDigit ;
                oddIndex++ ; 
            }
        }

    }
}
