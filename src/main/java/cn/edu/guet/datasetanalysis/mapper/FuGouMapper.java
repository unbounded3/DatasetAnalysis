package cn.edu.guet.datasetanalysis.mapper;

import cn.edu.guet.datasetanalysis.bean.FuGou;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.mapper
 * @ClassName: FuGouMapper.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:33:00
 */
@Mapper
public interface FuGouMapper {
    List<FuGou> getAllUserBuyTimes();
    List<Map<String,String>> getConsumptionFrequency();
    List<Map<String,String>> getConsumptionFrequencyByUserId(String UserId);
}
