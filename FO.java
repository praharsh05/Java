
public class FO {
	public static void main(String[] args) {
		int[] myArray=new int[10];
		for(int i=0;i<myArray.length;i++) {
			myArray[i]=i;
		}
		System.out.println(posFirst(myArray,3));
		System.out.println(posLast(myArray,3));
	}
	public static int posFirst(int[] a1,int num) {
		boolean finish=false;
		while(!finish) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]==num) {
					finish=true;
					return i;
				}
			}
			return -1;
		}
		return -1;
	}
	public static int posLast(int[] a1,int num) {
		boolean finish=false;
		while(!finish) {
			for(int i=a1.length-1;i>=0;i--) {
				if(a1[i]==num) {
					finish=true;
					return i;
				}
			}
			return -1;
		}
		return -1;
	}
	public static void allpos(int[] a1, int num) {
		boolean finish=false;
		while(!finish) {
			for(int i=0;i<a1.length;i++) {
				
			}
		}
	}
}
