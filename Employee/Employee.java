package Employee;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double sbonus;
    double vergi;
    double lsalary;



    public Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;

        this.salary = salary;

        this.workHours = workHours;

        this.hireYear = hireYear;

    }

    void tax(){
        if(this.salary<= 1000){
            vergi = 0;

        } else if (this.salary >= 1000) {
            vergi = this.salary*0.03;

        }

    }
    void bonus(){
        if(this.workHours>= 40){
           sbonus =  (this.workHours-40)*30;

        }
        else{
            sbonus = 0;

        }
    }

    void raiseSalary(){
        if(2021-this.hireYear <10 ){
           lsalary = this.salary*0.05;

        }else if(2021-this.hireYear >9 && 2021-this.hireYear <20  ){
            lsalary = this.salary * 0.10;

        }else if(2021-this.hireYear>19){
            lsalary = this.salary * 0.15;

        }
    }

    public String toString(){
        tax();
        bonus();
        raiseSalary();
        double totalSalary = this.salary - vergi + sbonus + lsalary;
        return "Adı : "+this.name +
                "\nMaaşı : "+ this.salary +
                "\nÇalışma Saati : "+this.workHours +
                "\nBaşlangıç yılı : "+this.hireYear +
                "\nVergi : "+vergi +
                "\nBonus : "+sbonus +
                "\nMaaş Artışı : "+lsalary +
                "\nVergi ve Bonuslar ile birlikte maaş : "+ (this.salary - vergi + sbonus) +
                "\nToplam Maaş : "+ totalSalary;
    }
}
