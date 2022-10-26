
public class multi1 {
	public static void main(String[] args) {
		createArr(6);
	}
	public static void createArr(int a) {
		int[][] myArr=new int[a][a];

		for(int i=0;i<myArr.length;i++) {
			for(int j=0;j<myArr.length-i;j++) {
				myArr[i][i+j]=j+1;
			}
		}
		for(int i=0;i<myArr.length;i++) {
			for(int j=0;j<myArr.length;j++) {
				System.out.print(myArr[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}
}
