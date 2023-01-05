import java.util.Map;

public abstract class Payment_behaviour {
	Service_provider ps;
int r;
public void set_r(int rr) {
	r=rr;
}
public int get_r() {
	return r;
}
 abstract public String get_name();
abstract public void pay(Map<Long,Integer>mp,int price);
void set_provider(Service_provider p) {
	ps=p;
}
Service_provider get_provider( ) {
	return ps;
}


}
