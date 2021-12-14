package infra;

import app.exporters.ReceiptExportedInterface;
import domain.payment.Receipt;

// Dom PDF é um lib de terceiro que esse software depende para exporta PDFs
public class DomPdfReceiptExporter implements ReceiptExportedInterface {

    private Object exporter;

    public DomPdfReceiptExporter(Object exporter) {
        this.exporter = exporter;
    }

    @Override
    public String export(Receipt receipt) {
        return "";
    }
    
}
