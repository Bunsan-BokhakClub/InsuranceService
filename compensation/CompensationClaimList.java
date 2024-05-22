package compensation;

import java.util.ArrayList;

public interface CompensationClaimList {

	public void add();

	public void delete();

	public ArrayList<CompensationClaim> get();

	public void update();

}