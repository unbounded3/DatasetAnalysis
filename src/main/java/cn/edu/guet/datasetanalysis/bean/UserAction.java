package cn.edu.guet.datasetanalysis.bean;

import java.util.Objects;

/**
 * @ProjectName: DatasetAnalysis
 * @PackageName: cn.edu.guet.datasetanalysis.bean
 * @ClassName: UserAction.java
 * @author: PangJiaEn
 * @version: 1.0.0
 * @createTime: 2023年02月12日 22:29:00
 */
public class UserAction {
    private String userId;
    private String itemId;
    private int click;
    private int collection;
    private int additionalBuy;
    private int buy;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getAdditionalBuy() {
        return additionalBuy;
    }

    public void setAdditionalBuy(int additionalBuy) {
        this.additionalBuy = additionalBuy;
    }

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAction that = (UserAction) o;
        return click == that.click && collection == that.collection && additionalBuy == that.additionalBuy && buy == that.buy && Objects.equals(userId, that.userId) && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, itemId, click, collection, additionalBuy, buy);
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "userId='" + userId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", click=" + click +
                ", collection=" + collection +
                ", additionalBuy=" + additionalBuy +
                ", buy=" + buy +
                '}';
    }
}
