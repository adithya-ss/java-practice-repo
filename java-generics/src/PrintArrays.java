public class PrintArrays {
    public static void main(String[] args) {
        Integer[] arrayOfInts = {1,2,3,4};
        Double[] arrayOfDoubles = {1.1,2.2,3.3,4.4};
        Boolean[] arrayOfBools = {true,false,true,false};
        String[] arrayOfStrings = {"Football","FormulaOne","Tennis","Basketball"};
        // Generic Methods
        printArrayValues(arrayOfInts);
        printArrayValues(arrayOfDoubles);
        printArrayValues(arrayOfBools);
        printArrayValues(arrayOfStrings);
        System.out.println();
        // Generic return types
        System.out.println("3rd integer: " + getThirdIndexValue(arrayOfInts));
        System.out.println("3rd double value: " + getThirdIndexValue(arrayOfDoubles));
        System.out.println("3rd boolean value: " + getThirdIndexValue(arrayOfBools));
        System.out.println("3rd string value: " + getThirdIndexValue(arrayOfStrings));
    }
    
    public static <T> void printArrayValues(T[] myArray) {
        System.out.print("Type of " + myArray.getClass().getSimpleName() + " --> ");
        for (T val : myArray) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static <Type> Type getThirdIndexValue(Type[] myArray) {
        return myArray[2];
    }
}
