package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    static Map<String, String> dictionary = new HashMap();
    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("computer", "máy tính");
        dictionary.put("information", "thông tin");
        dictionary.put("developer", "nhà phát triển");
    }

    @GetMapping(value = "/")
    public String viewSearch() {
        return "dictionary";
    }

    @PostMapping(value = "/")
    public String search(@RequestParam String word, Model model) {
        String english = word.trim().toLowerCase();
        String vietnamese = dictionary.get(english);
        model.addAttribute("vietnamese", vietnamese);
        return  "dictionary";
    }
}