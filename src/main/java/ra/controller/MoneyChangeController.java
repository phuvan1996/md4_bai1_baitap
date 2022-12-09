package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("MoneyChangeController")
public class MoneyChangeController {
@RequestMapping("Convert")
    public String Convert(){
    return "changeMoney";
    }
@RequestMapping("Convert1")
    public String Convert(Model model){
    String Convert ="Enter the amount you want to exchange";
    model.addAttribute("name",Convert);
    return "changeMoney";
    }
    @GetMapping("trans")
    public String transUSD(Model model, @RequestParam(defaultValue = "0") Integer usd,@RequestParam(defaultValue = "0")Integer vnd){
    if (usd==0){
        Integer trans = vnd/23000;
        model.addAttribute("usd",trans);
    }else if (vnd==0){
        Integer trans = usd*23000;
        model.addAttribute("vnd",trans);
        }
    return "changeMoney";
    }
}
