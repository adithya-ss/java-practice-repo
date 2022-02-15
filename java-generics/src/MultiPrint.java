public class MultiPrint <typeA, typeB> {
    typeA valueA;
    typeB valueB;
    MultiPrint(typeA valA, typeB valB){
        this.valueA = valA;
        this.valueB = valB;
    }
    public typeB returnSecondValue() {
        return valueB;
    }
}
