/* The janitor of a high school is extremely efficient. By the end of each day, all of the school's waste is in plastic bags weighing between 1.01 pounds and 3.00 pounds. All plastic bags are then taken to the trash bins outside. One trip is described as selecting a number of bags which together do not weigh more than 3.00 pounds, dumping them in the outside trash can and returning to the school. Given the number of plastic bags n, and the weights of each bag, determine the minimum number of
trips the janitor has to make.
Example
n=5
weight = [1.01, 1.99, 2.5, 1.5, 1.01]
*/	
import java.util.*;

public class janitorSchool {

	public static int efficientJanitor(List<Float> weight) {
	    int trips = 0;
	    Collections.sort(weight);        
	    int index = weight.size()-1;
	    int startIdx = 0;
	    
	    while(index > 0){
	        float value = weight.get(index);
	        if(value > 1.99f){
	            trips++;
	        } else if(value <= 1.99f){
	            float nextIdxVal = weight.get(startIdx);
	            if((nextIdxVal + value) <= 3.0f){
	                startIdx++;
	            }
	            trips++;
	        }
	        if(startIdx >= index){
	            break;
	        }
	        index--;
	    }
	    return trips;

	}
	
	public static void main(String[] args) {
        List<Float> myList = new ArrayList<Float>();
        myList.add(1.01f);
        myList.add(1.99f);
        myList.add(2.5f);
        myList.add(1.5f);
        myList.add(1.01f);
        
        System.out.println(efficientJanitor(myList));
	}
}
