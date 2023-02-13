package cn.edu.guet.datasetanalysis.bean;

import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: RDate.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:24:00
 */
public class RDate {
    private String userId;
    private String nearlyBuy;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNearlyBuy() {
        return nearlyBuy;
    }

    public void setNearlyBuy(String nearlyBuy) {
        this.nearlyBuy = nearlyBuy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RDate rDate = (RDate) o;
        return Objects.equals(userId, rDate.userId) && Objects.equals(nearlyBuy, rDate.nearlyBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, nearlyBuy);
    }

    @Override
    public String toString() {
        return "RDate{" +
                "userId='" + userId + '\'' +
                ", nearlyBuy='" + nearlyBuy + '\'' +
                '}';
    }
}
