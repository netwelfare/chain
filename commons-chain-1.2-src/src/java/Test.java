import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.CatalogFactory;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.CatalogBase;
import org.apache.commons.chain.impl.ContextBase;

public class Test
{

	public static void main(String[] args) throws Exception
	{
		MyCommand command = new MyCommand();
		System.out.println(command);
		command.setMethod("sayHello");
		Context context = new ContextBase();
		context.put("say", "hello world!");
		context.put("sayMoring", "good moring");
		command.execute(context);
		command.setMethod("sayMorning");
		command.execute(context);
		CatalogFactory factory = CatalogFactory.getInstance();
		Catalog catalog = new CatalogBase();
		factory.addCatalog("say", catalog);
		catalog.addCommand("myCommand", command);
		System.out.println(catalog.getCommand("myCommand"));
	}

}
