package Obs;

public class Main {
    public static void main(String[] args) {

        Course mats = new Course("Matematik", "MAT101", "MAT");
        Course maty = new Course("Matematik", "MAT101", "MAT");
        Course fiziks = new Course("Fizik", "FZK101", "FZK");
        Course fiziky = new Course("Fizik", "FZK101", "FZK");
        Course kimyas = new Course("Kimya", "KMY101", "KMY");
        Course kimyay = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mats.addTeacher(t1);
        fiziks.addTeacher(t2);
        kimyas.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mats,maty, fiziks,fiziky, kimyas,kimyay);
        s1.addBulkExamNote(50,20,40,70,90,17);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mats,maty,fiziks,fiziky, kimyas,kimyay);
        s2.addBulkExamNote(100,50,40, 70, 75,74);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mats,maty, fiziks,fiziky, kimyas, kimyay);
        s3.addBulkExamNote(50,20,40,60,31,72);
        s3.isPass();

    }
}
