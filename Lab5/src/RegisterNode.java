public class RegisterNode {
    int studentId;
    int classId;
    double grade;
    RegisterNode nextStudent;
    RegisterNode nextClass;

    public RegisterNode(int studentId, int classId, double grade, RegisterNode nextStudent, RegisterNode nextClass) {
        this.studentId = studentId;
        this.classId = classId;
        this.grade = grade;
        this.nextStudent = nextStudent;
        this.nextClass = nextClass;
    }
    public RegisterNode(){
        this(0,0,4.0,null,null);
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if(grade>=0 && grade<=4.0){
            this.grade = grade;
        }
    }
}
