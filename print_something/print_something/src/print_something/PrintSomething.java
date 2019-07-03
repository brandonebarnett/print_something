package print_something;

public class PrintSomething {

	public static void main(String[] args) {
		String str = "We have a large number of things in our warehouse falling in the category: apparel and "
				+ "the slightly more in demand category: makeup along with the category: furniture and...";
		
		printCategories(str);
	}
	
	public static void printCategories(String str) {
		int count = 0;
		
		while (true) {
			int foundStartingPoint = str.indexOf("category:", count);
			if (foundStartingPoint == -1) {
				break;
			}
			int start = foundStartingPoint + 10;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			count = end + 1;
		}
	}

}
