package bai_11_java_collection_framework.baitap;

public class Product  {

    private int idProduct;
    private String nameProduct;
    private double valueProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double valueProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.valueProduct = valueProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", valueProduct=" + valueProduct +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return idProduct == product.idProduct;
    }

}
