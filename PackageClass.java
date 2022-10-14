package CaseStudy1prac;

import java.util.List;

public class PackageClass {

	String packageId;
	String sourcePlace;
	String destinationPlace;
	double basicFare;
	int noOfDays;
	double packageCost;

	public void calculateCost() {
		if (this.noOfDays <= 5) {
			System.out.println(this.basicFare * this.noOfDays);
			return;
		}
		if (this.noOfDays > 5 && this.noOfDays <= 8) {
			this.packageCost = this.basicFare * this.noOfDays * 0.97;
			return;
		}
		if (this.noOfDays > 8 && this.noOfDays <= 10) {
			this.packageCost = this.basicFare * this.noOfDays * 0.95;
			return;
		}
		if (this.noOfDays > 5) {
			this.packageCost = this.basicFare * this.noOfDays * 0.93;
			return;
		}

	}

	// Constructors and getters and setters zone

	public PackageClass() {

	}

	public PackageClass(String packageId, String sourcePlace, String destinationPlace, double basicFare, int noOfDays,
			double packageCost) {
		this.packageId = packageId;
		this.sourcePlace = sourcePlace;
		this.destinationPlace = destinationPlace;
		this.basicFare = basicFare;
		this.noOfDays = noOfDays;
		this.packageCost = packageCost;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getSourcePlace() {
		return sourcePlace;
	}

	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}

	public double getBasicFare() {
		return basicFare;
	}

	public void setBasicFare(double basicFare) {
		this.basicFare = basicFare;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	public static void main(String[] args) {

	}

}
