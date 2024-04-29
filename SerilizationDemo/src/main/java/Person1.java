
public class Person1 extends Person {
	String course;
	int fee;
	public Person1(int id,String name,String course,int fee) {
		// TODO Auto-generated constructor stub
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getFee() {
		return fee;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString()+" "+getCourse()+" "+getFee());
	}
	
	

}
