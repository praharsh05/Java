import java.util.Scanner;
public class NoughtCross {
	public static void main(String[] args) {
		char[][] myArr=new char[3][3];
		Scanner s=new Scanner(System.in);
		boolean win=false;
		System.out.println("Game Begins");
		int row,coloumn;
		while(!win) {
			System.out.println("Enter row and coloumn");
			row=s.nextInt();
			coloumn=s.nextInt();
			s.nextLine();
			if(myArr[row][coloumn]=='x'|| myArr[row][coloumn]=='o') {
				System.out.println("Cannot overide");
				continue;
			}
			System.out.println("Enter x or o");
			myArr[row][coloumn]=s.next().charAt(0);
			for(int i=0;i<myArr.length;i++) {
				for(int j=0;j<myArr.length;j++) {
					System.out.print(myArr[i][j] + "\t");
				}
				System.out.print("\n");
			}
//			if(checkArr(myArr)==true) win=true;
		}
	}
//	public static boolean checkArr(char[][] a) {
//		
//		if(a[0][0]==(a[0][1])) {//horizontal row1
//			if(a[0][0]==a[0][2]) {
//				return true;
//			}
//		}
//		else if(a[1][0]==(a[1][1])) {//horizontal row 2
//			if(a[1][0]==a[1][2]) {
//				return true;
//			}
//		}
//		else if(a[2][0]==(a[2][1])) {//horizontal row 3
//			if(a[2][0]==a[2][2]) {
//				return true;
//			}
//		}
//		else if(a[0][0]==a[1][1]) {//diagonal 1
//			if(a[0][0]==a[2][2]) {
//				return true;
//			}
//		}
//		else if(a[0][2]==a[1][1]) {//diagonal 2
//			if(a[0][2]==a[2][0]) {
//				return true;
//			}
//		}
//		else if(a[0][0]==a[1][0]) {//vertical row 1
//			if(a[0][0]==a[2][0]) {
//				return true;
//			}
//		}
//		else if(a[0][1]==a[1][1]) {//vertical row 2
//			if(a[0][1]==a[2][1]) {
//				return true;
//			}
//		}
//		else if(a[0][2]==a[1][2]) {//vertical row 3
//			if(a[0][2]==a[2][2]) {
//				return true;
//			}
//		}
//		else return false;
//	}
}
