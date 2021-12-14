package infra;

import app.repositories.ReceiptRepositoryInterface;
import domain.payment.Payment;
import domain.payment.PaymentNumber;
import domain.payment.Receipt;

public class MySqlReceiptRepository implements ReceiptRepositoryInterface {

    private Object pdo;

    public MySqlReceiptRepository(Object pdo) {
        this.pdo = pdo;
    }

    @Override
    public Receipt getByPaymentNumber(PaymentNumber number) {
        return null;
    }
    
}
