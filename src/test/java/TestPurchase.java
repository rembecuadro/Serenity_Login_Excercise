
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import rembe.serenity_login_excercise.Authentication.LogInActions;
import rembe.serenity_login_excercise.Authentication.LoginResult;
import rembe.serenity_login_excercise.Authentication.LogoutActions;
import rembe.serenity_login_excercise.Authentication.LogoutResult;
import rembe.serenity_login_excercise.Navigate.NavigateTo;
import rembe.serenity_login_excercise.Navigate.User;
import rembe.serenity_login_excercise.Purchase.PurchaseAction;
import rembe.serenity_login_excercise.Purchase.PurchaseRemove;
import rembe.serenity_login_excercise.Purchase.PurchaseResult;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//@author rembe
@ExtendWith(SerenityJUnit5Extension.class)
class TestPurchase {

    @Managed(driver = "edge", options = "headless")
    WebDriver driver;

    NavigateTo navigate;
    LogInActions login;
    LoginResult loginResult;
    PurchaseAction purchase;
    PurchaseRemove purchaseRemove;
    PurchaseResult purchaseResult;
    LogoutActions Logout;
    LogoutResult LogoutResult;

    @BeforeEach()
    void preconditions(){
        
    }
    @Test
    void testLogin() {
        navigate.navigateTo();
        login.login(User.STANDARD_USER);
        Serenity.reportThat("Verify Login", () -> {
            assertThat(purchaseResult.getTitle().equalsIgnoreCase("Products"));
        });
    }

    @Test
    void testPurchase() {
        purchase.purchase("Remberto", "Cuadro", "12345");
        Serenity.reportThat("Result Purchase", () -> {
            assertThat(purchaseResult.getTitle().equalsIgnoreCase("Checkout: Complete!"));
        });
    }

    
    @Test
    void testRemove() {
        purchaseRemove.purchaseRemove();
        Serenity.reportThat("Purchase Remove Result", () -> {
            assertThat(purchaseRemove.getCart());
        });
    }

    @Test
    void testLogout() throws InterruptedException {
        Logout.logout();
//        Serenity.reportThat("Verify Logout", () -> {
//            assertThat(LogoutResult.tryLoginButton().equalsIgnoreCase("Username"));
//        });
    }

}
