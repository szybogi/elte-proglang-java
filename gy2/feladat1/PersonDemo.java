public class PersonDemo{
	public static void main(String[] args){
		Person p0 = makePerson("Smith","John",Gender.MALE,1968);
		System.out.println(p0.show());
		Person p1 = makePerson("Smith","",Gender.MALE,1968);
		System.out.println(p1.show());
		System.out.println(p0.equals(p1));
		System.out.println(p1.equals(p0));
	}
	
}