package struggle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @author chenruizhou
 * @date 2021/8/20
 */
@RestController
public class HelloController {

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("testAttributeName", "hello, modelAndView");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping(value = "/testPutRequestMethod", method = RequestMethod.PUT)
    public ModelAndView testPutRequestMethod(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("testAttributeName1", username + "-" + password);
        mv.addObject("testAttributeName2", "测试PUT请求方法成功！");
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping ("/testResponseEntity")
    public ResponseEntity<Map<String, Object>> testResponseEntity() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Map<String, Object> map = new HashMap<>(16);
        map.put("UUID", UUID.randomUUID().toString());
        map.put("message", "测试ResponseEntity成功！");
        map.put("data", list);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


}
