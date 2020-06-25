package learning;

import java.nio.charset.Charset;

public class CharactersInCharsetObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String str: Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}

}
