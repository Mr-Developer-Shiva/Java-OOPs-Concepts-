enum Level
    {
        LOW,MEDIUM,HIGH
    }
public class SwitchEnum{
    public static void main(String[] args){
    
    Level myVar = Level.HIGH;
    switch(myVar)
    {
        case LOW:
            System.out.println("Low Level value.....");
            break;
        case MEDIUM:
            System.out.println("Medium Level value.......");
            break;
        case HIGH:
            System.out.println("High Level Value.......");
            break;
        }
    }
}
