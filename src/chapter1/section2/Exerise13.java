package chapter1.section2;

import java.util.Date;

public class Exerise13 {
}

class Transaction {
    private final String who;
    private final Date when;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return who() + " spent " + amount() + " on " + when();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        Transaction t = (Transaction) that;
        if (!this.who.equals(t.who)) {
            return false;
        }
        if (!this.when.equals(t.when)) {
            return false;
        }
        if (this.amount != (t.amount)) {
            return false;
        }
        return true;
    }
}
