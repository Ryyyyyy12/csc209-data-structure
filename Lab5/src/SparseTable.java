public class SparseTable {
    RegisterNode[] students; //list of student pointers to node
    RegisterNode[] classes; //list of class pointers to node

    public SparseTable(int amountOfStudents,int amountOfClasses){
        students = new RegisterNode[amountOfStudents];
        classes = new RegisterNode[amountOfClasses];
    }

    public void addRegistration(int studentID , int classID){
        RegisterNode newRegis = new RegisterNode(studentID,classID,-1,null,null);
        //student dimension -> add new course to the student
        if(students[studentID] == null || classID < students[studentID].classId){ //register the first time
            newRegis.nextClass = students[studentID]; //new class will be the first class in the list of this student
            students[studentID] = newRegis;
        }else {
            RegisterNode c; //c = pointer (เส้นลง)
            for(c=students[studentID]; c.nextClass!=null && c.nextClass.classId < classID; c = c.nextClass);
            newRegis.nextClass = c.nextClass;
            c.nextClass = newRegis;
        }

        //class dimension -> add new student to the class
        if(classes[classID]==null || studentID < classes[classID].studentId){
            newRegis.nextStudent = classes[classID];
            classes[classID] = newRegis;
        }else {
            RegisterNode s;
            for(s= classes[classID];s.nextStudent!=null&&s.nextStudent.studentId < studentID;s = s.nextStudent);
            newRegis.nextStudent = s.nextStudent;
            s.nextStudent = newRegis;
        }
    }
    public void listAllCLass(int studentID){
        for(RegisterNode c=students[studentID];c!=null;c =c.nextClass){
            System.out.print(c.classId+" ");
        }
        System.out.println();
    }
}
