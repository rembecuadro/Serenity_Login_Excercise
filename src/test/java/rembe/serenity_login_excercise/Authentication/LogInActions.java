/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rembe.serenity_login_excercise.Authentication;

//@author rembe

import net.serenitybdd.core.steps.UIInteractions;
import rembe.serenity_login_excercise.Navigate.User;

 
    public class LogInActions extends UIInteractions {
        public void login (User user) {
            $("#user-name").sendKeys(user.getUsername());
            $("#password").sendKeys(user.getPassword());
            $("#login-button").click();
        }
}
