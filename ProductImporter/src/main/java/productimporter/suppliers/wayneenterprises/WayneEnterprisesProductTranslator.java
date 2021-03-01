package productimporter.suppliers.wayneenterprises;

import java.math.BigDecimal;

import productimporter.Product;

final class WayneEnterprisesProductTranslator {
    public Product translateProduct(WayneEnterprisesProduct source) {
        BigDecimal listPrice = new BigDecimal(source.getListPrice());
        BigDecimal discount = new BigDecimal(source.getListPrice() - source.getSellingPrice());
        return new Product("WAYNE", source.getId(), source.getTitle(), listPrice, discount);
    }
}
