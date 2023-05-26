### Low-Level-Design-java (updating...)

# Creation Design Pattern
A creational design pattern is a design pattern in software engineering that deals with object creation mechanisms. These patterns provide ways to create objects in a more flexible, reusable, and decoupled manner. Creational design patterns focus on encapsulating the object creation process and hiding the complexities associated with it.

The primary goals of creational design patterns include:

Encapsulating object creation: Creational patterns separate the responsibility of object creation from the rest of the code, ensuring that the process is decoupled and easier to manage.

Promoting flexibility and re-usability: Creational patterns provide a flexible way to create objects, allowing for the creation of different object configurations and variations without modifying the existing code.

Enhancing performance and resource management: Some creational patterns, such as the Singleton and Object Pool patterns, help optimize resource usage and improve performance by managing the lifecycle and reuse of objects.

By using creational design patterns, developers can achieve a more modular, maintainable, and extensible software design, making it easier to manage object creation and adapt to changing requirements. These patterns provide proven solutions to common object creation problems and promote best practices in software development.


- [Singleton](#singleton)
- [Factory Method](#factory-method)
- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Prototype](#prototype)
- [Object Pool](#object-pool)

# Behavioural Design Pattern
Behavioral design patterns are a set of software design patterns that deal with the interaction and communication between objects in a system. These patterns focus on defining how objects behave and how they collaborate with each other to accomplish tasks and fulfill responsibilities. Behavioral design patterns provide solutions for designing flexible, maintainable, and reusable systems by organizing the behavior of objects in a structured and efficient manner.

These patterns address various aspects of object behavior, such as encapsulating algorithms, managing dependencies, handling communication, and coordinating object interactions. They help separate the responsibilities of different objects, promote loose coupling, and make systems more adaptable to changes## 1)  Strategy Design Pattern
  a)  Vehicle Drive strategy Selection
  b)  Payment Gateway
  c)  Sorting Algorithm Selection
## 2)  Observer Design Pattern
  a)  Stock Market Update
  b)  Weather Station
  c)  Messaging Service
  d)  Online Auction Service
  
# Structural Design Pattern
A structural design pattern is a category of design patterns that focuses on the composition of classes and objects to form larger structures and relationships. These patterns help define how objects and classes can be organized to achieve flexible and efficient system architectures. Structural design patterns primarily deal with the relationship between objects, inheritance, and interface implementation to solve design problems.

Structural design patterns provide solutions for common design issues such as managing relationships between objects, ensuring compatibility between incompatible interfaces, simplifying complex object structures, and enabling flexibility in object composition.

Some key characteristics of structural design patterns include:

Composition: They emphasize the composition of objects and classes to form larger structures.

Relationships: They focus on defining relationships and interactions between objects and classes.

Flexibility: They promote flexible and adaptable architectures by allowing objects and classes to vary independently.

Re-usability: They facilitate the reuse of existing objects and classes by providing a common structure.

By applying structural design patterns, developers can create systems that are easier to understand, maintain, and extend. These patterns can enhance code modularity, improve scalability, and promote code reusability.

## 1)  Decorator Design Pattern
  a)  Pizza Ordering System



## Singleton
Ensures only a single instance of a class is created and provides a global point of access to it.
- Logger classes
- database connection classes

## Factory Method
Defines an interface for creating objects but lets subclasses decide which class to instantiate.
- Document creation in word processors, where different subclasses of the Document class handle the creation of specific document types.
- Vehicle Manufacturing System
-
## Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- GUI toolkits that provide different UI elements such as buttons, menus, and windows for different operating systems.

## Builder:
Separates the construction of complex objects from their representation, allowing the same construction process to create different representations.
- Construction of an HTML document where the same construction process can create different representations like plain text, formatted text, or graphical representation.

## Prototype:
Creates new objects by cloning existing ones, avoiding the need for explicit construction.
- Object cloning in a game to create copies of enemies or game characters.

## Object Pool:
Maintains a pool of initialized objects that are ready for use, allowing efficient object reuse instead of creating new objects.
- Database connection pools, where a set of established connections are managed and reused.

  
