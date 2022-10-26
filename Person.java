
public class Person {
	private String name;
	private int age;
	private int ssn;
	private Person[] children= new Person[3];
	private int nchild=0;
	
	public Person(String a,int num1,int num2) {
		this.name=a;
		this.age=num1;
		this.ssn=num2;
	}
	
	public void addChild(Person child) {
		children[nchild]=child;
		nchild++;
	}
	public int getAge() {
		return age;
	}
	public int getSsn() {
		return ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String a1) {
		this.name=a1;
	}
	public void setAge(int a2) {
		this.age=a2;
	}
	public void setSsn(int a3) {
		this.ssn=a3;
	}
	
	public void sayHello() {
		System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
	}
	
	public void saySsn() {
		System.out.println("My SSN is "+ getSsn());
	}
	
	public String toString() {
		String a="I am " + name+ " I am " + age +" years old and my SSN is "+ ssn +" i have "+nchild+" children. Their name(s) and age(s) are: ";
		for(int i=0;i<nchild;i++) {
			a+=children[i].getName()+" " + children[i].getAge()+" ";
		}
		return a;
	}
}
