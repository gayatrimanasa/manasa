package Javasample;

public class Splint {



	public static void main(String[] args) {
	String str="java program Demos";
	String[] words= str.split(" "); // String[]words={"java","program","Demos"};
	System.out.println("Given the sentence is:"+str);
	System.out.println("No.of the words  :" + words.length);
	System.out.println("the words are:");
	for(String word:words)
	{
		System.out.println(word);
	}
	
	
	}
	}

