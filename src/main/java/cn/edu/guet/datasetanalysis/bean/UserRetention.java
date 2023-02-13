package cn.edu.guet.datasetanalysis.bean;

import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: UserRetention.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月13日 15:41:00
 */
public class UserRetention {
    private long firstDay;
    private long secondDay;
    private long thirdDay;
    private long fifthDay;
    private long sevenDay;

    public long getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(long firstDay) {
        this.firstDay = firstDay;
    }

    public long getSecondDay() {
        return secondDay;
    }

    public void setSecondDay(long secondDay) {
        this.secondDay = secondDay;
    }

    public long getThirdDay() {
        return thirdDay;
    }

    public void setThirdDay(long thirdDay) {
        this.thirdDay = thirdDay;
    }

    public long getFifthDay() {
        return fifthDay;
    }

    public void setFifthDay(long fifthDay) {
        this.fifthDay = fifthDay;
    }

    public long getSevenDay() {
        return sevenDay;
    }

    public void setSevenDay(long sevenDay) {
        this.sevenDay = sevenDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRetention that = (UserRetention) o;
        return firstDay == that.firstDay && secondDay == that.secondDay && thirdDay == that.thirdDay && fifthDay == that.fifthDay && sevenDay == that.sevenDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstDay, secondDay, thirdDay, fifthDay, sevenDay);
    }

    @Override
    public String toString() {
        return "UserRetention{" +
                "firstDay=" + firstDay +
                ", secondDay=" + secondDay +
                ", thirdDay=" + thirdDay +
                ", fifthDay=" + fifthDay +
                ", sevenDay=" + sevenDay +
                '}';
    }
}
