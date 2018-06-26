package club.luhuishan.web.domain.po;

import java.util.Date;

/**
 * Created by vilens on 2018/6/13.
 */
public class User {
    private Long id;
    private String username;
    private String mobile;
    private String wxOpenid;
    private String wxAccessToken;
    private String wxNickname;
    private Integer wxSex;
    private Integer wxCity;
    private Integer wxProvince;
    private Integer wxCountry;
    private Integer wxHeadimgurl;
    private Integer wxPrivilege;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public String getWxAccessToken() {
        return wxAccessToken;
    }

    public void setWxAccessToken(String wxAccessToken) {
        this.wxAccessToken = wxAccessToken;
    }

    public String getWxNickname() {
        return wxNickname;
    }

    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname;
    }

    public Integer getWxSex() {
        return wxSex;
    }

    public void setWxSex(Integer wxSex) {
        this.wxSex = wxSex;
    }

    public Integer getWxCity() {
        return wxCity;
    }

    public void setWxCity(Integer wxCity) {
        this.wxCity = wxCity;
    }

    public Integer getWxProvince() {
        return wxProvince;
    }

    public void setWxProvince(Integer wxProvince) {
        this.wxProvince = wxProvince;
    }

    public Integer getWxCountry() {
        return wxCountry;
    }

    public void setWxCountry(Integer wxCountry) {
        this.wxCountry = wxCountry;
    }

    public Integer getWxHeadimgurl() {
        return wxHeadimgurl;
    }

    public void setWxHeadimgurl(Integer wxHeadimgurl) {
        this.wxHeadimgurl = wxHeadimgurl;
    }

    public Integer getWxPrivilege() {
        return wxPrivilege;
    }

    public void setWxPrivilege(Integer wxPrivilege) {
        this.wxPrivilege = wxPrivilege;
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
