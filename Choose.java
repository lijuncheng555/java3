package School;

public class Choose{
    String number;
    String Teacher;
    String coursetime;
    String coursesite;
    String course;

    Choose(String number,String Teacher,String coursetime,String coursesite,String course) {
        setnumber(number);
        setTeacher(Teacher);
        setcoursetime(coursetime);
        setcoursesite(coursesite);
        setcourse(course);
    }
    public String getnumber() {
        return number;
    }
    public void setnumber(String number) {
        this.number = number;
    }
    public String getteacher() {
        return Teacher;
    }
    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }
    public String getcoursetime() {
        return coursetime;
    }
    public void setcoursetime(String coursetime) {
        this.coursetime= coursetime;
    }
    public String getcoursesite() {
        return coursesite;
    }
    public void setcoursesite(String coursesite) {
        this.coursesite = coursesite;
    }
    public String getcourse() {
        return course;
    }
    public void setcourse(String course) {
        this.course = course;
    }
    public String toString(){
        return "�γ̱��룺"+number+",��ʦ��"+Teacher+",ʱ�䣺"+coursetime+",�ص�:"+coursesite+",�γ����ƣ�"+course;
    }
}
