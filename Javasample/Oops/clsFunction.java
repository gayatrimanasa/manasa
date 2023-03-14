package Oops;

public class clsFunction extends ClsMathsFunction implements IstringFunction
{

	@Override
	public String strReverse(String str) {
		String strRev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			strRev=strRev+str.charAt(i);
		}
		return strRev;
		
	}

	@Override
	public String getid(String email)
	{
		
		return (email.substring(0,email.indexOf("@")));
	}

}
