abstract class Second{
    public String Name= "Shiva";
    public int age = 21;
    public abstract void study();
}
class Student extends Second{
    public int graduationYear =2023;
    public void study(){
        System.out.println("Studing all day long");
    }
}
class Abstract{
    public static void main(String[] args){
        Student myObj = new Student();
        System.out.println("Name: " + myObj.Name);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}