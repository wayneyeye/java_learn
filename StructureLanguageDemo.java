/*
if while for break continue in one shot
- if with multiple conditions
if (condition 1){
	cmd1 to exe
	cmd2 to exe
	...
}
//optional
else if(condition 2){
	cmd 1 to exe
	...
}
else if(condition 3){
	cmd 1 to exe
	...
}
else{
	cmd 1 to exe
	...
}

- while loop
while (condition){
	cmds to execute
}
- for loop
for (initialize;condition;increment){
	cmds to execute
}
- do while loop
do {
	cmds to execute
}
while (condition); // will always execute before condition
use break to end the current loop stmt
use continue to end the current iteration and skip to the next iteration
*/
public class StructureLanguageDemo{
	public static void main(String[] arg){
		//if-else use shorthand
		int i=10;
		int j=11;
		int k = i>j ? i:j;
		System.out.println(k);
		
		// for loop demo
		for(int ii=0;ii<=100;ii++){
			System.out.println(ii);
		}
	}
}