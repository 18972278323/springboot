package cn.cigar.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/test01")
    public String test01(Map<String, Object> map) {
        map.put("code", 200);
        map.put("msg", "请求成功");
        map.put("hello", "<h2>郑紫琴，我爱你</h2>");
        map.put("data", Arrays.asList("郑紫琴", "加雪松", "林南松"));
        return "test01";
    }
}
