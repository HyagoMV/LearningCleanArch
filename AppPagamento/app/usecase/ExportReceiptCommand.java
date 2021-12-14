package app.usecase;

import domain.payment.PaymentNumber;
import domain.payment.Receipt;

public class ExportReceiptCommand {
    private PaymentNumber paymentNumber;

    public ExportReceiptCommand(PaymentNumber paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public PaymentNumber getPaymentNumber() {
        return paymentNumber;
    }
}
