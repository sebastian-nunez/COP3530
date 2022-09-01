# Java Review

## Inheritance - "Is a" Relationships

```java
public class AirlineEmployee extends Employee {

    public AirlineEmployee() {
        super(); // calls the parent's constructor

        // inherited fields or methods (that are public or protected can be accessed using 'this')
    }

    @Override
    public int printSalary() {
        // print
    }
}

```

## Abstract Classes

- Class that contains abstract method (methods without implementation)

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
