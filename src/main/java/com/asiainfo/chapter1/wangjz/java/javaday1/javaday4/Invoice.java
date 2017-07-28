package com.asiainfo.chapter1.wangjz.java.javaday1.javaday4;

/**
 * Created by wjz123456 on 2017/7/27.
 */
public class Invoice implements Payable {
private String partNumber;
    private String partDescription;
    private int quantity;
    private double priceperItem;

    public Invoice(String partNumber, int quantity, String partDescription, double priceperItem) {
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.partDescription = partDescription;
        this.priceperItem = priceperItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int count) {
        quantity=(count<0)?0:count;
    }

    public double getPriceperItem() {
        return priceperItem;
    }

    public void setPriceperItem(double price) {
         priceperItem=(price<0.0)?0.0:price;
    }

    @Override

    public String toString() {
        return String.format("%s:\n%s:%s(%s)\n%s:%d\n%s:$%,.2f","发票","物品名称",getPartNumber(),getPartDescription(),
                "物品数量",getQuantity(),"物品单价",getPriceperItem());
    }

    public double getPaymentAmount() {
        return getQuantity()*getPriceperItem();
    }
}
