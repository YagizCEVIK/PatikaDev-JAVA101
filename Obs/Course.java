package Obs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

public Course(String name,String code, String prefix){
    this.name = name;
    this.code = code;
    this.prefix = prefix;
    this.note = 0;
}
    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı");
        }else{
            System.out.println(t.name + "Akademisyen bu dersi veremez. ");
        }
    }

    void PrintTeacher() {
        if(courseTeacher != null){
            System.out.println(this.name + " dersin akademisyeni : " + courseTeacher.name);
        }else{
            System.out.println(this.name + " dersine akademisyen atanamamıştır.");
        }
    }
}
