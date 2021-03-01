package productimporter.suppliers.starkindustries;

import java.math.BigDecimal;

import productimporter.Product;

public class StarkIndustriesProductTranslator {
    public Product translate(StarkIndustriesProduct source) {
        String supplierName = "STARK";
        String productCode = source.getCode();
        String productName = source.getName();
        var listPrice = new BigDecimal(source.getListPrice());
        var discount = new BigDecimal(source.getDiscountAmount());
        return new Product(supplierName, productCode, productName, listPrice, discount);
    }
}
