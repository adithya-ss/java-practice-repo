import java.util.*;

class DynamicArrayListDemo {
    public static void main(String[] args) {
        // final int INITIAL_CAPACITY_A = 5;
        final int INITIAL_CAPACITY_B = 50;
        // ArrayList<String> dynamicArrLst = new ArrayList<>(INITIAL_CAPACITY_A);
        ArrayList<String> dynamicArrLst = new ArrayList<>(INITIAL_CAPACITY_B);

        System.out.println("Initial capacity: " + dynamicArrLst.size());
        //System.out.println("Capacity Defined: " + INITIAL_CAPACITY_A);
        System.out.println("Capacity Defined: " + INITIAL_CAPACITY_B);
        
        
        dynamicArrLst.add("Pen");
        dynamicArrLst.add("Pencil");
        dynamicArrLst.add("Eraser");
        dynamicArrLst.add("Sharpner");
        dynamicArrLst.add("Book");
        // Capacity of the ArrayList has been exceeded. But when further elements are added, 
        // the size changes during run time, to accomodate new values.
        dynamicArrLst.add("Calculator");
        dynamicArrLst.add("Watch");
        dynamicArrLst.add("Bottle");

        for (String item: dynamicArrLst) {
            System.out.println(item);
        }

        System.out.println("Current capacity: " + dynamicArrLst.size());

    }
}