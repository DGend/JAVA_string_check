// Q8. solve

public class StrLength {
	public static void main(String[] args) {
		String[] str = {
				"In this letter I make some remarks on a general principle relevant to enciphering in general and my machine.",
				"We see immediately that one needs little information to begin to break down the process.",
				"The most direct computation would be for the enemy to try all 2^r possible keys, one by one.",
				"If qualified opinions incline to believe in the exponential conjecture, then I think we cannot afford not to make use of it." };

		for (int i = 0; i < str.length; i++) {
			System.out.println("Q" + (i + 1) + ".sentence");
			System.out.println(str[i]);
			System.out.println("length : " + str[i].length());
			
			if (str[i].length() % 16 != 0) {
				int anser = (str[i].length() / 16 + 1) * 16;
				System.out.println(anser + " bytes padding + IV(16bytes) => "
						+ (anser + 16) + "\n");
			} else {
				int anser = (str[i].length() / 16) * 16;
				System.out.println(anser + " bytes padding + IV(16bytes) => "
						+ (anser + 16) + "\n");
			}
		}
	}
}
