package com.recepkabakci.corejava;

public class CountLetters {

	public static void main(String[] args) {
		countLetter("Hello world i am 32 years old and i love ** :)");
		}
		@SuppressWarnings("deprecation")
		public static void countLetter(String st) {
			char[] str = st.toCharArray();
			int let=0;
			int integ=0;
			int space=0;
			int other=0;	
			for(int i=0;i<str.length;i++) {
				if(Character.isLetter(str[i])) {
					let++;	
				}else if(Character.isDigit(str[i])) {
					integ++;
				}else if(Character.isSpace(str[i])) {
					space++;
				}else {
					other++;
				}	
			}
			System.out.println("letter: " + let);
			System.out.println("space: " + space);
			System.out.println("number: " + integ);
			System.out.println("other: " + other);

	}

}
