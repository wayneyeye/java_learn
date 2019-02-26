public class CommandTest
{
	public static void main(String[] args){
		ProcessArray pa = new ProcessArray();
		int[] target={3,-4,6,6};
		pa.process(target, new Command(){
			public void process(int[] target){
				int sum=0;
				for(int tmp:target){
					sum+=tmp;
				}
				System.out.println(sum);
			}
		});
	}
}