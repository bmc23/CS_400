import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSuite {

    protected ListADT _instance = null;

    @BeforeEach
    public void createInstane() {
        _instance = new MyList<Integer>();
    }

    @Test
    public void test1000Inserts() {
	// This tests inserts 1000 integers into the list and then
	// checks if they're in the list at the expected index
        for (int i = 0; i < 1000; i++) {
            _instance.add(i);
	}
	for (int i = 0; i < 1000; i++) {
	    assertEquals(i, _instance.get(i));
    }
    }
	// TODO: Complete this test. The test should insert 10 integers, and check if the .size()
	// method of ListADT returns the correct result after inserting each one of them into the list.
    @Test
    public void testInsertSize(){
	for(int i = 0; i < 10; i++){
	    _instance.add(i);
	    assertEquals(i+1, _instance.size());

	}


    }
    // TODO: Write a third test method that inserts 10 integers into the list, then removes them again
    // and checks after each remove if the .size() method of ListADT returns the correct result.
    @Test
    public void testRemoveSize(){
	for(int i = 0; i < 10; i++){
	    _instance.add(i);
	}
	for(int i = _instance.size()-1; i >= 0; i--){
	    _instance.remove(i);
	    assertEquals(i, _instance.size());
	}

    }
}

