- create javadoc
```bash
javadoc \
-d apidoc \
-windowtitle TestDoc \
-doctitle Learning \
-header this is the header \
-author -version \
*Test.java
```
- Primitive Types 
	- boolean
	- byte
	- short
	- int
	- long
	- char
	- float
	- double

- Comparable Operator
	- == 

- ternary operator
	- (expression) ? if-true-statement : if-false-statement;

- if
```java
if (logic expression)
{
	statement...
}
else if (logic expression)
{
	statement...
}
...
else 
{
	statement...
}
```

- for loop
```java
for {init_statement;test_expression;iteration_statement}
{
	statement....
}
```

- use break/continue to break/continue nested loops
```java
outer:
for {init_statement;test_expression;iteration_statement}
{
	for {init_statement;test_expression;iteration_statement}
	{
		statement....
		if (logic expression)
		{
			break/continue outer;
		}
	}
}
```

- arrays in java
	- initialization
		- static
		- dynamic

- variable number of args 
```java
methodName(type... argName){
	for (a:argName){
		statement ...
	}
}
```

- method overload
	- different parameters
	- cannot use the return type to implement the overload

- access control for the member variables
	- private <-- accessed by itself only
	- default <-- accessed by the same package
	- protected <-- accessed by child classes/instances
	- public <-- open access

- Inheritate
```java
xxx class SubClass extends SuperClass{
	definitions...
}
```

- Polymorphism
before cast type , run instanceof to improve robustness

- other OO concepts
	- Wrapper class for 8 primitive types
		- char --> Character
		- int --> Integer
		- Autoboxing : no need to do type cast when convert between primitive type and wrapper class
		- parseXxx(String s) and valueOf(String s) Static methods to convert String to primitive types
		- use String.valueOf(primitive) to convert primitives back to String / or use the short cut primitive type + ""
		- use the .compare(xxx val1, xxx val2) to compare

	- toStirng() method
		- if no such method print returns classname@hashCode

	- final
		- final prohibits the inherit and re-assigining of values to an instance
		- immutables =  final + private

	- abstract classes

	- interface 
	its a convention to use adj. to name interface
```java
		... interface I1 extends SI1,SI2, ...
		{
			definitions
		}
```
		- use interface
```java
		... class C1 implements SI1,SI2, ...
		{
			definitions
		}
```