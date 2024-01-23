/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Authentication;

//@author rembe

import net.serenitybdd.core.pages.PageObject;

 
public class LoginResult extends PageObject{
    @Override
    public String getTitle() {
        return $(".title").getText();
    }
}
