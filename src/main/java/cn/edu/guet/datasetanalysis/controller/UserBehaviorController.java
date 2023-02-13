package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.bean.UserBehavior;
import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.UserBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.controller
 * @ClassName: UserBehaviorController.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 19:28:00
 */
@RestController
@RequestMapping("userbehavior")
public class UserBehaviorController {

    @Autowired
    private UserBehaviorService userBehaviorService;

    @GetMapping(value = "/getAllInfo")
    public HttpResult getAllInfo(){
        System.out.println("获取所有信息");
        List<UserBehavior> infoList = userBehaviorService.getAllInfo();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByUserId")
    public HttpResult getInfoByUserId(String userId){
        System.out.println("根据userid获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByUserId(userId);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByItemId")
    public HttpResult getInfoByItemId(String itemId){
        System.out.println("根据itemid获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByItemId(itemId);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByItemCategory")
    public HttpResult getInfoByItemCategory(String itemCategory){
        System.out.println("根据itemCategory获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByItemCategory(itemCategory);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByBehaviorType")
    public HttpResult getInfoByBehaviorType(String behaviorType){
        System.out.println("根据behaviorType获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByBehaviorType(behaviorType);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByDateTime")
    public HttpResult getInfoByDateTime(String dateTime){
        System.out.println("根据dateTime获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByDateTime(dateTime);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getInfoByDate")
    public HttpResult getInfoByDate(String date){
        System.out.println("根据date获得对应信息");
        List<UserBehavior> infoList = userBehaviorService.getInfoByDate(date);
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getUserActiveTime")
    public HttpResult getUserActiveTime(){
        System.out.println("获取一天中用户活跃时段分布");
        List<Map<String, String>> infoList = userBehaviorService.getUserActiveTime();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getUserBehaviorHabit")
    public HttpResult getUserBehaviorHabit(){
        System.out.println("获取用户行为习惯（从2017-11-25到2017-12-04）");
        List<Map<String, String>> infoList = userBehaviorService.getUserBehaviorHabit();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/countUserActive")
    public HttpResult countUserActive(){
        System.out.println("统计用户行为总数");
        List<Map<String, String>> infoList = userBehaviorService.countUserActive();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/countVisitorsWithVariousBehaviors")
    public HttpResult countVisitorsWithVariousBehaviors(){
        System.out.println("统计不同行为的访客数");
        List<Map<String, String>> infoList = userBehaviorService.countVisitorsWithVariousBehaviors();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getTopTenHits")
    public HttpResult getTopTenHits(){
        System.out.println("获取点击量前二十的商品");
        List<Map<String, String>> infoList = userBehaviorService.getTopTenHits();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/getTopTenPurchase")
    public HttpResult getTopTenPurchase(){
        System.out.println("获取购买量前二十的商品");
        List<Map<String, String>> infoList = userBehaviorService.getTopTenPurchase();
        return HttpResult.ok(infoList);
    }

    @GetMapping(value = "/countBuyTimesOfGoods")
    public HttpResult countBuyTimesOfGoods(){
        System.out.println("统计各种购买次数的数量");
        List<Map<String, String>> infoList = userBehaviorService.countBuyTimesOfGoods();
        return HttpResult.ok(infoList);
    }
}
