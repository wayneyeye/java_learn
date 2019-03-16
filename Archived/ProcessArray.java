interface Command{
	public void process(int[] target);
}

public class ProcessArray
{
	public void process(int[] target, Command cmd)
	{
		cmd.process(target);
	}
}