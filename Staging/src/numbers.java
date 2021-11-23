
public class numbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "232425";
		String s2 = "123";
		System.out.println(ascending(s2));
		
	
		int  n = 3;
		matrix(n);
	}
	
	/**
	 * checks if the string input ascending or ascending AND consecutive numbers
	 * has 
	 * @param s
	 * @return 
	 */
	public static boolean ascending(String s) {
		int prevNum = 0;
		String[] str = s.split(" ");
		
		for(String st: str) {
			
			int num = Integer.parseInt(st);
			if(num > prevNum) {
				System.out.print(num);
				prevNum = num;
			}
				return true;
		}
		return false;
	}
	
	public static void matrix(int n) {
		int[][] x = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				x[i][j] = n;
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}
