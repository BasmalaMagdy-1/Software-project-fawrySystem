
public class Vodafone extends Service_provider{

	String phone;
	public double value;
	public int taxes;
	
	public void setp(String p) {
		phone =p;
	
	}
	public void setv(int v) {
		value=v;
	}
	public String get_name() {
		return "Vodafone";
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(30);
		return obj.getoffer();
	}

	@Override
	public int receipt(Service s) {
		if(s.get_name()=="Mobile_recharge") {
		
			taxes= (int) (value*1.1) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			taxes=100;
		}
		return taxes ;
		
	
		
	}
	
	
}
