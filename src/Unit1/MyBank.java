package Unit1;

public class MyBank {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.withdraw(5000);
            b.withdraw(15000);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
