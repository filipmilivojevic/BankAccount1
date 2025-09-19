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


    public double getBalance()
    {
      if (loggedIn == true)
      return balance;
      else
        throw new IllegalStateException("Not logged in");
    }
    public void logOut()
    {
      loggedIn = false;
      
    }
    public double deposit(double despositAmount)
    {
      if (loggedIn == true)
      {
        if (despositAmount > 0)
          balance += despositAmount;
        return balance;
      }
      else
        throw new IllegalStateException("not logged in");
    }
    public void logIn(String password)
    {
      if (password.equals(this.password))
      {
        loggedIn = true;
      }
    }
    public double withdraw(double withdrawAmount)
    {
      if (loggedIn == true)
      {
        if (withdrawAmount > 0)
          balance -= withdrawAmount;
        return balance;
      }
      else
        throw new IllegalStateException("Not logged in");
    }
    




    public static void main(String[]args)
    {
      BankAccount account1  = new BankAccount("Checking", 1111, 1000, "password");
      account1.logIn("password");
      System.out.println(account1.getBalance());
      System.out.println(account1.deposit(500));
      System.out.println(account1.withdraw(1000));
    }
  }
    
   
