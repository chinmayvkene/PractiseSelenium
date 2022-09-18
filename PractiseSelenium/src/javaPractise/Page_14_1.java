package javaPractise;

public class Page_14_1 {

	public static void main(String[] args) {
		String a = "Auto mation";
		a = a.replace(" ", "");
		String rev = "";
		for(int i=a.length()-1; i>=0; i--)
			rev = rev + a.charAt(i);
		System.out.println(rev);
	}
}
