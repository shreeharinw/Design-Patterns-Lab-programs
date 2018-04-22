public class SinglePatternDemo {
   public static void main(String[] args) {

      SingleObject object = SingleObject.getInstance();
      SingleObject object1 = SingleObject.getInstance();
      //show the message
      object.showMessage();
      object.addURL("facebook");
      object1.addURL("Youtube");
      object.display();
     
   }
}
