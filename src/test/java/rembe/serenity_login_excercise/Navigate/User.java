/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package rembe.serenity_login_excercise.Navigate;

/**
 *
 * @author rembe
 */
public enum User {
    
    // DEFINIENDO LOS USUARIOS
    
    STANDARD_USER("standard_user","secret_sauce", "Standard User"),
    LOCKED_OUT_USER("locked_out_user","secret_sauce", "Locked User"),
    PROBLEM_USER("problem_user","secret_sauce", "Problem User"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user","secret_sauce", "Performance Glitch User"),
    ERROR_USER("error_user","secret_sauce", "Problem User"),
    VISUAL_USER("visual_user","secret_sauce", "Problem User");
    
    // DEFINICION DE ATRIBUTOS, CONSTRUCTORES Y GETTERS
    
    private final String username;
    private final String password;
    private final String description;

    private User(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }
}
