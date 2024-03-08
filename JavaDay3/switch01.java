public class switch01 {
    
    public static void main(String[] args) {
        
        switch (4) {
            case 1:
                System.out.println("CASE 1 is Running");
                break;
            case 2:
                System.out.println("CASE 2 is Running");
                break; // break is uead to break a line from the executing code
            case 3:
                System.out.println("CASE 3 is Running ");

            default: // if any condition is not matching to his case then its show the default value
                 System.out.println("DEFAULT is Running");
                break;
        }
    }
}
