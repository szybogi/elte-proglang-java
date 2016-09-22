public class Person{
	String lastName;
	String firstName;
	int gender;
	int birthYear;
	
	Person(String lN, String fN, int g, int bY){
		lastName=lN;
		firstName=fN;
		gender=g;
		birthYear=bY;
	}
	
	public static Person makePerson(String lN, String fN, int g, int bY){
		if(!lN.isEmpty()&& !fN.isEmpty() && 1880<=bY && 2016>=bY ){
			return new Person(lN,fN,g,bY);
		}
		return null;
	}
	
	public String show(){
		return String.format("Person { name = \"%s\", gender = %s, birthYear = %d }" +
		firstName +" "+lastName,show(gender), birthYear);
	}
	
	public boolean equals(Person other){
		return other!=null && show(other.show());
	}
	
}