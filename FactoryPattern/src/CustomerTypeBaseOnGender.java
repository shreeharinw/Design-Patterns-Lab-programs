public abstract class CustomerTypeBaseOnGender extends CustomerTypeHierarchy {
    public CustomerTypeBaseOnGender(String Name,int  Age) {
    	this.Name= Name;
    	this.Age = Age;
    	
    }

    public String Name;
    public int Age;

    public abstract void displayCustomerType();
    public void displayDetials() {
        // TODO implement here
    	System.out.println("Name " + Name + "age " + Age);
    	displayCustomerType();
    }

}