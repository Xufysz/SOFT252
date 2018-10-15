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
public class ServiceStockItem extends StockItem {
    public ServiceStockItem(String name) {
        super.setName(name);
    }

    public ServiceStockItem(String name, Integer qty) {
        super.setName(name);
        super.setQuantityInStock(qty);
    }

    @Override
    public Boolean isInStock() {
        return true;
    }
}
