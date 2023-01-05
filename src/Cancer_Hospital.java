
public class Cancer_Hospital extends Service_provider{

public int value;
	
	public void setv(int v) {
		value=v;
	}
	public String get_name() {
		return "Cancer_Hospital";
	}
	@Override
	public int receipt(Service s) {
		// TODO Auto-generated method stub
		
		return  value;
	
	}
	public float offer_percent() {
		Offer obj=new Specific();
		((Specific)obj).set_offer(0);
		return obj.getoffer();
	}


}
