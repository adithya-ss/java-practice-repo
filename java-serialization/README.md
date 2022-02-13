Serialization:

- Converting an object into a byte stream. 
- This saves the state of the object even after the program execution has completed.
- The reverse process is called deserialization, where a byte stream is converted into an object.
- Can be transfered into a different machine and it works, since byte streams are platform independant.
- Byte stream - .str file extension
- When the values change and the object is serialized again, the .ser file get overwritten with new data.
- Serialization can be inherited by child classes.
- Transient data will be ignored while serializing.
- SerialVersionUID can be manually defined, which can also act as some sort of versioning the class file. This has to be private static final. The same SerialVersionUID will be referenced in the class which deserializes the data.