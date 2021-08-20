package struggle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenruizhou
 * @date 2021/8/20
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }

}
