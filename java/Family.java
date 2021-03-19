package person;

public class Family {

	private Person[] people;
	private int size_of_family;
	private int memberNum = 0;

	Family(int size_of_family) {
		this.size_of_family = size_of_family;
		people = new Person[size_of_family];
	}

	void addPerson(Person p) {
		boolean same = false;
		if (size_of_family > memberNum) {
			for (int i = 0; i < memberNum; i++) {
				same=false;
				if (people[i].equals(p))
					{same = true;
					System.out.println(p.getName() +" is a duplicate.");}

			}
			if (same == false) {
				people[memberNum] = p;
				memberNum++;
			}
			
		} else
			System.out.println("There are no more people in this family ");
	}

	void printOutFamily() {
		for (int i = 0; i < size_of_family; i++) {
			System.out.println(people[i]);
		}
	}

	public static void main(String[] args) {
		Family f = new Family(8);
		Person fred = new Person("Fred Flintstone", 50);
		System.out.println("created " + fred);
		f.addPerson(fred);
		f.addPerson(fred);
		Student fredStudent = new Student("Fred Flintstone", 50, "Math", 3.1);
		System.out.println("created " + fredStudent);
		f.addPerson(fredStudent);
		Person wilma = new Person("Wilma Flintstone", 48);
		f.addPerson(wilma);
		Student george = new Student("George", 21, "Politics", 3.1);
		System.out.println("created " + george);
		f.addPerson(george);
		george.setName("Georgie");
		f.addPerson(new Student("George", 21, "Politics", 3.1));
		f.addPerson(new Student("John", 18, "Geology", 2.9));
		f.addPerson(new Student("Jane", 21, "Music", 3.2));
		f.addPerson(new Student("Tarzan", 22, "Gymnastics", 4.0));
		f.addPerson(new Student("Jim", 21, "Physics", 2.5));
		f.addPerson(new Person("Robert", 18));
		f.addPerson(new Person("Clemente", 32));
		System.out.println("****** family listing: ");
		f.printOutFamily();
	}

}

class Person {

	private String name;
	private int age;

	public Person() {
		name = " ";
		age = 0;
	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name: %s\nAge: %2d\n", name, age);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (!this.getClass().equals(obj.getClass()))
			return false;
		else {
			Person person = (Person) obj;
			return this.name.equals(person.name) && this.age == person.age;

		}
	}

}

class Student extends Person {
	private String major;
	private double gpa;

	public Student() {
		super("", 18);
		major = "undecided";
		gpa = 2.5;
	}

	public Student(String name, int age, String maj, double gpa) {
		super(name, age);
		major = maj;
		this.gpa = gpa;
	}
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Major: %s\nGPA: %2.2f\n", major, gpa);

	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (!this.getClass().equals(obj.getClass()))
			return false;
		else {
			Student student = (Student) obj;
			return this.major.equals(student.major) && this.gpa == student.gpa && super.equals(student);

		}
	}

}
