package MODULE_1;

//que-9.Write a Java program to count the letters, spaces, numbers and other
//characters of an input string. 

public class que_9 {
		public static void main(String[] args) {
			String test = "hello2 , how123 are you?";
			count(test);
		}
		public static void count(String test){
			char[] ch = test.toCharArray();
			int letter = 0;
			int space = 0;
			int num = 0;
			int other = 0;
			for(int i = 0; i < test.length(); i++){
				if(Character.isLetter(ch[i])){
					letter ++ ;
				}
				else if(Character.isDigit(ch[i])){
					num ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					space ++ ;
				}
				else{
					other ++;
				}
			}
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("other: " + other);
	}
}
