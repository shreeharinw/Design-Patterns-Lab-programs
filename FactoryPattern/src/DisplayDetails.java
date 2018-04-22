public class DisplayDetails {
	
	public static void main(String args[]) {
		DisplayDetailsFactory ddf = new DisplayDetailsFactory();
		CustomerTypeHierarchy c1 = ddf.getCutomerType("Gender", "Male", "hari", 12);
		c1.displayDetials();
	}

}