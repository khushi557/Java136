public class MyException {
    public static void main(String[] args) {
        Userdefinedexception usdf = new Userdefinedexception();
        try {
            usdf.validate(19);
            usdf.validate(12);

        } catch (invalidageexception e) {
            System.out.println(e.getMessage());
        }
    }
}
