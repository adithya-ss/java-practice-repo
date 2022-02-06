Abstractions:

- Abstract classes are basically a bunch of variables and methods which can be used to create another class.
- Classes which are defined as abstract, will be EXTENDED by other classes.
- Abstract methods are unimplemented methods. Meaning, only the structure is defined. Not the logic.
- Abstract classes make sure that a specific functionality (method) defined as abstract will be fulfilled (used) inside the class which extends it. 
Example: createdBy method when defined as abstract, makes sure that every programming language class has a creation date. There can not be any programming language class name not having a creation date.

How is it different than an interface?
- The main difference is that interfaces allow only unimplemented methods to be listed inside of it. Whereas, abstract classes allow methods with and without implementations inside of them. Interfaces are strictly abstract and they assume their methods are so. 