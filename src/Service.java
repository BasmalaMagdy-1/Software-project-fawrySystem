
public abstract class Service {
public Payment_behaviour pay_behave;
public String name;
 
public abstract void setid(Long id);

public abstract String  get_name();

abstract Payment_behaviour create(int type);
abstract void show_options();



}
