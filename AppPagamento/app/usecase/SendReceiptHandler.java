package app.usecase;

public class SendReceiptHandler {

    private ExportReceiptHandler exportReceipt;
    private Object emailDispatcher;

    public SendReceiptHandler(ExportReceiptHandler exportReceipt, Object emailDispatcher) {
        this.exportReceipt = exportReceipt;
        this.emailDispatcher = emailDispatcher;
    }
  
    public boolean handle(SendReceiptCommand command) {
        // Export PDF
        exportReceipt.handle(new ExportReceiptCommand(command.getPaymentNumber()));

        // Sennd email
        command.getUser().getEmail();

        return true;
    }
}
