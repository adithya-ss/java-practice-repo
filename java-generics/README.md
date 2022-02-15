Generics:

- Avoid code duplication for same operations but different data types or type of objects.
- Generics enables flexibity for multiple types.
- Wrapper classes have to be used instead of primitive types.
- Commonly used with Collections framework.
    Example: ArrayList<Vehicle> vehicleType = new ArrayList();
- Bounded generics are those where a limit to which type has been specified. 
    Example: ClassName(T extends <Bound_To_Type>)
- Multiple bounds: More than one limit can be specified. Seperated by '&'.
    Syntax: ClassName(T extends <type_a> & <type_b>)
- Generic methods: Which can accept any type of arguments/values.
    Example: public static <generic_type> void methodName(generic_type args)
- Generic types can also be returned from a method. Just replacing data type with the generic type.
- Unknown generic types are specified by using '?' wildcard.
