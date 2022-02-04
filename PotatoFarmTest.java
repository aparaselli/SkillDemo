import static org.junit.Assert.*;
import org.junit.*;

public class PotatoFarmTest{
	@Test
	public void grow() {
	   assertEquals(PotatoFarm.grow(),"A potato has sprouted");
	}
}
