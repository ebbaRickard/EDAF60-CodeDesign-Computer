package src.computer;

import java.util.ArrayList;
import java.util.List;

import src.words.*;

public class Memory {

    private List<Word> cells;

    public Memory(int size, WordFactory wf) {
        cells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            cells.add(wf.word("0"));
        }

    }

    public Word read(Address a) {
        return cells.get(a.getIndex());
    }

}
