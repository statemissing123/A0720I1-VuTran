package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Signature;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("free fire", "Liên Quân");
        dictionary.put("said to","nói");
        dictionary.put("hello", "Xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("game", "Trò Chơi");
    }

    @GetMapping(value = "/search")
    public ModelAndView viewSearch() {
        return new ModelAndView("dictionary");
    }

    @PostMapping(value = "/search")
    public String Search(@RequestParam String word, Model model) {
        String english = word.trim().toLowerCase();
        String vietnamese = dictionary.get(english);
        model.addAttribute("vietnamese", vietnamese);
        return "dictionary";
    }
}
