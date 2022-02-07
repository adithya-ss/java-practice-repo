Object Finalize:

- "Object" class is the root of the class heirarchy. 
- Every class inherits methods of this class.
- finalize is called by the garbage collector when it determines that there are no more references to the object.
- protected methods since the JVM calls it, not the programmer.

Garbage Collector:
- Helps in freeing up memory by cleaning up unused/daemon objects.
- Runs asynchronously.