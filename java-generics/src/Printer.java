public class Printer <T> {
    T value;
    public Printer(T dataValue){
        this.value = dataValue;
    }
    public void printValue(){
        System.out.println("Printing " + value.getClass().getName() + ": " + value);
    }
}
