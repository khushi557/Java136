package Unit1;

public class Userdefinedexception {
    public void validate (int age) throws invalidageexception{
        if(age<18) {
            throw new invalidageexception("Not eligible to vote age less than 18");
        } else{
                System.out.println("Eligible to vote ");
            }
        }
    }

