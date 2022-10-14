package CaseStudy1prac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class InvalidPackageId extends Exception{
	public InvalidPackageId(String message) {
		super(message);
	}
}

public class TravelAgency {
	public List<PackageClass> generatePackageCost(String filePath) throws IOException{
		try {
		File obj=new File(filePath);
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		StringBuilder sb=new StringBuilder();
		String line=null;
		String ls=System.getProperty("line.separator");
		while((line=br.readLine())!=null) {
			sb.append(line);
			sb.append(ls);
		}
		
		//Don't forget to delete the last new line separator;
		sb.deleteCharAt(sb.length()-1);
		String content=sb.toString();
		String arr[]=content.split("\n");
		List<PackageClass> lp=new ArrayList<PackageClass>();
		for(int i=0;i<arr.length;i++) {
			String temp[]=arr[i].split(",");
			String a,b,c; double d,f; int e;
			a=temp[0];b=temp[1];c=temp[2];
			d=Double.parseDouble(temp[3]);
			e=Integer.parseInt(temp[4]);
			f=Double.parseDouble(temp[5]);
			
			PackageClass p=new PackageClass(a,b,c,d,e,f);
			lp.add(p);
		}
		
		return lp;
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}
	public boolean validate(String packageId) { 
		String regex = "[0-9]{3}[/]{1}[A-Z]{3}";
		return packageId.matches(regex);
	}
	public List<PackageClass> findPackageWithMinimumNumberOfDays(){
//		Here we have to connect with the database
		
		List<PackageClass> lp=new ArrayList<>();
		try {
			Connection conn=DBHandler.establishConnection();
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery("Select * from package_details where no_of_days=(select MIN(no_of_days) from Package_Details)");
			while(rs.next()) {
				String a=rs.getString(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				double d=rs.getDouble(4);
				int e=rs.getInt(5);
				double f=rs.getDouble(6);
				PackageClass p=new PackageClass(a,b,c,d,e,f);
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		return lp;
		
	}
}
