// import the ArrayList class‏
import java.util.*;
import java.util.Map.Entry;



public class Main {
	public static void main(String[] args) {
		Scanner O3 = new Scanner(System.in); 
		Scanner O33 = new Scanner(System.in); 

		ArrayList<String> services = new ArrayList<String>(); // Create an ArrayList object‏
		services.add("Mobile_recharge");
		services.add("Internet_Payment");
		services.add("Landline");
		services.add("Donations");
		User u;
		Map<String,String>Admin=new HashMap<String, String>();//database
		Map<String,String>m=new HashMap<String, String>();//database
		Map<Long,Integer>credit_card=new HashMap<Long,Integer>();//database
		Map<Long,Integer>Wallet=new HashMap<Long,Integer>();//database
		

		credit_card.put((long) 1, 300);//user id ,his money
		
		Wallet.put((long) 1, 500);//user id ,his money
		Wallet.put((long)2,300);

		

		Admin.put("Admin1", "Admin");
		System.out.println("If you are admin enter 1");
		System.out.println("If you are user enter 2");
		int choice;
		choice=O3.nextInt();
		if(choice==1) {
			 u=new Admin();
		System.out.println("Enter Email and password");
		String email=O3.next();
		String password=O33.nextLine();
		
		if(((Admin) u).login(email,password,Admin)==true) {
			System.out.println("if you want to see refund press 1 ");
			Scanner a = new Scanner(System.in);
			int c=a.nextInt();
			if(c==1)
		
		((Admin) u).AC_REJ(Wallet, 200,(long)1);
		
		}	
		}
		else {
			Scanner O4 = new Scanner(System.in); 
			Scanner O5 = new Scanner(System.in); 

			u=new Client();
				System.out.println("Enter Email and password");
				String email=O4.nextLine();
				String password=O4.nextLine();
				((Client) u).sign_up(email,password,m);
					
				System.out.println("Enter Email and password");
				

				String email2=O5.nextLine();
				String password2=O5.nextLine();
				if(((Client) u).login(email2,password2,m)==true) {
					u.show_service_options(services);
				}
				


				int select;
				select=O3.nextInt();
				Service_factory obj=new Service_factory();
				
				Service ans=obj.create_Service(select);
				ans.setid((long) ((Client) u).get_id());
				
				
			System.out.println("You are now on the system "+ans.get_name());
			System.out.println("This are "+ans.get_name()+" options" );

			ans.show_options();
			int select2;
			Scanner O6 = new Scanner(System.in); 
			
			select2=O6.nextInt();
			
			Payment_behaviour sv=(Payment_behaviour) ans.create(select2);
			
			Service_provider ssv=sv. get_provider();
			float discount= (float) (1-(ssv.offer_percent()/100.0));
		
			int bill=(int)(sv.get_r()*discount);
			
			if(sv.get_name()=="Credit_card")
			sv.pay(credit_card,bill);
			else {
				sv.pay(Wallet,bill);

			}
				}
	
		}
	//8888888888888888888888888888
	
	
	}



