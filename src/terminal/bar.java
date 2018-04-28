package terminal;

public class Bar {
	private static int const MILLISECONDS_IN_MINUTE = 60 * 1000;
	//ATTRIBUTES
	//Bar example from SCV file:  2017.09.26,04:30,1.1853,1.1859,1.1853,1.1858,142
	//private Date;              //Date
	//private Time;              //Time
	//private String currencyPair;         //Name of currency pair

	// typical values 1 minute, 5 minutes, 15 minutes, 30 minutes, 1 hour, 4 hours, 1 day, 1 week, 1 month
	private int timeframe;       // in minutes; 

	private Currency firstCurrency;
	private Currency secondCurrency;

	private Date startTime;
	
	private double minimalPrice;
	private double maximalPrice;
	private double openingPrice;
	private double closingPrice;

	private int volume; 
	
		
	private int Year;
	private int Month;
	private int Day;
	private int Hour;
	private int Minute;
	
	
	//CONSTRUCTOR
	public Bar(int timeframe, 
				Currency firstCurrency, 
				Currency secondCurrency, 
				Date startTime, 
				double minimalPrice,
				double maximalPrice,
				double openingPrice,
				double closingPrice) {
		// TODO: 
	}

	// TODO: вынести в функцию в main (после разберемся)
	public Bar(String str){

		//Devide String wia "," to logical parts date-time-price-volume
		String[] tempLine = str.split(",");	
				
		for(int i = 0; i<tempLine.length; i++){
				
			//take date from String str
			if(i == 0){
				Year = Integer.valueOf(tempLine[0].substring(0,4));
				Month = Integer.valueOf(tempLine[0].substring(5,7));
				Day = Integer.valueOf(tempLine[0].substring(8,tempLine[0].length()));					
			} 
			
			 //take time from String str			
			if(i == 1){
				String[] timeParts = tempLine[i].split(":");
				Hour = Integer.valueOf(timeParts[0]);
				Minute = Integer.valueOf(timeParts[1]);
			} 
			
			//take open price from String str
			if(i == 2) PriceOpen = Double.valueOf(tempLine[i]);

			// take maximum price from String str			
			if(i == 3) PriceHigh = Double.valueOf(tempLine[i]);
			
			//take minimum price from String str			
			if(i == 4) PriceLow = Double.valueOf(tempLine[i]);
			
			//take close price from String str			
			if(i == 5) PriceClose = Double.valueOf(tempLine[i]);
			
			//take volume from String str			
			if(i == 6) Volume = Integer.valueOf(tempLine[i]);
		}
		
		//System.out.println("BAR>make " + Day + "." + Month + "." + Year + "   " + Hour + ":" + Minute + "   " +  PriceOpen + "; " +  PriceHigh + "; " +  PriceLow + "; " +  PriceClose + ";   " +  Volume);
		System.out.println("make bar object");
	}

	// TODO: getters
	public int getVolume() {
		return volume;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getFinalTime() {
		long startTimeInMilliseconds = startTime.getTime()
		long finalTimeInMilliseconds = startTimeInMilliseconds + timeframe * MILLISECONDS_IN_MINUTE;

		return new Date(finalTimeInMilliseconds);
	}
}
