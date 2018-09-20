package AdditionString;

public class Junit1 {
public int Addition(int i) {
	i=i+i;
	return i;
}
public int charcount(String word) {
	int count=0;
	for(int i=0;i<word.length();i++)
	{
		if(word.charAt(i)=='a'||word.charAt(i)=='A')
			count++;
	}
	return count;
}
}
