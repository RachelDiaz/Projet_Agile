package machine_sous;
import org.junit.Assert;
import org.junit.Test;


public class MachineTest {
	Machine machine;
	
	@Test
	public void initMachine_test(){
		machine=new Machine();
		Assert.assertEquals(machine.getChar1(), machine.liste(0));
		Assert.assertEquals(machine.getChar2(), machine.liste(0));
		Assert.assertEquals(machine.getChar3(), machine.liste(0));
	}
	
	

}
