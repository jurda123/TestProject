package TeaTime;


public class Wine implements Beverage {
	private int year;
	private String wineyard;
	
	
	public Wine(int year, String wineyard){
		
			setYear(year);
			setWineyard(wineyard);
			
		
		this.wineyard=wineyard;
	}
	
	public Wine(int year){
		setYear(year);
		setWineyard("Tokaj");
	}

	public Wine(){
		setYear(1968);
		setWineyard("Tokaj");
	}
	public Wine(String wineyard){
		setYear(1968);
		setWineyard(wineyard);
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<1950 || year >2016 ){
		this.year = year;
		}
		else{
			this.year = 2000;
		}
	}
	public String getWineyard() {
		return wineyard;
	}
	public void setWineyard(String wineyard) {
		this.wineyard = wineyard;
	}
	
	/* (non-Javadoc)
	 * @see TeaTime.Beverage#drink()
	 */
	@Override
	public void drink(){
		System.out.println("Year:" + this.getYear() + "  Wineyard:" + this.getWineyard());
	}
	
	

}
