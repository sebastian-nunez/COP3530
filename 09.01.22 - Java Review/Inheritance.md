# Java Review

## Inheritance - "Is a" Relationships

- allows for traits (fields/methods) to be passed down from parent to child
- children can OVERRIDE the parent's methods

```java
public class AirlineEmployee extends Employee {

    public AirlineEmployee() {
        super(); // calls the parent's constructor

        // inherited fields or methods (that are public or protected can be accessed using 'this')
    }

    @Override
    public void printSalary() {
        System.out.println()
    }
}

```

## Abstract Classes

- Class that contains _abstract methods_ (methods without implementation)

```java
abstract public class GeoObject {
    private Color interiorColor;

    public GeoObject(Color interiorColor) {
        this.interiorColor = interiorColor;
    }

    abstract public double area(); // abstract method
}

public class Point extends GeoObject {
    @Override
    public double area() { // method implementation
        return 0;
    }
}

```

## toString() - **Overrides** the Object Classes toString (Method Override)

- print the information of the class instead of a memory location

```java
public class Data {
    @Override // polymorphism
    public String toString() {
    // whenever you print the object, the toString will run
        return "";
    }
}

```

## Method **Overloading** - Allow multiple methods with similar signatures

- depending on the **parameters** the compiler will know which method to run

```java
public class A {

    public A() { // no parameters

    }

    public A(int x) { // (int)

    }

    public A(int x, double y) { // (int, double)

    }
}

```

## References to Object (pass by reference vs. pass by value)

- Objects are stored on the HEAP

```java
Date date; // object variable
date = new Date(); // object (pointer)


// the ArrayList is passed by reference
public int multiply(ArrayList<Integer> nums, int multiplier) {
    nums.set(0, -1);// affects the actual value of nums outside the method

    int total
    for (Integer num : nums) {

    }
}

```

## Shallow vs Deep Copy

- Shallow copy: creates a reference to the same object

- Deep copy: creates a **NEW** reference to a NEW object

```java
// two references pointing to the same object (SHALLOW COPY)
Point p = new Point(1, 2);
Point q = p;


// Deep copy ('q' is a new object with the same values as 'p')
Point q = new Point(p.getX(), p.getY());

```

## Polymorphism

- "many forms": allows for extra flexibility by changing an object's behavior depending on the type of object (OVERRIDING)

```java

public class Shape {
    public double calculateArea() {

    }
}

```

## Interfaces - Mimic multiple inheritnaces

- all methods are abstract
- you can implement mulpiple interfaces by not multiple classes

```java
public interface A {
    static final int constant;



}

public interface B {

}

public class Parent implements A, B {
    // ...
}


```
