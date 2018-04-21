
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass sem6c = new MyClass();
		Student c1 = new Student(sem6c,"hari");
		Student c2 = new Student(sem6c,"pruthvi");
		Student c3 = new Student(sem6c,"rakshit");
		sem6c.setAnnouncement("class preponed");
		sem6c.unregister(c2);
		sem6c.setAnnouncement("class postponed");
	}

}
