package pers.hanchao.springbootdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //获取配置文件的属性
    @Value("${person.name}")
    private String name;

    @Autowired
    ConfigPersonBean configPersonBean;

    @Autowired
    ConfigCompanyBean configCompanyBean;

    @GetMapping("/hi")
    public String hi(){
        return "hi, " + name;
    }

    @GetMapping("/hii")
    public String hii(){
        return configPersonBean.toString();
    }

    @GetMapping("/hiii")
    public String hiii(){
        return configCompanyBean.toString();
    }

}
