package infra;

import app.repositories.ReceiptRepositoryInterface;
import domain.payment.PaymentNumber;
import domain.payment.Receipt;

public class MongoDbReceiptRepository implements ReceiptRepositoryInterface {

    private Object mongodDb;

    public MongoDbReceiptRepository(Object mongodDb) {
        this.mongodDb = mongodDb;
    }

    @Override
    public Receipt getByPaymentNumber(PaymentNumber number) {
        return null;
    }
    
}
