import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
  
public class RandomNumber{

	public static Object[] generate500Random() {
		Set<Integer> mySet = new LinkedHashSet<Integer>();
        Random rand = new Random();        
        
        while(mySet.size() != 500) {
        	mySet.add(rand.nextInt(1000));
        }
        
        return mySet.toArray();
	}
}