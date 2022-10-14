package CaseStudy1prac;

import java.util.List;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelAgency t=new TravelAgency();
		try {
			List<PackageClass> lp=t.findPackageWithMinimumNumberOfDays();
			System.out.println(t.generatePackageCost(null));
		}
		catch(Exception e) {
			
		}
	}

}
