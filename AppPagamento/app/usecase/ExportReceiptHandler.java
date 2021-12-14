package app.usecase;

import app.exporters.ReceiptExportedInterface;
import app.repositories.ReceiptRepositoryInterface;

public class ExportReceiptHandler {

    private ReceiptRepositoryInterface repository;
    private ReceiptExportedInterface exported;

    public ExportReceiptHandler(ReceiptRepositoryInterface repository, ReceiptExportedInterface exported) {
        this.repository = repository;
        this.exported = exported;
    }

    public String handle(ExportReceiptCommand command) {
        var receipt = repository.getByPaymentNumber(command.getPaymentNumber());
        return exported.export(receipt);
    }
    
}
