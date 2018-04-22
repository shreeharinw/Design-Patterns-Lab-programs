public class DisplayDetailsFactory {

    public DisplayDetailsFactory() {
    	
    }
    public CustomerTypeHierarchy getCutomerType(String Hierarchy,String typeOfCust,String name,int age) {
    	CustomerTypeHierarchy c;
    	if(Hierarchy.equalsIgnoreCase("Arrival")) {
	    	if(typeOfCust.equalsIgnoreCase("First Time")) {
	    		c = (CustomerTypeBaseOnArrival)new FirstTimeCustomers(name,age);
	    	}
	    	else {
	    		c = (CustomerTypeBaseOnArrival) new RegularCustomers(name,age);
	    	}
    	}
    	else
    	{
    		if(typeOfCust.equalsIgnoreCase("Male")) {
	    		c = (CustomerTypeBaseOnGender)new MaleCustomers(name,age);
	    	}
	    	else {
	    		c = (CustomerTypeBaseOnGender)new FemaleCustomers(name,age);
	    	}
    	}
	    return c;
    }	
}