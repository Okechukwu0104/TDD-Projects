public class Tasks{

	public int[] swapArray(int[] given){
	
		
	for(int count = 0; count < given.length; count++){
		if(count % 2 !=0){
			int temp = given[count];
			given[count] = given[count-1];
			given[count-1] = temp;
		}

	
	}
		return given;



	}


}