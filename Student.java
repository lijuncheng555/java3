package School;

public class Student extends Member{
	String grade;
	String Scourse;
	Student(String number,String name,String gender,String grade,String Scourse){
		super(number,name,gender);
		setgrade(grade);
		setScourse(Scourse);
		}
	public void setgrade(String grade) {
		this.grade=grade;
	}
	public void setScourse(String Scourse) {
		this.Scourse=Scourse;
	}
	public String getgrade() {
		return grade;
	}
	public String getScourse() {
		return Scourse;
	}
	public String toString() {
	        return "ѧ�ţ�"+number+",������"+name+"���Ա�"+gender+",�꼶��"+grade+",�γ̣�"+Scourse;
	}
}
