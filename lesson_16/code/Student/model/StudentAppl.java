package Student.model;

public class StudentAppl {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Anton","Smid",16,"biology");
        Student student2 = new Student(2,"Antoni","Smidt",16,"matematics");
        Student student3 = new Student(3,"Antoniella","Scmidt",16,"chemistry");
        Student student4= new Student(4,"Antonia","Schmidt",16,"computer science");
        Student student5 = new Student(5,"Antonix","Smiedt",16,"physics");

        student1.exam();
        student2.studing();
        student3.vacation();
        student4.walking();
        student5.sleeping();

    }//ende main
}//ende klass
