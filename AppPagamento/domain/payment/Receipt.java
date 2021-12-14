package domain.payment;

import java.time.LocalTime;

public class Receipt {
    private Payment payment;
    private LocalTime created;

    public Receipt(Payment payment, LocalTime created) {
        setPayment(payment);
        setCreated(created);
    }
 
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalTime getCreated() {
        return created;
    }

    public void setCreated(LocalTime created) {
        this.created = created;
    }
    
}
