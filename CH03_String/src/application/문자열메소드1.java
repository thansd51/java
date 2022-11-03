package application;

public class 문자열메소드1 {

	public static void main(String[] args) {
		//charAT(인덱스 번호) : index번호에 해당 문자가 리턴
		String myText = "12345";

        System.out.println(myText.charAt(0));
        System.out.println(myText.charAt(1));
        System.out.println(myText.charAt(2));
        System.out.println(myText.charAt(3));
        System.out.println(myText.charAt(4));
        //System.out.println(myText.charAt(5));
		    
		        
	        
	    //문자열을 알파벳 순으로 비교
	    String word1 = "abcde";
	    String word2 = "abcdd";
	    //compareTo 는 문자열들을 비교해서 큰순서 - 작은순서를 숫자로 리턴    
	    System.out.println(word1.compareTo(word2));
	    
	    //contains(문자열) 문자열이 포함하고 있는지 확인
	    String Text = "오늘 점심은 돈까스다.";
	    System.out.println(Text.contains("돈까스"));

	    
	    //concat 문자열 합침
	    System.out.println(word1.concat(word2));
	    //stringBuilder
	    String finalString = new StringBuilder().append(word1).append(word2).toString();
	    System.out.println(finalString);
	    //String.format("",) : printf("%s", 변수)대신 출력하지 않고 문자열 형식을 만듬
	    String formatString = String.format("%s %s", word1, word2);
	    System.out.println(formatString);
 
	}
}
