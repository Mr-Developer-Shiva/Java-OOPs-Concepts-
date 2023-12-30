public class MultipleAttribute{
    String fname = "Shiva";
    String lname = "kumar";
    int age = 21;

    public static void main(String[] args){
        MultipleAttribute myObj = new MultipleAttribute();

        System.out.println("Name: " + myObj.fname + " "  + myObj.lname);
        System.out.println("Age: " + myObj.age);
    } 
}