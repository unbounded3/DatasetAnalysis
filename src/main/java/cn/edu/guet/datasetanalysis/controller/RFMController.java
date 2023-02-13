package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.bean.FuGou;
import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.FuGouService;
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
@RequestMapping("rfm")
public class RFMController {

    @Autowired
    private RFMService RFMService;

    @GetMapping(value = "/getUserNumGroupByUserType")
    public HttpResult getUserNumGroupByUserType(){
        System.out.println("获取所有用户的购买次数");
        List<Map<String, String>> list = RFMService.getUserNumGroupByUserType();
        return HttpResult.ok(list);
    }
}
