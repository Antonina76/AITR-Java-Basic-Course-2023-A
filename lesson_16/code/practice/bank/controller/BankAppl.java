package practice.bank.controller;
import practice.bank.model.BankAccount;

public class BankAppl {
   public static void main(String[] args) {
      BankAccount acc1 = new BankAccount(1000L,"Dmitriy","Volksbank",101,100);
      //acc1 - это объектная переменная, в которой собраны все поля класса и их значения
      System.out.println(acc1.getBalance());
      System.out.println(acc1.getOwner());
    acc1.display();
    //внести деньги на депозит
      acc1.deposit(500);//acc1 вырос баланс
      acc1.display();
      acc1.withdraw(200);//баланс уменьшился
      acc1.display();
      acc1.withdraw(1000);
      acc1.display();
      acc1.withdraw(100);
      acc1.display();
      BankAccount acc2 = new BankAccount(1000L,"Dmitriy","Volksbank",101);
      BankAccount acc3 = new BankAccount(1001L,"Artöm","Deutsche Bank ",103);
      BankAccount acc4 = new BankAccount("Michael","Sparkasse", 103, 500);

   }
}

