
public class Service_factory {
Service create_Service(int type) {
	Service s=null;
	if(type==0) {
		s= new Mobile_recharge();
	}
if(type==1) {
		s= new Internet_Payment();
		
	}if(type==2) {
		s= new Landline ();

		
	}if(type==3) {
		s= new Donation();
		
	}
	return s;
}
}


