import java.util.Random;
public class primitive {
	public static void main(String [] args) {
		double[] a1=new double[100];
		for(int i=0;i<a1.length;i++) {
			Random r =new Random();
			double d=r.nextDouble();
			a1[i]=d;
		}
//		for(int j=0;j<a1.length;j++) {
//			System.out.println(a1[j]);
//		}
		System.out.println("avg: "+ avg(a1));
	}
	
	public static double avg(double[] a) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	
}
