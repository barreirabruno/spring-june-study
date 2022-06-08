package br.com.appjuneb.JuneStudyB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FIrstController {

    @RequestMapping("/")
    public String index() {
        return "[HELLO WORLD]";
    }
}
