package src.words;

public class ByteWordFactory implements WordFactory {

	public Word word(String value) {   // Ska returtypen vara ByteWord?
		return new ByteWord(value);
	}
}