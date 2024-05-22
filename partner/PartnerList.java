package partner;

import java.util.ArrayList;

public interface PartnerList {

	public void add(Partner partner);

	public void delete();

	public ArrayList<Partner> get();

	public void update();

}