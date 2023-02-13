package cn.edu.guet.datasetanalysis.bean;

import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: RFM.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月13日 14:20:00
 */
public class RFM {
    private String userId;
    private int nearlyBuy;
    private int buyTimes;
    private int F;
    private String userClassification;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getNearlyBuy() {
        return nearlyBuy;
    }

    public void setNearlyBuy(int nearlyBuy) {
        this.nearlyBuy = nearlyBuy;
    }

    public int getBuyTimes() {
        return buyTimes;
    }

    public void setBuyTimes(int buyTimes) {
        this.buyTimes = buyTimes;
    }

    public int getF() {
        return F;
    }

    public void setF(int f) {
        F = f;
    }

    public String getUserClassification() {
        return userClassification;
    }

    public void setUserClassification(String userClassification) {
        this.userClassification = userClassification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RFM rfm = (RFM) o;
        return nearlyBuy == rfm.nearlyBuy && buyTimes == rfm.buyTimes && F == rfm.F && Objects.equals(userId, rfm.userId) && Objects.equals(userClassification, rfm.userClassification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, nearlyBuy, buyTimes, F, userClassification);
    }

    @Override
    public String toString() {
        return "RFM{" +
                "userId='" + userId + '\'' +
                ", nearlyBuy=" + nearlyBuy +
                ", buyTimes=" + buyTimes +
                ", F=" + F +
                ", userClassification='" + userClassification + '\'' +
                '}';
    }
}
