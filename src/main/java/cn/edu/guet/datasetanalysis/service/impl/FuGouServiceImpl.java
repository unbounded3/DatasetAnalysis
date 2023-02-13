package cn.edu.guet.datasetanalysis.service.impl;

import cn.edu.guet.datasetanalysis.bean.FuGou;
import cn.edu.guet.datasetanalysis.mapper.FuGouMapper;
import cn.edu.guet.datasetanalysis.service.FuGouService;
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
public class FuGouServiceImpl implements FuGouService {

    @Autowired
    private FuGouMapper fuGouMapper;

    @Override
    public List<FuGou> getAllUserBuyTimes() {
        return fuGouMapper.getAllUserBuyTimes();
    }

    @Override
    public List<Map<String,String>> getConsumptionFrequency() {
        return fuGouMapper.getConsumptionFrequency();
    }

    @Override
    public List<Map<String, String>> getConsumptionFrequencyByUserId(String UserId) {
        return fuGouMapper.getConsumptionFrequencyByUserId(UserId);
    }
}
