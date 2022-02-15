public class Generics {
    public static void main(String[] args) {
        Printer<Integer> printInt = new Printer<>(10);
        Printer<Boolean> printBool = new Printer<>(true);
        Printer<Double> printDouble = new Printer<>(33.5);
        Printer<String> printString = new Printer<>("Hey there!");
        System.out.println("Generics...");
        printInt.printValue();
        printBool.printValue();
        printDouble.printValue();
        printString.printValue();

        System.out.println();
        System.out.println("Multiple Generics: Returning 2nd value...");
        MultiPrint<Integer,Double> multiA = new MultiPrint<>(10,19.21);
        MultiPrint<Boolean,String> multiB = new MultiPrint<>(true, "Yes");
        MultiPrint<Double,Boolean> multiC = new MultiPrint<>(33.5, false);
        MultiPrint<String,Integer> multiD = new MultiPrint<>("Hey there!",17);
        MultiPrint<Character,Character> multiE = new MultiPrint<>('$','*');
        System.out.println(multiA.returnSecondValue());
        System.out.println(multiB.returnSecondValue());
        System.out.println(multiC.returnSecondValue());
        System.out.println(multiD.returnSecondValue());
        System.out.println(multiE.returnSecondValue());

        System.out.println();
        System.out.println("Bounded generics: Returning 1st value...");
        BoundedGenerics<Number, String> objA = new BoundedGenerics<>(10, "Ten");
        BoundedGenerics<Double, String> objB = new BoundedGenerics<>(12.12, "Twelve point one two");
        System.out.println(objA.returnFirst());
        System.out.println(objB.returnFirst());
    }
}
