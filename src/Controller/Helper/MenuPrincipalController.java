/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import pages.Denuncia;
import pages.Homepage;

/**
 *
 * @author Jhonatan
 */
public class MenuPrincipalController {
    
    private final Homepage pages;

    public MenuPrincipalController(Homepage pages) {
        this.pages = pages;
    }
    
    
    public void navegaParaDenuncia(){
    
    Denuncia denuncia = new Denuncia();
    denuncia.setVisible(true);
    
    
    }

}


