package cn.edu.guet.datasetanalysis.mapper;

import cn.edu.guet.datasetanalysis.bean.UserBehavior;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.mapper
 * @ClassName: UserBehaviorMapper.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 18:29:00
 */
@Mapper
public interface UserBehaviorMapper {
    List<UserBehavior> getAllInfo();
    List<UserBehavior> getInfoByUserId(String userId);
    List<UserBehavior> getInfoByItemId(String itemId);
    List<UserBehavior> getInfoByItemCategory(String itemCategory);
    List<UserBehavior> getInfoByBehaviorType(String behaviorType);
    List<UserBehavior> getInfoByDateTime(String dateTime);
    List<UserBehavior> getInfoByDate(String date);
    List<Map<String,String>> getUserActiveTime();
    List<Map<String,String>> getUserBehaviorHabit();
    List<Map<String,String>> countUserActive();
    List<Map<String,String>> countVisitorsWithVariousBehaviors();
    List<Map<String,String>> getTopTenPurchase();
    List<Map<String,String>> getTopTenHits();
    List<Map<String,String>> countBuyTimesOfGoods();

}
