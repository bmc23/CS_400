public class Seq {
    public static void main(String[] args) {
	try {
	    int x = Integer.parseInt( args[0] );
	    for(int i=0;i<x;i++)
		System.out.println(i+1);
	} catch(ArrayIndexOutOfBoundsException|NumberFormatException e) {
	    System.out.println("Usage: java Seq <integer>");		
	}
    }
}
