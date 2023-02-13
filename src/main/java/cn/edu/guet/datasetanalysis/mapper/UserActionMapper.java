package cn.edu.guet.datasetanalysis.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.mapper
 * @ClassName: RDate.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 23:23:00
 */
@Mapper
public interface UserActionMapper {
    long countUserBehavior();
    long countClickAndBuy();
    long countClickAdditionalAndBuy();
    long countClickCollectionAndBuy();
    long countClickAdditionalCollectionAndBuy();
    long countLoss();
}
