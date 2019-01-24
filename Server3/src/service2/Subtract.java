package service2;

public class Subtract {

	//subtraction function
	public int sub(int i, int j) {
		
		int result = 0;
		if(i<j) {
			result = j-i;
		}
		else {
			result = i-j;
		}
		return(result);
	}
	
}
