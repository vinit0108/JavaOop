package in.ac.kletech;

public class TravelOnly extends HolidayBuddy{
	TravelOnly(){}
	public TravelOnly(String sname, int id, String gender) {
		super(sname, id, gender);

	}
	public double calc_bill(int i){
		double amt = 0;
		if (i == 1){
			amt = 700;

		}
		else if(i == 2){
			amt = 1000;

		}
		else if (i==3){
			amt = 2000;

		}

		return amt;
	}
	public void status (String string,int i,int gender,double d,String date)
	{
		System.out.println("Travel date : "+date);
		System.out.println("Traveller name:"+string);
		System.out.println("Traveller id :" +i);
		if(gender == 1)
			System.out.println("Traveller gender : female");

		else System.out.println("Traveller gender : male");
		System.out.println("Traveller Total Bill :"+d);

	}

}

