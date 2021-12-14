package infra.cli.commands;

import app.usecase.ExportReceiptHandler;

public class SaveReceiptAsPdfCommand implements CommandInterface {
    private ExportReceiptHandler exportReceipt;

    public SaveReceiptAsPdfCommand(ExportReceiptHandler exportReceipt) {
        this.exportReceipt = exportReceipt;
    }

    public void handle(String[] args) {
        
    }
    
}
