/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author krusby
 */
public class StockItem {

    private String name = "UNKNOWN";
    private Integer quantityInStock = 0;
    private Double sellingPrice = 1000000.00;
    private Double costPrice = 1000000.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or blank!");
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public Boolean isInStock() {
        if (this.quantityInStock > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            throw new IllegalArgumentException("Quantity cannot be null or negative!");
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice != null && sellingPrice >= 0) {
            if (sellingPrice >= this.costPrice) {
                this.sellingPrice = sellingPrice;
            } else {
                throw new IllegalArgumentException("Selling price must be more or equal to cost price!");
            }
        } else {
            throw new IllegalArgumentException("Selling price must not be null or negative!");
        }

    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if (costPrice != null && costPrice >= 0) {
            this.costPrice = costPrice;
        } else {
            throw new IllegalArgumentException("Cost price cannot be null or negative!");
        }
    }
}
