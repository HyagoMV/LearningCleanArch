package app.repositories;

import domain.payment.PaymentNumber;
import domain.payment.Receipt;

public interface ReceiptRepositoryInterface {

    Receipt getByPaymentNumber(PaymentNumber number);
    
}
