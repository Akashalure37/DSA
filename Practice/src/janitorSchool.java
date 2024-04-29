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
