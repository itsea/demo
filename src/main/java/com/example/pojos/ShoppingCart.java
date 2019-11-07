package com.example.pojos;

public class ShoppingCart {
    /**购物车Id**/
    private Integer id;
    /**用户Id**/
    private Integer userId;
    private User user;
    /**礼品Id**/
    private Integer giftId;
    private Goods gift;
    /**款式Id**/
    private Integer styleId;
    private GoodsStyle giftStyle;
    /**数量**/
    private Integer count;
    /**创建时间**/
    private String createTime;
    /**简介**/
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGift() {
        return gift;
    }

    public void setGift(Goods gift) {
        this.gift = gift;
    }

    public GoodsStyle getGiftStyle() {
        return giftStyle;
    }

    public void setGiftStyle(GoodsStyle giftStyle) {
        this.giftStyle = giftStyle;
    }

}

