package singletonPattern;

public class Demo {
  public static void main(String args[]) {
	  Logger l= Logger.getInstance();
	  Logger l2=Logger.getInstance();
	  System.out.println(l.hashCode());
	  System.out.println(l2.hashCode());
  }
}
