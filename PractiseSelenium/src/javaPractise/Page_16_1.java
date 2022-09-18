package javaPractise;

public class Page_16_1 {

	public static void main(String[] args) {
		String a = "sasjsjj2q8w2djkj##@^@*WIW@WH88ijjjsoHSdkdsk5845dsd5fhhhasssh267623&^&&&27^&82u2uhjsdG55^*I*D*SS$@Y&J";
		a = a.replaceAll("[^a-zA-Z-0-9]", "");
		a = a.replaceAll("[a-zA-z]", "");
		System.out.println(a);
	}
}
