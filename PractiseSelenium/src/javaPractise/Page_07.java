package javaPractise;

public class Page_07 {

	static int[] a = {12,15,35,44,77,88,957,74,58,66,88,54,55,666,52,58,2,8,2,8879,5};
	int empty=0;
		public void sortingLogic() {
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i]>a[j]) {
						empty=a[i];
						a[i]=a[j];
						a[j]=empty;
					}
				}
		}
	}
		
		public static void main(String[] args) {
			System.out.println("Before no logic: ");
			for(int i=0; i<a.length; i++)
				System.out.print(a[i]+" ");
			
			Page_07 obj = new Page_07();
			obj.sortingLogic();
			
			System.out.println();
			System.out.println("Ascending order: ");
			for(int i=0; i<a.length; i++)
				System.out.print(a[i]+" ");
			
			System.out.println();
			System.out.println("Descending order: ");
			for(int i=a.length-1; i>=0; i--)
				System.out.print(a[i]+" ");
			
		}
}
