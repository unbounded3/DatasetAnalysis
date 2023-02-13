package cn.edu.guet.datasetanalysis.service;

import cn.edu.guet.datasetanalysis.mapper.RDateMapper;

import java.util.List;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.service
 * @ClassName: FuGouService.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:45:00
 */
public interface RDateService {
    List<RDateMapper> getAllInfo();
    List<RDateMapper> getInfoByUserId(String userId);
    List<RDateMapper> getInfoByNearlyBuy(int nearlyBuy);
}
