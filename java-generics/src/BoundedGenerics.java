public class BoundedGenerics <T extends Number, V extends CharSequence> {
    T valueA;
    V valueB;
    BoundedGenerics(T valA, V valB){
        this.valueA = valA;
        this.valueB = valB;
    }
    public T returnFirst() {
        return valueA;
    }

}
