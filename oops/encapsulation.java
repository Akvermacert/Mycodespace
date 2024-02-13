package oops;

public class encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.CGPA = 9.7f;   //error
        s1.setCGPA(9.7f);   //correct way

        //System.out.println(s1.CGPA);  //error
        System.out.println(s1.getCGPA());
        s1.setnumberofstudents(20);
        System.out.println(s1.getnumberofstudents());
    }     
}
class Student{
    String name;
    private float CGPA;
    private static int numberofstudents;
    //getter
    public float getCGPA(){
        return CGPA;
    }
    //setter
    public void setCGPA(float newCGPA){
        this.CGPA=newCGPA;
    }
    public static int getnumberofstudents(){
        return numberofstudents;
    }
    public void setnumberofstudents(int newnumber){
        this.numberofstudents=newnumber;
    }
}
