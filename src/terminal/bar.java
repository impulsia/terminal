package terminal;

import java.util.Date;

public class bar {
	private static int MILLISECONDS_IN_MINUTE = 60 * 1000;
	//ATTRIBUTES
	//Bar example from SCV file:  2017.09.26,04:30,1.1853,1.1859,1.1853,1.1858,142
	//private Date;              //Date
	//private Time;              //Time
	//private String currencyPair;         //Name of currency pair

	// typical values 1 minute, 5 minutes, 15 minutes, 30 minutes, 1 hour, 4 hours, 1 day, 1 week, 1 month
	private int timeframe;       // in minutes; 

	private currency firstCurrency;
	private currency secondCurrency;

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
	public bar() {
		
	}


	// TODO: getters
	public int gettimeframe(){
		return timeframe;
	}
	public currency getfirstCurrency (){
		return firstCurrency;
	}
	public currency getsecondCurrency (){
		return secondCurrency;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	public Date getFinalTime() {
		long startTimeInMilliseconds = startTime.getTime();
		long finalTimeInMilliseconds = startTimeInMilliseconds + timeframe * MILLISECONDS_IN_MINUTE;
		return new Date(finalTimeInMilliseconds);
	}
	public int getVolume() {
		return volume;
	}
	public double getminimalPrice(){
		return minimalPrice;
	}
	public double getmaximalPrice(){
		return maximalPrice;	
	}
	public double setopeningPrice(){
		return openingPrice;		
	}
	public double setclosingPrice(){
		return closingPrice;		
	}
	public int setYear(){
		return Year;
	}
	public int setMonth(){
		return Month;
	}
	public int setDay(){
		return Day;
	}
	public int setHour(){
		return Hour;
	}
	public int setMinute(){
		return Minute;
	}
	
	
	// TODO: setters
	public void setfirstCurrency (currency firstCurrency){
		this.firstCurrency = firstCurrency;
	}
	public void setsecondCurrency (currency secondCurrency){
		this.secondCurrency = secondCurrency;
	}
	public void setstartTime (Date startTime){
		this.startTime = startTime;
	}
	public void settimeframe(int timeframe){
		this.timeframe = timeframe;
	}
	public void setminimalPrice(double minimalPrice){
		this.minimalPrice = minimalPrice;		
	}
	public void setmaximalPrice(double maximalPrice){
		this.maximalPrice = maximalPrice;		
	}
	public void setopeningPrice(double openingPrice){
		this.openingPrice = openingPrice;		
	}
	public void setclosingPrice(double closingPrice){
		this.closingPrice = closingPrice;		
	}
	public void setvolume (int volume){
		this.volume = volume;
	}
	public void setYear(int Year){
		this.Year = Year;
	}
	public void setMonth(int Month){
		this.Month = Month;
	}
	public void setDay(int Day){
		this.Day = Day;
	}
	public void setHour(int Hour){
		this.Hour = Hour;
	}
	public void setMinute(int Minute){
		this.Minute = Minute;
	}
		
}
