package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.RFMService;
import cn.edu.guet.datasetanalysis.service.UserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.controller
 * @ClassName: FuGouController.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:49:00
 */
@RestController
@RequestMapping("useraction")
public class UserActionController {

    @Autowired
    private UserActionService userActionService;

    @GetMapping(value = "/countUserBehavior")
    public HttpResult countUserBehavior(){
        System.out.println("获取所有用户的购买次数");
        long count = userActionService.countUserBehavior();
        return HttpResult.ok(count);
    }
    @GetMapping(value = "/countClickAndBuy")
    public HttpResult countClickAndBuy(){
        System.out.println("获取点击并购买的用户数量");
        long count = userActionService.countClickAndBuy();
        return HttpResult.ok(count);
    }
    @GetMapping(value = "/countClickAdditionalAndBuy")
    public HttpResult countClickAdditionalAndBuy(){
        System.out.println("获取点击、加购并购买的用户数量");
        long count = userActionService.countClickAdditionalAndBuy();
        return HttpResult.ok(count);
    }
    @GetMapping(value = "/countClickCollectionAndBuy")
    public HttpResult countClickCollectionAndBuy(){
        System.out.println("获取点击、收藏并购买的用户数量");
        long count = userActionService.countClickCollectionAndBuy();
        return HttpResult.ok(count);
    }
    @GetMapping(value = "/countClickAdditionalCollectionAndBuy")
    public HttpResult countClickAdditionalCollectionAndBuy(){
        System.out.println("获取点击、加购、收藏并购买的用户数量");
        long count = userActionService.countClickAdditionalCollectionAndBuy();
        return HttpResult.ok(count);
    }
    @GetMapping(value = "/countLoss")
    public HttpResult countLoss(){
        System.out.println("获取点击但什么都不做的用户数量");
        long count = userActionService.countLoss();
        return HttpResult.ok(count);
    }
}
