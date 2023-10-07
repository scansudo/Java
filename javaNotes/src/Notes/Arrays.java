package Notes;

public class Arrays {

	public static void main(String[] args) {
		
		int[] singleArr = {2,3,5,7,};
		
		for(int x: singleArr) {
			System.out.println(x);
		}

		int[][] multiArr = {{32,97,72},{25,30,47},{13,45,88}};
		
		multiArr[1][1] = 75;
		
		int y = multiArr[1][1];
		int z = multiArr[0][0];
		
		System.out.println(y);        // 75
		System.out.println(z);        // 32

	}
}