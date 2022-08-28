/*
*   Foundations of Computer Science
*   2020, Semester 02
*   Practical-Exam-04
*
*   student (id): a1787585
*   student (name): Yiqi Li
*
* Note: in order to finish your exam you need to make changes in this class.
* Note that you have to implemented lines from 57 - 67
*
*/
public class Insertion extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return arr;
	}

    @Override
    public int[] sortStringByIndex(String[] arr) {
        int[] indexArray = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // check if anything was changed
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    int tmpInt = indexArray[j];
                    indexArray[j] = indexArray[j + 1];
                    indexArray[j + 1] = tmpInt;
                    swapped = true;
                }
            }
            if (!swapped) {  // nothing changed -> already sorted
                break;
            }
        }
        return indexArray;
    }
    
	@Override
	public String [] sortString(String [] arr){
        for (int j = 1; j < arr.length; j++) {
            String current = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i].compareTo(current)>0)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = current;
        }
        return arr;
	}


}
