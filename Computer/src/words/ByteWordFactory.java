package words;

public class ByteWordFactory implements WordFactory {

	public Word word(String value) {
		return new ByteWord(value);
	}
}