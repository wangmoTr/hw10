package homework10;

   class BankAccount {
     private int balance = 0;
//     public int remaining = 0;

     public int deposit( int sum) {
         balance = balance + sum;
         return balance;

     }

     public int withdraw (int takeout) {
         balance = balance - takeout;
         return balance;
     }
    public void getBalance(int total) {
        balance = total;
    }
    public void setBalance( int remain) {
        balance = remain;
    }

}
