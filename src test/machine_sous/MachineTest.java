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
	
	@Test
	public void alea_test(){
		machine=new Machine();
		Assert.assertTrue(machine.Alea() >=0 && machine.Alea() < 5);
	}
	
	@Test
	public void perdre_test(){
		machine=new Machine();
		machine.setCharacter1(machine.liste(0));
		machine.setCharacter2(machine.liste(0));
		machine.setCharacter3(machine.liste(1));
		Assert.assertFalse(machine.combinaisonGagnante());
	}
	
	@Test
	public void gagner_test(){
		machine=new Machine();
		machine.setCharacter1(machine.liste(0));
		machine.setCharacter2(machine.liste(0));
		machine.setCharacter3(machine.liste(0));
		Assert.assertTrue(machine.combinaisonGagnante());
	}
	
	@Test
	public void mise_inferieure_test(){
		machine=new Machine();
		machine.Miser(-5);
		Assert.assertTrue(machine.getMise()==1);
	}
	
	@Test
	public void mise_superieure_test(){
		machine=new Machine();
		machine.Miser(15);
		Assert.assertTrue(machine.getMise()==10);
	}
	
	@Test
	public void tirage_test(){
		machine=new Machine();
		machine.tirage();
		Assert.assertTrue(machine.chercherListe(machine.getCharacter1()));
		Assert.assertTrue(machine.chercherListe(machine.getCharacter2()));
		Assert.assertTrue(machine.chercherListe(machine.getCharacter3()));
	}
	
	
	
}
