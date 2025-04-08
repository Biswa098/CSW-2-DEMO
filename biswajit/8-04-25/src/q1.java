class Bus{
	String bus_id;
	int bus_fare;
	String source;String destination;int distance;String type;
	Bus(String source,String destination,int distance,String type){
		this.source=source;
		this.destination=destination;
		this.distance=distance;
		this.bus_id=busidgenerator();
		this.type=type;
	}
	public String busidgenerator() {
		String id="";
		for(int i=0;i<3;i++) {
			if(i%2==0) {
				id+=Character.toUpperCase(source.charAt(i));
				
			}else id+=source.charAt(i);
		}id+="-";
		for(int i=0;i<3;i++) {
			if(i%2==0) {
				id+=Character.toUpperCase(destination.charAt(i));
			}else id+=destination.charAt(i);
		}return id;
	}
public void busfareCalculator() {
		if(type=="ac") {
		System.out.println("Bus Fare: "+distance+"*"+ac_fare+"="+(distance*ac_fare));
	}else if(type=="non-ac") {
		System.out.println("Bus Fare: "+distance+"*"+nonac_fare+"="+(distance*nonac_fare));

	}
}
	

public void details() {
	System.out.println("Source: "+source);
	System.out.println("Destination:"+destination);
	System.out.println("Distance:"+distance);
	System.out.println("For Ac:Rs "+ac_fare+"per km");
	System.out.println("for NonAc:Rs "+nonac_fare+"per km");
	System.out.println("Bus Id:"+busidgenerator);
	busfareCalculator();
}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b1=new Bus("Bhubaneswar","Hyderabad",1050,"ac");
		b1.details();
		Bus b2=new Bus("Bhubaneswar","Hyderabad",1050,"non-ac");
		b2.details();
	}

}
