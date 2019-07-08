package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check the number\n");
		String st = "8 029 625 27 22";
		String st1 = "+375 44 345 45 56";
		String str = "+375336457405";
		String str1 = "8(29)0459689";
		String str2 = "(345)6755686";
		String str3 = "269-27-65";
		String str4 = "8 029 5467896";
		String s = "2020405";

		System.out.println(validationNumber(s));
		System.out.println(validationNumber(str4));
		System.out.println(validationNumber(st1));
		System.out.println(validationNumber(st));
		System.out.println(validationNumber(str));
		System.out.println(validationNumber(str2));
		System.out.println(validationNumber(str1));
		System.out.println(validationNumber(str3));
		//
		System.out.println("-----------\n");
		System.out.println("\nCheck the email\n");

		System.out.println("\n-------------");
		String mail = "erwefere@mail.by";
		String mail1 = "wefewfew@mail.ru";

		String mj = "herhtrjrj@tut.by";
		String h = "rge@gre@mail.by";

		System.out.println(valEmail(mail));
		System.out.println(valEmail(mail1));
		System.out.println(valEmail(mj));
		System.out.println(valEmail("ergr455hrt@rambler.ru"));
		System.out.println(valEmail("ewgreg@gmail.com"));
		System.out.println(valEmail(h));

		System.out.println("\nCheck the matrix\n");
		Matrix matrix = new Matrix();
		matrix.create();
		matrix.show();
		matrix.insert();
		matrix.show();

	}

	public static boolean sameSymbols(String str) {
		boolean check = true;

		for (int i = str.length() - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == '@' && str.charAt(j) == '@') {
					check = false;
				}
			}
		}
		return check;
	}

	public static boolean validationNumber(String str) {
		boolean check = false;
		int lengthNum = str.length();
		int count1 = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i)) && str.charAt(0) == '+' && str.length() == 13) {
				count1++;
			}

			if (Character.isDigit(str.charAt(i)) && str.charAt(1) == ' ' && str.charAt(5) == ' '
					&& str.length() == 13) {
				count1++;

			}

			if (Character.isDigit(str.charAt(i)) && str.charAt(1) == '(' && str.charAt(4) == ')'
					&& str.length() == 12) {
				count1++;

			}
			if (Character.isDigit(str.charAt(i)) && str.charAt(0) == '(' && str.charAt(4) == ')'
					&& str.length() == 12) {
				count1++;

			}
			if (Character.isDigit(str.charAt(i)) && str.charAt(3) == '-' && str.charAt(6) == '-' && str.length() == 9) {
				count1++;

			}
			if (Character.isDigit(str.charAt(i)) && str.length() == 7) {
				count1++;

			}
			if (Character.isDigit(str.charAt(i)) && str.length() == 7 && str.charAt(3) == '-' && str.charAt(6) == '-') {
				count1++;

			}

			if (Character.isDigit(str.charAt(i)) && str.charAt(1) == ' ' && str.charAt(5) == ' ' && str.charAt(9) == ' '
					&& str.charAt(12) == ' ' && str.length() == 15) {
				count1++;

			}
			if (Character.isDigit(str.charAt(i)) && str.charAt(0) == '+' && str.charAt(4) == ' ' && str.charAt(7) == ' '
					&& str.charAt(11) == ' ' && str.charAt(14) == ' ' && str.length() == 17) {
				count1++;

			}

		}
		if (lengthNum - 1 == count1) {
			check = true;
		} else if (lengthNum == count1) {
			check = true;

		} else if (lengthNum - 2 == count1) {
			check = true;
		} else if (lengthNum - 4 == count1) {
			check = true;
		} else if (lengthNum - 5 == count1) {
			check = true;
		}
		return check;
	}

	public static boolean valEmail(String str) {
		boolean check = false;
		String mail = "@mail.by";
		String mailRu = "@mail.ru";
		String tut = "@tut.by";
		String rambler = "@rambler.ru";
		String gmail = "@gmail.com";
		if (sameSymbols(str) == false) {
			check = false;
		} else {
			if (str.length() < 12) {
				check = false;
			}

			if (str.substring(str.length() - 8, str.length()).equals(mail)) {
				check = true;
			}
			if (str.substring(str.length() - 10, str.length()).equals(gmail)) {
				check = true;
			}
			if (str.substring(str.length() - 7, str.length()).equals(tut)) {
				check = true;
			}
			if (str.substring(str.length() - 8, str.length()).equals(mailRu)) {
				check = true;
			}
			if (str.substring(str.length() - 11, str.length()).equals(rambler)) {
				check = true;
			}

		}

		return check;
	}

}