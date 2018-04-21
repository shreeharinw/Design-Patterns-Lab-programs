import java.util.ArrayList;

public class MyClass {
	ArrayList<Observer> student = new ArrayList<Observer>();
	String s="";
	public void register(Observer e) {
		student.add(e);
	}
	public void unregister(Observer e) {
		int i = student.indexOf(e);
		if(i>=0)
		{	student.remove(i);
		System.out.println(e + " student removed successfully");
		}
		else
			System.out.println("student doens't exist");
	}
	public void notifyObserver() {
		for(Observer o : student) {
			o.update(s);
		}
	}
	public void setAnnouncement(String s) {
		this.s = s;
		notifyObserver();
	}
}
