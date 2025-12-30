This project implements a vehicle management system in Java to demonstrate the principles of inheritance, composition, abstraction, and method overriding. 
The system describes different types of vehicles (car, motorcycle, truck) and their relationships with drivers.
Inheritance: All vehicle types inherit from the abstract Vehicle class.
Composition: Each Vehicle subclass contains a Driver object, combining objects into a single function.
Abstraction: The Vehicle class defines abstract methods that must be implemented by subclasses.
Superclass: Vehicle, the parent class from which child classes inherit properties and methods.
Subclasses: Car, Motorcycle, and Truck, classes that inherit fields and methods from the superclass.
Overrides: startEngine(), stopEngine(), allow a class to inherit from a superclass whose behavior is "similar enough" and then modify that behavior as needed.
Access modifiers:
protected makes fields, methods, and constructors accessible to all descendant classes.
abstract (non-access modifier) ​​is used to create abstract classes and abstract methods.
Instructions to Compile and Run: Open a terminal in the project directory and run: javac *.java java Main
Inheritance allows you to implement complex designs with a clear hierarchy, making your code easier to understand and scale. You don't need to rewrite the same properties in different objects. 
Method overriding allows each vehicle type to implement its own engine behavior while maintaining a consistent interface.
