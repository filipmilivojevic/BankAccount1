public class BankAccount
  {
    private String name;
    private int accountNumber;
    private double balance;
    private String password;
    private boolean loggedIn;
    
    public BankAccount(String name, int accountNumber, double balance, String password)
    {
      this.name = name;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.password = password;
      this.loggedIn = false;
      
    }


    public double getBackBalance()
    {
      if (loggedIn == true)
      return balance;
      else
        throw new IllegalStateException();
    }
    public static void main(String[]args)
    {
      BankAccount account1  = new BankAccount("Checkin", 1111, 1000, "password");
      System.out.println(account1.getBackBalance());
    }
    public void logIn(String password)
    {
      if (password.equals(this.password))
      {
        loggedIn = true;
      }
    }
    
  }
