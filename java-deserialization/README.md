Deserialization:

- Convert byte stream into object.
- Read from .ser file.
- The class' definition is not recorded while deserializing. This is why we have to cast it as object type (that perticular data type of that object).
- If the casting of the object type is not done, the compiler will give us a type mismatched error.
- Transient data are not serialized. Hence will not be retrived while deserializing.
- SerialVersionUID is obtained from the class file which serialized the data.