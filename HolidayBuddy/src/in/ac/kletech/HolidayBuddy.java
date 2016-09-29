package in.ac.kletech;

abstract public  class HolidayBuddy {
	private String sname;
	private int id;
	private String gender;

	public HolidayBuddy() {
		super();
	}
	public HolidayBuddy(String sname, int id, String gender) {
		super();
		this.sname = sname;
		this.id = id;
		this.gender = gender;
	}
	public double discount(int count, double amount){
		if(count >= 2){
			amount = amount - (0.1 * amount);
			System.out.println("Privilaged customer discount is applied:"+amount);
			return amount;
		}
		else {
			System.out.println("not eligible for discount");
			return amount;
		}}
	public double isFemale(int B, double a){
		if(B==1){
			a = a - (0.02*a);
			System.out.println("Female Customer discount is applied:"+ a);	
			return a;
		}
		else {
			System.out.println("no additional discount for male customers");
			return a;
		}
	}

	public void displayDetails(String sname, int id, boolean gender){
		System.out.println("name :"+sname);
		System.out.println("id :" +id);
		if(gender == true)
			System.out.println("female");

		else System.out.println("male");
	}
	abstract public void status (String string,int i,int gender,double d,String date);

	abstract public double calc_bill(int i);


}

