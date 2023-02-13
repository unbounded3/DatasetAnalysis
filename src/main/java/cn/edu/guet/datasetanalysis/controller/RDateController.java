package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.mapper.RDateMapper;
import cn.edu.guet.datasetanalysis.service.RDateService;
import cn.edu.guet.datasetanalysis.service.RFMService;
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
@RequestMapping("rdate")
public class RDateController {

    @Autowired
    private RDateService rDateService;

    @GetMapping(value = "/getAllInfo")
    public HttpResult getAllInfo(){
        System.out.println("获取所有用户的购买次数");
        List<RDateMapper> list = rDateService.getAllInfo();
        return HttpResult.ok(list);
    }

    @GetMapping(value = "/getInfoByUserId")
    public HttpResult getInfoByUserId(String userId){
        System.out.println("根据userid获取用户的购买次数");
        List<RDateMapper> list = rDateService.getInfoByUserId(userId);
        return HttpResult.ok(list);
    }

    @GetMapping(value = "/getInfoByNearlyBuy")
    public HttpResult getInfoByNearlyBuy(int nearlyBuy){
        System.out.println("获取所有用户的购买次数");
        List<RDateMapper> list = rDateService.getInfoByNearlyBuy(nearlyBuy);
        return HttpResult.ok(list);
    }
}
