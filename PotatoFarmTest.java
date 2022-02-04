import static org.junit.Assert.*;
import org.junit.*;

public class potatoFarmTest{
	@Test
	public void grow() {
	   assertEquals(PotatoFarm.grow(),"A potato has sprouted");
	}
}
