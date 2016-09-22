public class Gender{
	static final int MALE = 0;
	static final int FEMALE = 1;
	
	static String show(int g){
		switch g{
			case MALE; return "male";
			case FEMALE; return "female";
			default; return "???";
		}
	}
}