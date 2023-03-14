package Javasample;
import java.util.Scanner;

public class UsingArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		// to read 2nd element value 
		System.out.println(" 2nd element is:" +a[1]);
		//modify 3rd element value 
		System.out.println("Before modifiaction , 3rd element is:"+a[2]);
		System.out.println(" After modification ,3rd element is:"+a[2]);
		//to a[10]=100; arrays index out of bounds execption
	}

}
