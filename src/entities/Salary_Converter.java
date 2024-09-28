package entities;

public class Salary_Converter {
	
	int hours;
	double price_per_hour;
	
	public Salary_Converter(double s, int h) {
		this.price_per_hour = s;
		this.hours = h;
	}
	
	public double Salary() {
		return hours * price_per_hour;
	}
	
}
