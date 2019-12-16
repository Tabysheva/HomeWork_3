public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = sum + amount;
        System.out.println("Ваш баланс на счете " + amount);
    }

    public void withDraw(double sum) {
        if (sum > amount) {
            try {
                sum = amount;
                amount = amount - sum;// выявить остаток на счете
                System.out.println("Ваш баланс " + amount);
                throw new LimitException("На вашем блансе нет средств. Ваш баланс ", amount);

            } catch (LimitException e) {
                e.printStackTrace();
            }
        } else {
            amount = amount - sum;
            System.out.println("Ваш баланс уменьшился. Ваш баланс " + amount);
        }
    }
}

