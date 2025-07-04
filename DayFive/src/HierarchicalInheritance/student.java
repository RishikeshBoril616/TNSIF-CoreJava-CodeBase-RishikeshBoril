package HierarchicalInheritance;

public class student extends person{
	private String clas;
	private float percent;
	
	public student() {
	System.out.println("Student class default constructor ");
	clas="SY";
	percent=75f;
	}

	public student(String name, String city,String clas, float percent) {
		super( name,  city);
		this.clas = clas;
		this.percent = percent;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}


}
