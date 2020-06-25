package learning;

public class Count {
	
	public static void count(String sentence) {
		char[] ch = sentence.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}
			else if (Character.isSpaceChar(ch[i])) {
				space++;
			}
			else if (Character.isDigit(ch[i])) {
				num++;
			}
			else {
				other++;
			}
		}
			
			System.out.println("letter: " + letter);
			System.out.println("letter: " + space);
			System.out.println("letter: " + num);
			System.out.println("letter: " + other);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		count(sentence);
	}

}
