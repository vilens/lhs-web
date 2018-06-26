package club.luhuishan.web.controller;

import club.luhuishan.web.domain.po.Product;
import club.luhuishan.web.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by vilens on 2018/6/12.
 */
@Controller
@RequestMapping("")
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    IndexService indexService;

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mode){
        List<Product> productList= indexService.randomRefresh(3);
        mode.setViewName("/index");
        mode.addObject("productList",productList);
        return mode;
    }

    @RequestMapping("/test")
    public ModelAndView test(ModelAndView mode){
        mode.setViewName("/test");
        return mode;
    }
}
