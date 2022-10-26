
public class TestPerson {
	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0]=new Person("A",40,123);
		people[1]=new Person("B",25,234);
		people[2]=new Person("C",20,345);
		people[3]=new Person("D",30,456);
//		System.out.println(people[0].getAge());
		int sum=0;
		for(int i=0;i<people.length;i++) {
			sum+=people[i].getAge();
		}
		System.out.println("Total of age: " +sum);
		Person g= new Person("Child1",3,111);
		people[0].addChild(g);
//		people[0].toString();
		System.out.println(people[0]);
	}
}
