package cn.edu.guet.datasetanalysis.service;

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
public interface RFMService {
    List<Map<String,String>> getUserNumGroupByUserType();
}
