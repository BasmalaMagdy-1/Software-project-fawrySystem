
public class Monthly extends Service_provider{

	String phone;
	public void setp(String p) {
		phone =p;
	
	}
	public String get_name() {
		return "Monthly";
	}
	@Override
	public int receipt(Service s) {
		// TODO Auto-generated method stub
		
		return  5;
	
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(50);
		return obj.getoffer();
	}

}
