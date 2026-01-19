class Course {
    String name;
    int duration;
    Course(String n,int d){
        name=n; duration=d;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean recorded;
    OnlineCourse(String n,int d,String p,boolean r){
        super(n,d); platform=p; recorded=r;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    PaidOnlineCourse(String n,int d,String p,boolean r,double f){
        super(n,d,p,r); fee=f;
    }
}

public class CourseHierarchyDemo {
    public static void main(String[] args){
        PaidOnlineCourse c=new PaidOnlineCourse("Java",30,"Udemy",true,999);
        System.out.println(c.name+" "+c.fee);
    }
}
