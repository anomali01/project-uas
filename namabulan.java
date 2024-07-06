public class namabulan
{
	public static String month_name( int month )
	{
		String result = "";
		
		if(month == 1){
			result = "januari" ;
		}else if(month == 2){
			result = "febuari" ;
		}else if(month == 3){
			result = "maret" ;
		}else if(month == 4){
			result = "april" ;
		}else if(month == 5){
			result = "mei" ;
		}else if(month == 6){
			result = "juni" ;
		}else if(month == 7){
			result = "juli" ;
		}else if(month == 8){
			result = "agustus" ;
		}else if(month == 9){
			result = "september" ;
		}else if(month == 10){
			result = "oktober" ;
		}else if(month == 11){
			result = "november" ;
		}else if(month == 12){
			result = "desember" ;
		}else{
			result = "tidakada";
		}
		// Your code goes in here.
		
		return result;
	}


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
}
