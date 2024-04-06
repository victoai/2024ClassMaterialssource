package 윤정님;

public class TV {
	

	String name;
	String supervise;
	String airtime;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSupervise() {
		return supervise;
	}


	public void setSupervise(String supervise) {
		this.supervise = supervise;
	}


	public String getAirtime() {
		return airtime;
	}


	public void setAirtime(String airtime) {
		this.airtime = airtime;
	}
	
	
	public TV(String name, String supervise, String airtime) {
		super();
		this.name = name;
		this.supervise = supervise;
		this.airtime = airtime;
	}
	
	
	public TV() {}
	
	
	@Override
	public String toString() {
		return "TV [이름 = " + name + ", 감독 = " + supervise + ", 방영 시간 = " + airtime + "]";
	}
}
