package words;

public class ByteWordFactory implements WordFactory {

	public Word word(String value) {
		System.out.println("Hej!");
		return new ByteWord(value);
	}
	

}
