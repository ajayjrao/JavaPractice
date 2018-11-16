import java.util.Random;

public class SortAlgo{
	
	public static void main(String[] args){
		
		SortAlgo objSortAlgo = new SortAlgo();
		
		int[] intRandomArray = objSortAlgo.generateRandomInt();
		System.out.println("Input Array :");
		objSortAlgo.printArray(intRandomArray);
		
		int[] intSelSortArray = objSortAlgo.selectionSort(intRandomArray);
		System.out.println("\nSelection Sort : ");
		objSortAlgo.printArray(intSelSortArray);
		
		int[] intInsSortArr = objSortAlgo.insertionSort(intRandomArray);
		System.out.println("\nInsertion Sort : ");
		objSortAlgo.printArray(intInsSortArr);
	}
	
	int[] generateRandomInt(){
		Random rand = new Random();
		int[] intRandomArray = new int[10];
		for (int i = 0; i < intRandomArray.length; i++){
			intRandomArray[i] = rand.nextInt(500);
		}
		return intRandomArray;
	}
	
	void printArray(int[] intArr){
		for (int i = 0; i < intArr.length; i ++){
			System.out.print(intArr[i]);
			
			if ( i != (intArr.length - 1)){
				System.out.print(", ");
			}
		}
	}
	
	int[] selectionSort(int[] intArr){
		int[] intSelSortArray = intArr.clone();
		for (int j = 0; j < intSelSortArray.length; j++){
			int min = intSelSortArray[j];
			for (int i = j; i < intSelSortArray.length; i++){
				if (min > intSelSortArray[i]){
					min = intSelSortArray[i];
					intSelSortArray[i] = intSelSortArray[j];
					intSelSortArray[j] = min; 
				}
			}
		}
		return intSelSortArray;
	}
	
	int[] insertionSort(int[] intArr){
		int[] intInsSortArr = intArr.clone();
		
		for (int j = 0; j < intInsSortArr.length; j++){
			int min = intInsSortArr[j];
			for (int i = j-1; i >= 0; i--){
				if (intInsSortArr[i] > min){
					intInsSortArr[i+1] = intInsSortArr[i];
					intInsSortArr[i] = min;
				} else {	
					break;
				}
			}
		}
		return intInsSortArr;
	}
}