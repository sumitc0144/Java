package ASSESSMENT;

import java.util.Comparator;

class ProdIdComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.prodId - p2.prodId;
    }
}

class PriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

class QtyComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p2.qty - p1.qty; // High → Low
    }
}

class BrandComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.brand.compareTo(p2.brand);
    }
}

class ProductNameComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.productName.compareTo(p2.productName);
    }
}

class WeightComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.weight, p2.weight);
    }
}

class BrandPriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        int brandCompare = p1.brand.compareTo(p2.brand);
        if (brandCompare == 0) {
            return Double.compare(p1.price, p2.price);
        }
        return brandCompare;
    }
}
