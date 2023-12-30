public class Exceptions {
    public static void main(String[] aefs){
        checkAge(30);
        try{
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]);
        }catch(Exception e){
            System.out.println("This Sentance Was Error.......");
        }finally{
            System.out.println("Something Was Wrong And use the \'try catch\' is finished:");
        }
    }

    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - you must be atleast 18 years old.");
        }else{
            System.out.println("Access granted - you are old enough.");
        }

    }

}
