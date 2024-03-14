public class Program_3 {
    public static void main(String[] args) {

        int intValue = 5;
        double doubleValue = 3.5;
        float floatValue = 2.5f;
        
        double result1 = intValue + doubleValue; 
        double result2 = doubleValue * floatValue; 
        float result3 = intValue - floatValue;  
        
        System.out.println("Result of widening conversion from int to double: " + result1);
        System.out.println("Result of widening conversion from float to double: " + result2);
        System.out.println("Result of widening conversion from int to float: " + result3);
    }
}
