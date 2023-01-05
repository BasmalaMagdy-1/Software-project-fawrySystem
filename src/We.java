
public class We extends Service_provider{

	String phone;
	public double value;
	public int taxes;
	
	public void setp(String p) {
		phone =p;
	
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(20);
		return obj.getoffer();
	}
	
	We(){
		System.out.print("You are now on the system WE");
	}
	public void setv(int v) {
		value=v;
	}
	
	public String get_name() {
		return "We";
	}
	@Override
	public int receipt(Service s) {
		if(s.get_name()=="Mobile_recharge") {
		
			taxes= (int) (value*1.5) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			taxes=100;
		}
		return taxes ;
		
	
		
	}

		
	
	



	
}
