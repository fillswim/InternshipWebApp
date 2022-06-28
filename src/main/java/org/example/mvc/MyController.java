package org.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/app01")
public class MyController {

    @RequestMapping("/sample")
    public String showFirstView() {
        return "sample";
    }

}
