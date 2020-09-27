package src.words;

public class ByteWord extends Word {

    private byte value;

    public ByteWord(String value) {
        this.value = Byte.parseByte(value);
    }

    public void add(Word word1, Word word2) {
        ByteWord w1 = (ByteWord) word1;
        ByteWord w2 = (ByteWord) word2;
        this.value = (byte) ((byte) w1.getValue() + w2.getValue());

    }

    public void mul(Word word1, Word word2) {
        ByteWord w1 = (ByteWord) word1;
        ByteWord w2 = (ByteWord) word2;
        this.value = (byte) ((byte) w1.getValue() * w2.getValue());
    }

    public void write(Word word) {
        ByteWord w = (ByteWord) word;
        this.value = w.getValue();
    }

    public boolean equals(Word word) {
        ByteWord w = (ByteWord) word;
        return this.getValue() == w.getValue();
    }

    public String toString() {
        return Byte.toString(this.value);
    }

    public byte getValue() {
        return this.value;
    }

}