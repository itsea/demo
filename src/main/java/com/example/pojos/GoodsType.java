package com.example.pojos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 礼品类型
 */
@SuppressWarnings("serial")
public class GoodsType implements java.io.Serializable {
    /**主键Id**/
    private Integer id;
    /**类型名称**/
    private String name;
    /**父类型id**/
    private Integer parentId;
    /**该类型对应的图片**/
    private String pic;
    /**用于排序**/
    private Integer orderNum;
    // 图片对应的uuid名称
    private String picUuid;
    /**子类型**/
    private Set<GoodsType> subTypes;
    /**关联Gift对象**/
    private List<Goods> giftList = new ArrayList<Goods>();
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Set<GoodsType> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(Set<GoodsType> subTypes) {
        this.subTypes = subTypes;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getPicUuid() {
        return picUuid;
    }
    public void setPicUuid(String picUuid) {
        this.picUuid = picUuid;
    }
    public List<Goods> getGiftList() {
        return giftList;
    }
    public void setGiftList(List<Goods> giftList) {
        this.giftList = giftList;
    }
}

