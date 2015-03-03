
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Assignment17 {
	public static void main(String[] args) {

	    int[] newArr = new int[] {2,2,2,2,9,9,8};
	    Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

	    for (int i = 0; i < newArr.length; i++) {
	    	
	    	Integer value = counter.get(newArr[i]);
	    	
	    	if (value == null) {
	    		counter.put(newArr[i], 1);
	    		} 
	    	else {
	    		int val = value.intValue();
	    		val++;
	    		counter.put(newArr[i], val);
	    		}
	    	}
	    
	    System.out.println(counter.toString());
	    int max = Freq(counter.values());
	    List<Integer> modes = new ArrayList<Integer>();

	    for (Entry<Integer, Integer> entry : counter.entrySet()) {
	    	int value = entry.getValue();
	    	if (value == max) {
	    		modes.add(entry.getKey());
	    		}
	    	}
	    System.out.println(modes);
}

	public static int Freq(Collection<Integer> valueSet) {

	    int max = 0;
	    boolean setTime = false;

	    for (Iterator iterator = valueSet.iterator(); iterator.hasNext();) {
	        Integer integer = (Integer) iterator.next();

	        if (!setTime) {
	        	max = integer;
	        	setTime = true;
	        	}
	        if (max < integer) {
	        	max = integer;
	        	}
	    	}
	    return max;
	    }
}
