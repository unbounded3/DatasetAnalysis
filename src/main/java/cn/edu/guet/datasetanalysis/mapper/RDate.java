package cn.edu.guet.datasetanalysis.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.mapper
 * @ClassName: RDate.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 23:23:00
 */
@Mapper
public interface RDate {
    List<RDate> getAllInfo();
    List<RDate> getInfoByUserId(String userId);
    List<RDate> getInfoByNearlyBuy(int nearlyBuy);
}
