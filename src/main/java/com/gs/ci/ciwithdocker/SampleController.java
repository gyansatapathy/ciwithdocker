package com.gs.ci.ciwithdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/gs")
public class SampleController {

    @GetMapping("/greet")
    public String greet(HttpServletRequest httpServletRequest) {
        return String.format("Hello Mate, You are calling from: %s This is from docker container with os: %s and time: %s and hosted in: %s",
                httpServletRequest.getRemoteAddr(),
                System.getProperties().get("os.name"), LocalDateTime.now(),
                System.getProperties().get("user.timezone"));
    }
}
