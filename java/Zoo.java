package zoo;

public class Zoo {
	private int actual_num_animals = 0;
	private int num_cages;
	private Animal[] animals;

	Zoo() { // default num_cages will be 3
		num_cages = 3;
		animals = new Animal[num_cages];
	}

	Zoo(int num_cages) {
		this.num_cages = num_cages;
		animals = new Animal[this.num_cages];
	}

	public void add(Animal a) {
		if (num_cages == actual_num_animals) {
			System.out.println("There is no space left for more animals ");
		} else {
			
			animals[actual_num_animals]= a;
			actual_num_animals++;
		}

	}

	public double total_weight() {
		double sum = 0;

		for (int i = 0; i < animals.length; i++) {
			sum += animals[i].getWeight();
		}

		return sum;

	}

	public void make_all_noises() {

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].makeNoise());
		}

	}

	public void print_all_animals() {
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

	}
	 public static void main(String[] args) {
		 Zoo z = new Zoo(); 
		 Snake sly = new Snake("Sly", 5.0 , 2, 2);
		 Snake sly2 = new Snake("Slyme", 10.0 , 1, 2); 
		 Cow blossy = new Cow("Blossy", 900., 5,  10); 
		 Horse prince = new Horse("Prince", 1000., 5, 23.2); 
	 
	// Following not allowed because Animal is abstract
		 //Animal spot = new Animal("Spot", 10., 4); 
	z.add(sly);
	z.add(sly2);
	z.add(blossy);
	z.add(prince);
	z.make_all_noises();
	System.out.println("Total weight =" + z.total_weight());
	System.out.println("**************************"); 
	System.out.println("Animal Printout:"); 
	z.print_all_animals();
	System.out.println("********* Now we will make the Second Zoo"); 
	Zoo z2 = new Zoo(5);
	z2.add(sly);
	z2.add(sly2);
	z2.add(blossy);
	z2.add(prince);
	z2.add( new Horse("Warrior", 1200, 6, 25.3)); 
	z2.add( new Horse("Harry", 1100, 4, 21.3)); 
	System.out.println("Total weight of z2="+z2.total_weight());
	z2.make_all_noises();
	z2.print_all_animals(); 
	}


}

abstract class Animal {
	private String name;
	private double weight;
	private int age;

	public Animal() {
		name = " ";
		weight = 0;
		age = 0;
	}

	public Animal(String n, double w, int a) {
		name = n;
		weight = w;
		age = a;
	}

	public abstract String makeNoise();

	public double getWeight() {
		return weight;
	}

	public String toString() {
		String aniInfo = String.format("%s\n  %3.2f lbs.\n  %d years old\n", name, weight, age);
		return aniInfo;

	}
}

class Cow extends Animal {
	private int num_spots;

	Cow() {
		super();
		num_spots = 0;
	}

	Cow(String name, double weight, int age, int num_spots) {
		super(name, weight, age);
		this.num_spots = num_spots;

	}

	public String makeNoise() {

		return "Moooooooo";
	}

	@Override
	public String toString() {
		return "Cow: "+ super.toString()+ String.format("  %2d spots\n", num_spots );
	}
}

 class Horse extends Animal {
	private double top_speed;

	Horse() {
		super();
		top_speed = 0;
	}

	Horse(String name, double weight, int age, double top_speed) {
		super(name, weight, age);
		this.top_speed = top_speed;
	}

	public String makeNoise() {
		return "Whiny";
	}

	@Override
	public String toString() {
		return "Horse: "+super.toString()+ String.format("  %2.2f mph\n", top_speed );
	}
}

 class Snake extends Animal {
	private int num_fangs;

	Snake() {
		super();
		num_fangs = 2;
	}

	Snake(String name, double weight, int age, int num_fangs) {
		super(name, weight, age);
		this.num_fangs = num_fangs;
	}

	public String makeNoise() {
		return "Hisssss";
	}

	@Override
	public String toString() {
		return "Snake: " +super.toString()+ String.format("  %2d fangs\n", num_fangs );

	}

}
