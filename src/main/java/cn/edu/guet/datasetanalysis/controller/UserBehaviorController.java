package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.bean.UserBehavior;
import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.UserBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
