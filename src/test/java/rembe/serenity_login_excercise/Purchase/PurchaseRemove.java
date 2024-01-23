/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Purchase;

//@author rembe

import net.serenitybdd.core.steps.UIInteractions;

 
public class PurchaseRemove extends UIInteractions{
    
    private String btn_product1 = "#add-to-cart-sauce-labs-backpack";
    private String btn_product2 = "#add-to-cart-sauce-labs-bike-light";
    private String btn_product3 = "#add-to-cart-sauce-labs-fleece-jacket";
    private String btn_cart = ".shopping_cart_link";
    private String btn_remove1 = "#remove-sauce-labs-backpack";
    private String btn_remove2 = "#remove-sauce-labs-bike-light";
    private String btn_remove3 = "#remove-sauce-labs-fleece-jacket";
    
    public void purchaseRemove(){
        $(btn_product1).click();
        $(btn_product2).click();
        $(btn_product3).click();
        $(btn_cart).click();
        $(btn_remove1).click();
        $(btn_remove2).click();
        $(btn_remove3).click();
        $(btn_cart).click();
    }
    
    public boolean getCart(){
        return $(btn_cart).isDisabled();
    }
    

}
