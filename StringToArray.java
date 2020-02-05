import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Splitter;

public class StringToArray {

	public StringToArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String split() method
		String str = "Hello;string;into;array;conversion;tutorial";
		String[] strarray = str.split(";");
		if(strarray.length > 0){
		    for(String elm: strarray){
			System.out.print(elm+" ");
		    }
		}
		else{
		    System.out.println("No elements to display!");
		}
		System.out.println("");
		String str2 = "Hi buddy! Smile, sunshine is good for your teeth";
		String[] strarray2 = str2.split("\\s");
		if(strarray2.length > 0){
		    for(String elm: strarray2){
			System.out.print(elm+" ");
		    }
		}
		else{
		    System.out.println("No elements to display!");
		}

		// Pattern.split() method
		String str3 = "Turn Text Into Java Array Example";
		String PATTERN = "\\s"; 
		Pattern pattern = Pattern.compile(PATTERN); 
		String[] strtoarray3 = pattern.split(str3); 
		for (int i = 0; i < strtoarray3.length; i++) { 
		    System.out.println("strtoarray[" + i + "]=" + strtoarray3[i]); 
		} 

		// Split method of StringUtils class
		String str4 = "Just#Trying#To#Test#StringUtils#Split#Method";
		String [] strtoarray4 = StringUtils.split(str4, "#");
		for(int i = 0; i< strtoarray4.length; i++ ) {
		    System.out.println( i + ") "+ strtoarray4[i]);
		}

		// StringTokenizer class
		String str5 = "Just, trying to understand, StringTokenizer class, with an example";
		StringTokenizer tokenizer1 = new StringTokenizer(str5);
		String [] strarray5 = new String[tokenizer1.countTokens()];
		int i = 0;
		while(tokenizer1.hasMoreTokens()) {
			strarray5[i] = tokenizer1.nextToken();
		    i++;
		}
		for(String stritem : strarray5){
		    System.out.println(stritem);
		}
		System.out.println("----------------------------");
		StringTokenizer tokenizer2 = new StringTokenizer( str,",");
		String [] strarray6 = new String[tokenizer2.countTokens()];
		i = 0;
		while(tokenizer2.hasMoreTokens()) {
			strarray6[i] = tokenizer2.nextToken();
		    i++;
		} 
		for(String stritem : strarray6){
		    System.out.println(stritem);
		}

		// Using Guava library
		String mystr = "Guava# is # # From Google! You can use it# to split Strings in Java";
		Splitter mySplitter = Splitter.on('#')
					      .trimResults()
					      .omitEmptyStrings();
		List<String> strList = mySplitter.splitToList(mystr); 
		String[] myarray = strList.toArray(new String[strList.size()]);
		for (String item : myarray) { 
		    System.out.println(item); 
		} 

		// String toCharArray() method
		String mystr2 = "toCharArray";
		char chararray[] = mystr2.toCharArray();
		for(char ch:chararray){
		    System.out.println(ch);
		}

		// String getChars() method
		String mystr3 = "Testing getChars method";
		char[] chararr = new char[8];
		mystr3.getChars(8, 16, chararr, 0);
		for(char ch: chararr){
		   System.out.print(ch+" ");
		}

		// Java 8 chars() method
		String mystr4 = "Java 8 Chars";
		Character[] arraychars = mystr4.chars()
					      .mapToObj(c -> (char) c)
					      .toArray(Character[]::new);
		for(Character ch: arraychars){
		    if(Character.isLowerCase(ch))
			System.out.print(ch+" ");
		}
		System.out.println("");
		"hi java 8 chars".chars().forEach(c -> System.out.print((char)c+" "));

        
	}

}
