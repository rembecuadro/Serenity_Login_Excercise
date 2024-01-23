/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Navigate;

//@author rembe

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;


public class NavigateTo extends UIInteractions{
    @Step("Navigate to sauceDemo Page")
    public void navigateTo(){
        openUrl("https://www.saucedemo.com/");
    }

}
