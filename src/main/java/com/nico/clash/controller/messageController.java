package com.nico.clash.controller;

import com.nico.clash.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class messageController {

    private List<Message> messageList = new ArrayList();

    @GetMapping("/msg")
    public String showMessage(Model model) {
        model.addAttribute("msgList", messageList);
        model.addAttribute("newMessage", new Message());

        return "MesgPage";
    }

    @PostMapping("/msg")
    public String postMessage(@ModelAttribute Message newMessage){
        messageList.add(newMessage);

        return "redirect:msg";

    }
}
