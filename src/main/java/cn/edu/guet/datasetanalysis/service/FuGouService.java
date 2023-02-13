package cn.edu.guet.datasetanalysis.service;

import cn.edu.guet.datasetanalysis.bean.FuGou;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.service
 * @ClassName: FuGouService.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:45:00
 */
public interface FuGouService {
    List<FuGou> getAllUserBuyTimes();
    List<Map<String,String>> getConsumptionFrequency();
    List<Map<String,String>> getConsumptionFrequencyByUserId(String UserId);
}
