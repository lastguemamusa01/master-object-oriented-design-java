# master-object-oriented-design-java


class basically contain instructions for how objects should be created and how they should behave in the application

class - blueprint

contructor - provides to construct object

constructor doesn't need to define explicitly because it comes by default if contructor is not declared

module application

memory have heap and stack

stack memory - method like main(), local variables like int - primitive variables -> call methods

stack memory trace method invocations from one class to another class, first that calling is main method

Car myCar - local reference variable - > myCar will be created in the stack inside the main()

myCar will point actual object

myCar = new Car(); 
Car - complex data type - 

myCar - reference variable - refers to where is the actual object is

new Car -> is in the heap

myCar from stack is pointing(memory address) of the Car object that is in the heap memory


example :

myCar = new Car(); 
myCar = new Car(); 

myCar will create new object with new address

Garbage collection -> erase old myCar object in the heap

Garbage collection - is a procwess that runs in the heap and every so often it comes and looks for objects that dont have any relation or pointer to them. eliminate. save memory for future.

Instance variable - variable that belongs to particular instance

class with varible in there is instance variable

```java
Class Car {
    int hp;   // instance variable
    Engine myEngine; 
}

Car my2Car = new Car(); // my2Car is reference Variable
my2Car.HP = 120; // this hp value is in the heap, inside of Car object

Engine bigEngine = new Engine(); // first create the Engine
my2Car.myEngine = bigEngine; // give the reference. the Car object in the heap reference or point to Engine object in the heap
```

int hp // primitive variable
complex variable -> 

