package cn.edu.guet.datasetanalysis.controller;

import cn.edu.guet.datasetanalysis.http.HttpResult;
import cn.edu.guet.datasetanalysis.service.RFMService;
import cn.edu.guet.datasetanalysis.service.UserRetentionService;
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
@RequestMapping("userretention")
public class UserRetentionController {

    @Autowired
    private UserRetentionService userRetentionService;

    @GetMapping(value = "/getUserRetentionRate")
    public HttpResult getUserRetentionRate(){
        System.out.println("获取用户留存率");
        List<Map<String, String>> list = userRetentionService.getUserRetentionRate();
        return HttpResult.ok(list);
    }
}
