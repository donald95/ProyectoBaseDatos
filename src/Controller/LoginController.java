/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Pojo.Usuario;

/**
 *
 * @author JDonald
 */
public class LoginController {

    public boolean AccessSystem(String user, String password) {
        
        Usuario obj = new Usuario();
        
        obj.setUsuario(user);
        obj.setContrasenia(password);
        
        return obj.AccessSystem(obj);
        
    }

}
