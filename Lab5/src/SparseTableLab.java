public class SparseTableLab {
    public static void main(String[] args) {
        SparseTable registerTable = new SparseTable(8000,300);

        registerTable.addRegistration(405,35);
        System.out.println(registerTable.students[405].classId); //35 (35)
        registerTable.addRegistration(405,30);
        System.out.println(registerTable.students[405].classId); //30 (30 , 35)
        registerTable.addRegistration(405,60);
        System.out.println(registerTable.students[405].classId); //30 (30 , 35 , 60) (print 1st = 30)

        System.out.println(registerTable.classes[35].studentId); //405
        registerTable.listAllCLass(405); //30 35 60

        registerTable.addRegistration(500,60);
        registerTable.addRegistration(500,80);
        registerTable.addRegistration(500,30);
        registerTable.listAllCLass(500);
    }
}
