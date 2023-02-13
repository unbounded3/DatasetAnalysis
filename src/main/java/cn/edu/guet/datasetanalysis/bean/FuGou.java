package cn.edu.guet.datasetanalysis.bean;

import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: FuGou.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:22:00
 */
public class FuGou {
    private String userId;
    private String buyTimes;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyTimes() {
        return buyTimes;
    }

    public void setBuyTimes(String buyTimes) {
        this.buyTimes = buyTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuGou fuGou = (FuGou) o;
        return Objects.equals(userId, fuGou.userId) && Objects.equals(buyTimes, fuGou.buyTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, buyTimes);
    }

    @Override
    public String toString() {
        return "FuGou{" +
                "userId='" + userId + '\'' +
                ", buyTimes='" + buyTimes + '\'' +
                '}';
    }
}
