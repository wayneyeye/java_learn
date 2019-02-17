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
