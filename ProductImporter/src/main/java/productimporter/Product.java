package productimporter;

import java.math.BigDecimal;

public final class Product {
    private final String supplierName;
    private final String productCode;
    private final String productName;
    private final BigDecimal listPrice;
    private final BigDecimal discount;

    public Product(String supplierName, String productCode, String productName, BigDecimal listPrice,
            BigDecimal discount) {
        this.supplierName = supplierName;
        this.productCode = productCode;
        this.productName = productName;
        this.listPrice = listPrice;
        this.discount = discount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}
