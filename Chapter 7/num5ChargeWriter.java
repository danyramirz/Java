
public class num5ChargeWriter {

	public num5ChargeWriter() {
		
	}
	public int squaetialSearch(int[] array, int value){
		int index, element;
		boolean found;
		
		index = 0;
		
		element = -1;
		found = false;
		
		while (!found && index < array.length){
			if (array[index] == value){
				found= true;
				element = index;
			}
			index++;
		}
		return element;
	}
}
