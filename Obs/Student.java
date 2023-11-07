package Obs;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mats;
    Course maty;
    Course fiziks;
    Course fiziky;

    Course kimyas;
    Course kimyay;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo,Course mats,Course maty, Course fiziks,Course fiziky,Course kimyas, Course kimyay){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mats = mats;
        this.maty = maty;
        this.fiziks = fiziks;
        this.fiziky = fiziky;
        this.kimyas = kimyas;
        this.kimyay = kimyay;
        calcaverage();
        this.isPass = false;

    }
    public void addBulkExamNote(int mats,int maty,int fiziks,int fiziky, int kimyas, int kimyay){
        if(mats >= 0 && mats <= 100){
            this.mats.note = mats;
        }
        if(maty >= 0 && maty <= 100){
            this.maty.note = maty;
        }
        if (fiziks >= 0 && fiziks <= 100) {
            this.fiziks.note = fiziks;
        }
        if (fiziky >= 0 && fiziky <= 100) {
            this.fiziky.note = fiziky;
        }

        if (kimyas >= 0 && kimyas <= 100) {
            this.kimyas.note = kimyas;
        }
        if (kimyay >= 0 && kimyay <= 100) {
            this.kimyay.note = kimyay;
        }

    }

    public void isPass(){
        if(this.mats.note == 0 || this.fiziks.note == 0 || this.kimyas.note == 0 ||this.maty.note == 0 || this.fiziky.note == 0 || this.kimyay.note == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass){
                System.out.println("Sınıfı geçti. ");
            }else{
                System.out.println("Sınıfta kaldı. ");
            }
        }
    }
    public void calcaverage(){
        this.average = ((this.fiziks.note*0.20+this.fiziks.note*0.80) +(this.kimyas.note*0.2+this.kimyay.note*0.8) + (this.mats.note*0.2+this.maty.note*0.8))/3;

    }
    public boolean isCheckPass(){
        calcaverage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + (this.mats.note*0.2+this.maty.note*0.8));
        System.out.println("Fizik Notu : " + (this.fiziks.note*0.20+this.fiziks.note*0.80));
        System.out.println("Kimya Notu : " + (this.kimyas.note*0.2+this.kimyay.note*0.8));
    }
}
