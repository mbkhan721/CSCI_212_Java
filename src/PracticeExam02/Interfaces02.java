package PracticeExam02;

public class Interfaces02 {
}


/* 1. Understand the difference between a Class and an Interface
   2. Understand that classes are extended and interfaces are implemented

Class:
A class is a blueprint from which objects are created. It has methods and variables that
all objects can use.
* Modifiers - A class can be public or has default access.
* Class name - The class name begins with a letter.
* Superclass - The name of the class parent, if any, preceded by the keyword extends. A
                class can only extend one parent.
* Interfaces (if any) - A comma-separated list of interfaces implemented by the class, if
any, preceded by the keyword implements. A class can implement more than one interface.
* Body - The class body is surrounded by curly braces.


Interface:
An interface can also have methods and variables, but methods are declared abstract by
default.
* Interface specify what a class must do and not how. It is a blueprint of the class.
* It specifies the methods that the class has to implement.
* If a class implements an interface and does not provide method bodies for all functions
in the interface, then class must be declared abstract.
* A java library is an example.

interface <interface_name> {

    // declare constant fields
    // declare methods that abstract
    // by default.
}

// Java program to demonstrate
// working of interface.

import java.io.*;

// A simple interface
interface in1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class testClass implements in1 {

	// Implementing the capabilities of
	// interface.
	public void display()
	{
		System.out.println("Geek");
	}

	// Driver Code
	public static void main(String[] args)
	{
		testClass t = new testClass();
		t.display();
		System.out.println(a);
	}
}


Java does not divide a class definition into two files. Instead, java has the interface and
and implementation of a class mixed together into a single file. Javadoc automatically extracts
the interface from a class definition.

*/

