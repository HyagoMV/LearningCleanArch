package domain.payment;

import java.time.LocalTime;

public class Payment {
    private PaymentNumber number;
    private LocalTime created;

    public Payment(PaymentNumber number, LocalTime created) {
        setNumber(number);
        setCreated(created);
    }

    public LocalTime getCreated() {
        return created;
    }

    public void setCreated(LocalTime created) {
        this.created = created;
    }

    public PaymentNumber getNumber() {
        return number;
    }

    public void setNumber(PaymentNumber number) {
        this.number = number;
    }
}
