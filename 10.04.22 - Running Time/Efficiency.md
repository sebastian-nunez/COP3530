# Running Times of Programs

## Date() and .getTime() Usage

```java
Date current = new Date(); // Date gets all system info right now
long start = current.getTime(); // acess current system time (ms) from Date

int min = minimum(a, a.length); // code to be timed...

current = new Date(); // update the date to reflect current time
long stop = current.getTime();

long elapsed = stop - start;

System.out.println("\nMin= " + min + ", time=" + elapsed + "ms");
```
