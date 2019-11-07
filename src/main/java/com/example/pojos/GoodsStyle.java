package com.example.pojos;


@SuppressWarnings("serial")
public class GoodsStyle implements java.io.Serializable {
/**主键Id**/
private Integer id;
/**对应Gift的Id**/
private Integer giftId;
/**所属Gift**/
private Goods gift;
/**款式名称**/
private String name;
/**款式价格**/
private Double price;
/**折扣价格**/
private Double discount;
/**款式对应图片1**/
private String pic1;
/**款式对应图片2**/
private String pic2;
/**款式对应图片3**/
private String pic3;
/**款式对应图片4**/
private String pic4;
/**款式对应图片5**/
private String pic5;
/**款式顺序**/
private Integer orderNum;
/**款式描述**/
private String remark;
/**
 * 临时字段，记录某用户的购买量，不记录到数据库
 */
private Integer orderCount;
private String orderRemark;

public Integer getId() {
        return id;
        }

public void setId(Integer id) {
        this.id = id;
        }

public Integer getGiftId() {
        return giftId;
        }

public void setGiftId(Integer giftId) {
        this.giftId = giftId;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public Double getPrice() {
        return price;
        }

public void setPrice(Double price) {
        this.price = price;
        }

public String getPic1() {
        return pic1;
        }

public void setPic1(String pic1) {
        this.pic1 = pic1;
        }

public String getPic2() {
        return pic2;
        }

public void setPic2(String pic2) {
        this.pic2 = pic2;
        }

public String getPic3() {
        return pic3;
        }

public void setPic3(String pic3) {
        this.pic3 = pic3;
        }

public String getPic4() {
        return pic4;
        }

public void setPic4(String pic4) {
        this.pic4 = pic4;
        }

public String getPic5() {
        return pic5;
        }

public void setPic5(String pic5) {
        this.pic5 = pic5;
        }

public Integer getOrderNum() {
        return orderNum;
        }

public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        }

public Integer getOrderCount() {
        // 设置默认值为1，如果为0，则表示用户不想购买
        if (orderCount == null)
        orderCount = 1;
        return orderCount;
        }

public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        }

public String getOrderRemark() {
        return orderRemark;
        }

public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
        }

public Goods getGift() {
        return gift;
        }

public void setGift(Goods gift) {
        this.gift = gift;
        }

public Double getDiscount() {
        if (discount == null)
        discount = 0d;
        return discount;
        }

public void setDiscount(Double discount) {
        this.discount = discount;
        }

public String getRemark() {
        return remark;
        }

public void setRemark(String remark) {
        this.remark = remark;
        }

        }
