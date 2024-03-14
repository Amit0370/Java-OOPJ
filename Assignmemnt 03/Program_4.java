public class Program_4 {
    public static void main(String[] args) {
        int intValue = 10;
        
        double doubleValue = intValue;
        
        float floatValue = intValue;
        
        String stringValue = Integer.toString(intValue);
        
        System.out.println("Widening conversion from int to double: " + doubleValue);
        System.out.println("Widening conversion from int to float: " + floatValue);
        System.out.println("Conversion from int to String: " + stringValue);
    }
}
