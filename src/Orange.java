import java.util.ArrayList;

public class Orange extends Service_provider {
	
	String phone;
	public double value;
	public int taxes;
	
	public void setp(String p) {
		phone =p;
	
	}
	Orange(){
		System.out.print("You are now on the system Orange");

	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(40);
		return obj.getoffer();
	}
	public void setv(int v) {
		value=v;
	}
	
	public String get_name() {
		return "Orange";
	}
	@Override
	public int receipt(Service s) {
		if(s.get_name()=="Mobile_recharge") {
		
			taxes= (int) (value*1.3) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			taxes=150;
		}
		return taxes ;
		
	
		
	}

}
