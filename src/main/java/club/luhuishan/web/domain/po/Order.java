package club.luhuishan.web.domain.po;

import java.util.Date;

/**
 * Created by vilens on 2018/6/13.
 */
public class Order {
    private Long id;
    private Long productId;
    private Long userId;
    private Long receivingAddressId;
    private Integer purchaseStatus;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReceivingAddressId() {
        return receivingAddressId;
    }

    public void setReceivingAddressId(Long receivingAddressId) {
        this.receivingAddressId = receivingAddressId;
    }

    public Integer getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Integer purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
