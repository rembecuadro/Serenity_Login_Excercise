/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Authentication;

//@author rembe

import net.serenitybdd.core.steps.UIInteractions;

 
public class LogoutActions extends UIInteractions{
    public void logout(){
        $("#react-burger-menu-btn").click();
        $("#logout_sidebar_link").click();
    }
}
