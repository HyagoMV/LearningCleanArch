package app.exporters;

import domain.payment.Receipt;

public interface ReceiptExportedInterface {

    String export(Receipt receipt);
    
}
