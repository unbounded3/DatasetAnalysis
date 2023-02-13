package cn.edu.guet.datasetanalysis.service.impl;

import cn.edu.guet.datasetanalysis.mapper.RFMMapper;
import cn.edu.guet.datasetanalysis.mapper.UserActionMapper;
import cn.edu.guet.datasetanalysis.service.RFMService;
import cn.edu.guet.datasetanalysis.service.UserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.service.impl
 * @ClassName: FuGouServiceImpl.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:48:00
 */
@Service
public class UserActionServiceImpl implements UserActionService {

    @Autowired
    private UserActionMapper userActionMapper;


    @Override
    public long countUserBehavior() {
        return userActionMapper.countUserBehavior();
    }

    @Override
    public long countClickAndBuy() {
        return userActionMapper.countClickAndBuy();
    }

    @Override
    public long countClickAdditionalAndBuy() {
        return userActionMapper.countClickAdditionalAndBuy();
    }

    @Override
    public long countClickCollectionAndBuy() {
        return userActionMapper.countClickCollectionAndBuy();
    }

    @Override
    public long countClickAdditionalCollectionAndBuy() {
        return userActionMapper.countClickAdditionalCollectionAndBuy();
    }

    @Override
    public long countLoss() {
        return userActionMapper.countLoss();
    }
}
