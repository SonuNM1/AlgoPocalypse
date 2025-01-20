
public class LinearSearch{
    public static void main(String[] args) {
        
        int num[] = {1, 2, 3, 4} ; 

        int target = 2 ; 
        boolean found = false ; 

        for(int i=0 ; i < num.length ; i++){
            if(num[i] == target){
                System.out.println("\n Element found at index: " + i);
                found = true ; 
                break ; 
            }
        }

        if(!found){
            System.out.println("\n element not found");
        }

    }
}