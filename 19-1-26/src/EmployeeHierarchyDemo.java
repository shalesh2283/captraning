class Employee {
    String name;
    int id;
    double salary;
    Employee(String n,int i,double s){
        name=n; id=i; salary=s;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String n,int i,double s,int t){
        super(n,i,s); teamSize=t;
    }
}

class Developer extends Employee {
    String language;
    Developer(String n,int i,double s,String l){
        super(n,i,s); language=l;
    }
}

class Intern extends Employee {
    int duration;
    Intern(String n,int i,double s,int d){
        super(n,i,s); duration=d;
    }
}

public class EmployeeHierarchyDemo {
    public static void main(String[] args){
        Employee e1=new Manager("A",1,50000,5);
        Employee e2=new Developer("B",2,40000,"Java");
        Employee e3=new Intern("C",3,15000,6);
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
