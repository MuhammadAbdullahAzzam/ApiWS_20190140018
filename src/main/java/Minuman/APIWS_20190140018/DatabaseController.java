/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minuman.APIWS_20190140018;

import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author R.O.G
 */
@Controller
public class DatabaseController {
    
    @RequestMapping("/menu")
    @ResponseBody
    public List<Menu> getMenu(){

        List<Menu> menu = new ArrayList<>();

        MenuJpaController controller = new MenuJpaController();
        try {
            menu = controller.findMenuEntities();
        }
        catch (Exception ex){

        }

        return menu;
    }
}