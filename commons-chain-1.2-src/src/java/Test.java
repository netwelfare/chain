import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

public class Test
{

	public static void main(String[] args) throws Exception
	{
		MyCommand command = new MyCommand();
		command.setMethod("sayHello");
		Context context = new ContextBase();
		context.put("say", "hello world!");
		context.put("sayMoring", "good moring");
		command.execute(context);
		command.setMethod("sayMorning");
		command.execute(context);
		//System.out.println(result);
	}

}
