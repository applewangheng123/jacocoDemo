package panda;
import com.wh.Count;
import org.testng.annotations.Test;
public class CountTest {

    @Test
    public void testAdd() {

        Count count = new Count();
        int result = count.add(2,2);
    }
}
