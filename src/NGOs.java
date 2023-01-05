
public class NGOs extends Service_provider {

public int value;
	
	public void setv(int v) {
		value=v;
	}
	public String get_name() {
		return "NGOs";
	}
	NGOs(){
		System.out.print("You are now on the system NGOs");

	}
	public float offer_percent() {
		Offer obj=new Specific();
		((Specific)obj).set_offer(0);
		return obj.getoffer();
	}
	@Override
	public int receipt(Service s) {
		// TODO Auto-generated method stub
		
		return  value;
	
	}
	

}
