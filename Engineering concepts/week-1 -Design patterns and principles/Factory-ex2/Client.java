
public class Client {
	public static void main(String args[]) {
 FactoryDocument f=new FactoryDocument();
 Document d=f.createDocument("Excel");
 d.createDocument();
		 }
}
