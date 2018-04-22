import java.util.ArrayList;

public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private ArrayList<String> historyurl = new ArrayList<String>();
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
   public void addURL(String url) {
	   historyurl.add(url);
   }
   public void display() {
	   for(String a : historyurl) {
		   System.out.println(a);
	   }
   }
}
