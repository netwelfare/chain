import org.apache.commons.chain.Context;
import org.apache.commons.chain.generic.DispatchCommand;

public class MyCommand extends DispatchCommand
{
	public void sayHello(Context context)
	{
		System.out.println(context.get("say").toString());
	}

	public void sayMorning(Context context)
	{
		System.out.println(context.get("sayMoring").toString());
	}
}
