public class OneDimArrays {
    public static void main(String[] args) {
        
        int[] oneDimArray = new int[10];
        oneDimArray[0] = 1;
        oneDimArray[1] = 1;
        System.out.println("Length of the array: " + oneDimArray.length);
        System.out.println("Index 0: " + oneDimArray[0]);
        System.out.println("Index 1: " + oneDimArray[1]);
        for (int index = 2; index < oneDimArray.length; index++) {
            oneDimArray[index] = oneDimArray[index-1] + oneDimArray[index-2];
            System.out.println("Index " + index + ": " + oneDimArray[index]);
        }

    }
}