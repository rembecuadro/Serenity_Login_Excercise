/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Purchase;

//@author rembe

import net.serenitybdd.core.steps.UIInteractions;

 
public class PurchaseResult extends UIInteractions {
    public String purchaseResult(){
        return $("span.title").getText();
    }
}
