public class DiskStatementCoverage {
	public static void main (String[] args) {
		//covers statement 1 3 and 4
		Disk testdisk134= new Disk(4, 6);
		testdisk134.manipulate();
		// covers statement 1 2 and 5
		Disk testdisk125= new Disk(1001, -2);
		testdisk125.manipulate();
		
		
	}

}
