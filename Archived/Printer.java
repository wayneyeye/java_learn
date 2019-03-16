interface Product{
	int getProduceTime();
}

public class Printer implements Output,Product{
	private String[] printData=new String[MAX_CACHE_LINE];
	private int dataNum=0;
	public void out(){
		while(dataNum>0){
			System.out.println("Printer: "+printData[0]);
			// bring forward elements in the array
			// Parameters : 
			// 	source_arr : array to be copied from
			// 	sourcePos : starting position in source array from where to copy
			// 	dest_arr : array to be copied in
			// 	destPos : starting position in destination array, where to copy in
			// 	len : total no. of components to be copied.
			System.arraycopy(printData,1,printData,0,--dataNum);

		}
	}
	public void getData(String msg){
		if (dataNum>=MAX_CACHE_LINE)
		{
			System.out.println("Full queue, failed to add data!");
		}
		else
		{
			printData[dataNum++]=msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}
	public static void main(String[] args){
		Output o=new Printer();
		o.getData("1A");
		o.out();
		Product p=new Printer();
		System.out.println(p.getProduceTime());
	}
}