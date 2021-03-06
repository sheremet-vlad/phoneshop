package com.es.phoneshop.web.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    private static final String ERROR_PARAMETER = "error";
    private static final String ERROR_MESSAGE = "Not valid date";
    private static final String ERROR_MESSAGE_PARAMETER = "errorMessage";

    @RequestMapping(method = RequestMethod.GET)
    public void getLoginPage() {
    }

    @RequestMapping(params = {ERROR_PARAMETER})
    public void failedLogin(Model model) {
        model.addAttribute(ERROR_MESSAGE_PARAMETER, ERROR_MESSAGE);
    }
}
