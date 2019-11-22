import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;


class TestArrays{
	
	public static void main(String[] args) {
		
		// Arrays
		
		int [] nums = new int[20];
		for (int i=0; i<20; i++) {
			nums[i] = 2*i;
		}
		
		System.out.println(Arrays.toString(nums));
		
		
		// 2-D Arrays
		int [][] num2d = new int [3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				num2d[i][j] = i*2;
			}
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(num2d[i][j] + "|");
			}
			System.out.print("\n------\n");
		}
		
		// ArrayList
		// Similar to arrays with 2 main differences.
		// Size is dynamic unlike arrays
		// Can store elements of different types unlike arrays which are homogeneous
		
		ArrayList arrList = new ArrayList(); // no size defined
		
		// by default ArrayList will accept different types of objects
		//But we can restrict it to one particular type only by doing the below
		ArrayList<String> namesList = new ArrayList<String>();
		//add objects
		namesList.add("Diana");
		namesList.add("Charles");
		namesList.add("Harry");
		// adding at index
		namesList.add(3, "William");
		// printing the list
		for (int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		// new way of printing
		for (String i: namesList) {
			System.out.println(i);
		}
		
		
		// addAll adds everything from source arraylist to destination arraylist
		ArrayList srcList = new ArrayList();
		ArrayList destList = new ArrayList();
		srcList.add("Peter Andre");
		srcList.add(200);
		srcList.add(100.2);
		System.out.println("Source List: " + srcList);
		System.out.println("Destination list before copy: " + destList);
		destList.addAll(srcList);
		System.out.println("Destination list after copy: " + destList);
		// contains method to check membership
		System.out.println(srcList.contains(100.2));
		destList.add("UniqueValue");
		System.out.println(srcList.containsAll(destList));
		// clear to remove elements
		destList.clear();
		System.out.println("Destination List after clearing: " + destList);
		
	}
}