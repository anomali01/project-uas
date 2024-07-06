 public class Distanceformula
{
	public static void main( String[] args )
	{
		// test the formula a bit
		double d1 = istance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
 
		double d2 = istance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + istance(2,-3,-1,-2) );
 
		System.out.println(" (4,5) to (4,5) => " + istance(4,5,4,5) );
	}
 
	public static double istance( int x1, int y1, int x2, int y2 )
	{
        double d4 = Math.sqrt((x2 - x1)*(x2-x1)+(y2 - y1)*(y2-y1));
        return d4;
	}
 }
    

