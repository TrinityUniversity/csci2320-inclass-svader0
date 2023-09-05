package csci2320.Sequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeqTest {
    private LinkedSeq<Integer> seq;

    @BeforeEach
    void createSeq() {
        this.seq = new LinkedSeq<>();
    }

    @Test
    void insert3() {
        LinkedSeq<Integer> seq = new LinkedSeq<>();
        seq.add(5);
        seq.add(10);
        seq.add(15);
        assertEquals(5, seq.get(0));
        assertEquals(10, seq.get(1));
        assertEquals(15, seq.get(2));
    }
}
