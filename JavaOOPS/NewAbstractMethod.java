abstract class One {
    String myName = "Shiva";
    int myAge = 21;
    public abstract void study();
}
class Student extends One{
    int myGraduateYear = 2023;
    public void study(){
        System.out.println("Studing well Prepare!");
    }
}
class NewAbstractMethod{
    public static void main(String[] args){
        Student myObj = new Student();
        myObj.study();
        System.out.println("My Name: " + myObj.myName);
        System.out.println("My Age: " + myObj.myAge);
        System.out.println("My Graduation Year: " + myObj.myGraduateYear);
    }
}