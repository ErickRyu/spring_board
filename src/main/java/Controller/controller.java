package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sjryu on 2018-02-08.
 */
@Controller
public class controller {

    @RequestMapping(value = "/")
    public String test(){
        return "index";
    }
}

