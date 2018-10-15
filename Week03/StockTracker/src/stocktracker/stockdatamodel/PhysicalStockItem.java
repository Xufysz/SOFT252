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
public class PhysicalStockItem extends StockItem{
     public PhysicalStockItem(String name){
         super.setName(name);
     }
     
     public PhysicalStockItem(String name, Integer qty){
         super.setName(name);
         super.setQuantityInStock(qty);
     }
}
