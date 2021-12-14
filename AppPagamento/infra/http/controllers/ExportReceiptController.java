package infra.http.controllers;

import org.xml.sax.ErrorHandler;

import app.usecase.ExportReceiptCommand;
import app.usecase.ExportReceiptHandler;

public class ExportReceiptController  implements ControllerInterface {
    private ExportReceiptHandler exportReceipt;

    public ExportReceiptController(ExportReceiptHandler exportReceipt) {
        this.exportReceipt = exportReceipt;
    }

    public Object handle(Object request) {
        exportReceipt.handle(new ExportReceiptCommand(null));
        return null;
    }
}
