package javaPractise;

public class Page_10 {

	public static void main(String[] args) {
		String s = "av dh ut paw a r";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char str = s.charAt(i);
			if (str==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
