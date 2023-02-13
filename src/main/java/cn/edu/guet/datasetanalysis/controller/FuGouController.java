package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.bean.FuGou;
import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.FuGouService;
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
@RequestMapping("fugou")
public class FuGouController {

    @Autowired
    private FuGouService fuGouService;

    @GetMapping(value = "/getAllUserBuyTimes")
    public HttpResult getAllUserBuyTimes(){
        System.out.println("获取所有用户的购买次数");
        List<FuGou> list = fuGouService.getAllUserBuyTimes();
        return HttpResult.ok(list);
    }

    @GetMapping(value = "/getConsumptionFrequency")
    public HttpResult getConsumptionFrequency(){
        System.out.println("获取所有用户的消费频率");
        List<Map<String,String>> list = fuGouService.getConsumptionFrequency();
        return HttpResult.ok(list);
    }

    @GetMapping(value = "/getConsumptionFrequencyByUserId")
    public HttpResult getConsumptionFrequencyByUserId(String UserId){
        System.out.println("根据userid获取指定用户的消费频率");
        List<Map<String,String>> list = fuGouService.getConsumptionFrequencyByUserId(UserId);
        return HttpResult.ok(list);
    }
}
