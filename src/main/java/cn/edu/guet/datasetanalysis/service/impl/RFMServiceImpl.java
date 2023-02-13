package cn.edu.guet.datasetanalysis.service.impl;

import cn.edu.guet.datasetanalysis.mapper.RFMMapper;
import cn.edu.guet.datasetanalysis.service.RFMService;
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
public class RFMServiceImpl implements RFMService {

    @Autowired
    private RFMMapper RFMMapper;


    @Override
    public List<Map<String, String>> getUserNumGroupByUserType() {
        return RFMMapper.getUserNumGroupByUserType();
    }
}
