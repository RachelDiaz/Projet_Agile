package machine_sous;
import org.junit.Assert;
import org.junit.Test;


public class MachineTest {
	Machine machine;
	
	@Test
	public void initMachine_test(){
		machine=new Machine();
		Assert.assertEquals(machine.getCharacter1(), machine.liste(0));
		Assert.assertEquals(machine.getCharacter2(), machine.liste(0));
		Assert.assertEquals(machine.getCharacter3(), machine.liste(0));
	}

}
