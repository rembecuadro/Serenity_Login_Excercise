/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Purchase;

//@author rembe

import net.serenitybdd.core.steps.UIInteractions;

 
public class PurchaseAction extends UIInteractions{
    private String btn_product = "#add-to-cart-sauce-labs-bike-light";
    private String btn_cart = ".shopping_cart_link";
    private String btn_checkout = "#checkout";
    private String txt_box_firstName = "#first-name";
    private String txt_box_lastName = "#last-name";
    private String txt_box_zip = "#postal-name";
    private String btn_continue = "#continue";
    private String btn_finish_purchase = "#finish";
    
    public void purchase(String firstName, String lastName, String zip){
        $(btn_product).click();
        $(btn_cart).click();
        $(btn_checkout).click();
        $(txt_box_firstName).click();
        $(txt_box_lastName).click();
        $(txt_box_zip).click();
        $(btn_continue).click();
        $(btn_finish_purchase).click();
    }
    
}
