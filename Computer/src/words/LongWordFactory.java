package words;

public class LongWordFactory implements WordFactory{

	public Word word(String value) {
		return new LongWord(value);
	}
	
	public void testMethod() {
		System.out.println("Hejsan");
	}
	

}
