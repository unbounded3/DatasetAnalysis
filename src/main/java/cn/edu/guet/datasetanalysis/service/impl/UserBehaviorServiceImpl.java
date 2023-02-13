package cn.edu.guet.datasetanalysis.service.impl;

import cn.edu.guet.datasetanalysis.bean.UserBehavior;
import cn.edu.guet.datasetanalysis.mapper.UserBehaviorMapper;
import cn.edu.guet.datasetanalysis.service.UserBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.service.impl
 * @ClassName: UserBehaviorServiceImpl.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 19:25:00
 */
@Service
public class UserBehaviorServiceImpl implements UserBehaviorService {

    @Autowired
    private UserBehaviorMapper userBehaviorMapper;

    @Override
    public List<UserBehavior> getAllInfo() {
        return userBehaviorMapper.getAllInfo();
    }

    @Override
    public List<UserBehavior> getInfoByUserId(String userId) {
        return userBehaviorMapper.getInfoByUserId(userId);
    }

    @Override
    public List<UserBehavior> getInfoByItemId(String itemId) {
        return userBehaviorMapper.getInfoByItemId(itemId);
    }

    @Override
    public List<UserBehavior> getInfoByItemCategory(String itemCategory) {
        return userBehaviorMapper.getInfoByItemCategory(itemCategory);
    }

    @Override
    public List<UserBehavior> getInfoByBehaviorType(String behaviorType) {
        return userBehaviorMapper.getInfoByBehaviorType(behaviorType);
    }

    @Override
    public List<UserBehavior> getInfoByDateTime(String dateTime) {
        return userBehaviorMapper.getInfoByDateTime(dateTime);
    }

    @Override
    public List<UserBehavior> getInfoByDate(String date) {
        return userBehaviorMapper.getInfoByDate(date);
    }
}
