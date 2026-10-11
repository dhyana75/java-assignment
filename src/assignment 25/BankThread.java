class BankAccountinfo {
    int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class DepositThread extends Thread {
    BankAccountinfo b;

    DepositThread(BankAccountinfo b) {
        this.b = b;
    }

    public void run() {
        b.deposit(500);
    }
}

class WithdrawThread extends Thread {
    BankAccountinfo b;

    WithdrawThread(BankAccountinfo b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(300);
    }
}

class BankThread {
    public static void main(String[] args) {
        BankAccountinfo b = new BankAccountinfo();

        DepositThread t1 = new DepositThread(b);
        WithdrawThread t2 = new WithdrawThread(b);

        t1.start();
        t2.start();
    }
}