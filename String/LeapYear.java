public class LeapYear {
    public static void main(String[] args) {
        
        int year = 2024 ; 

        boolean isLeapYear = false ; 

        // check if the year is divisible by 400

        if(year % 400 == 0){
            isLeapYear = true ; 
        }

        // Check if the year is divisible by 100 but not by 400

        else if(year % 100 == 0){
            isLeapYear = false ; 
        }

        // Check if the year is divisible by 4 but not by 100

        else if(year % 4 == 0){
            isLeapYear = true ; 
        }

        // If none of the above conditions are met, it is not a leap year

        else{
            isLeapYear = false ; 
        }

        if(isLeapYear){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

    }
}
