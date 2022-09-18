package javaPractise;

public class Page_09 {

	public static void main(String[] args) {
		String st = "avdhut ram shyam vadapav burger lemon";
		String[] ar = st.split(" ");
		for(int i=0; i<ar.length; i++) {
			String s = ar[i];
			ar[i] = RevString(s);
		}
		
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+" ");
	}

	private static String RevString(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--)
			rev = rev + s.charAt(i);
		return rev;
	}
}
