package cn.edu.guet.datasetanalysis.bean;

import java.util.Date;
import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: UserBehavior.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 18:22:00
 */
public class UserBehavior {
    private String user_id;
    private String item_id;
    private String item_category;
    private String behavior_type;
    private String time_stamp;
    private Date datetime;
    private String date;
    private String time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_category() {
        return item_category;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public String getBehavior_type() {
        return behavior_type;
    }

    public void setBehavior_type(String behavior_type) {
        this.behavior_type = behavior_type;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBehavior that = (UserBehavior) o;
        return Objects.equals(user_id, that.user_id) && Objects.equals(item_id, that.item_id) && Objects.equals(item_category, that.item_category) && Objects.equals(behavior_type, that.behavior_type) && Objects.equals(time_stamp, that.time_stamp) && Objects.equals(datetime, that.datetime) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, item_id, item_category, behavior_type, time_stamp, datetime, date, time);
    }

    @Override
    public String toString() {
        return "UserBehavior{" +
                "user_id='" + user_id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", item_category='" + item_category + '\'' +
                ", behavior_type='" + behavior_type + '\'' +
                ", time_stamp='" + time_stamp + '\'' +
                ", datetime=" + datetime +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
