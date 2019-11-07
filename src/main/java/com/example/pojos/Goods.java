package com.example.pojos;

import java.util.HashSet;
import java.util.Set;

/**
 * 礼品
 */
@SuppressWarnings("serial")
public class Goods implements java.io.Serializable{
    /** id **/
    private Integer id;
    /** 名称 **/
    private String name;
    /**图片**/
    private String pic;
    /**款式价格**/
    private Double price;
    /**折扣价格**/
    private Double discount;
    /**商品编号**/
    private String giftNo;
    /** 类型 **/
    private Integer typeId;
    private GoodsType giftType;
    /**赞的数量**/
    private Integer likes;
    /**销售数量**/
    private Integer sales;
    /**生产时间**/
    private String produceTime;
    /**介绍**/
    private String remark;
    /**删除标志0:正常 1:回收站**/
    private Integer deleted;
    /**创建时间**/
    private String createTime;
    /**创建人姓名**/
    private String creatorName;
    /**发布时间**/
    private String publishTime;
    /**发布者姓名**/
    private String publishName;
    /**下架时间**/
    private String downTime;
    /**下架人姓名**/
    private String downName;
    /**状态 0：编辑 1：上架 2：下架 **/
    private Integer status;
    /** 款式集合 **/
    private Set<GoodsStyle> styles = new HashSet<GoodsStyle>();
    /* 用于标示与用户相关的标志位  */
    private boolean liked;
    private boolean collected;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTypeId() {
        return typeId;
    }
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Integer getSales() {
        return sales;
    }
    public void setSales(Integer sales) {
        this.sales = sales;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getGiftNo() {
        return giftNo;
    }
    public void setGiftNo(String giftNo) {
        this.giftNo = giftNo;
    }
    public String getPublishTime() {
        return publishTime;
    }
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
    public String getProduceTime() {
        return produceTime;
    }
    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreatorName() {
        return creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public String getPublishName() {
        return publishName;
    }
    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }
    public boolean isLiked() {
        return liked;
    }
    public void setLiked(boolean liked) {
        this.liked = liked;
    }
    public boolean isCollected() {
        return collected;
    }
    public void setCollected(boolean collected) {
        this.collected = collected;
    }
    public Integer getDeleted() {
        return deleted;
    }
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    public String getDownTime() {
        return downTime;
    }
    public void setDownTime(String downTime) {
        this.downTime = downTime;
    }
    public String getDownName() {
        return downName;
    }
    public void setDownName(String downName) {
        this.downName = downName;
    }

    public GoodsType getGiftType() {
        return giftType;
    }
    public void setGiftType(GoodsType giftType) {
        this.giftType = giftType;
    }
    public Set<GoodsStyle> getStyles() {
        return styles;
    }
    public void setStyles(Set<GoodsStyle> styles) {
        this.styles = styles;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}

