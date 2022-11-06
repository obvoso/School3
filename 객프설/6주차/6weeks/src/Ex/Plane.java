package Ex;

public class Plane {
	
	private String company;
	private String model;
	private int	passenger;
	static int planes = 0;
	
	Plane() {	
		planes++;
	}
	
	Plane(String c, String m, int p){
		this.company = c;
		this.model = m;
		this.passenger = p;
		planes++;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public static int getPlanes(){
		return planes;
	}
}
