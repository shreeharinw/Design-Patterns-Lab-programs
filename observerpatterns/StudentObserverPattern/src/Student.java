public class Student implements Observer {
	MyClass myclass;
	String name;
	public Student(MyClass myclass,String name) {
		this.myclass = myclass;
		myclass.register(this);
		this.name =name;
	}
	@Override
	public void update(String announce) {
		// TODO Auto-generated method stub
		System.out.println(this +" you have a annoucnement " + announce);
	}
	public String toString()
	{
		return name;
	}
}
