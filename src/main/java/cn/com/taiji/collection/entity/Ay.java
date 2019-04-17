package cn.com.taiji.collection.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "common.t_ggk_ay")
public class Ay extends BaseEntity {
    private static final long serialVersionUID =1838992440228475771L;
    @Id
    private Integer id;

    /**
     * 案件类别
     */
    @Column(name = "ajlb_key")
    private String ajlbKey;

    /**
     * 代码
     */
    @Column(name = "ay_dm")
    private String ayDm;

    /**
     * 上级代码
     */
    @Column(name = "ay_sjdm")
    private String aySjdm;

    /**
     * 分级码
     */
    @Column(name = "ay_fjm")
    private String ayFjm;

    /**
     * 名称
     */
    @Column(name = "ay_mc")
    private String ayMc;

    /**
     * 说明
     */
    @Column(name = "ay_sm")
    private String aySm;

    /**
     * 备用（verchar）字段1
     */
    @Column(name = "ay_vc_param1")
    private String ayVcParam1;

    /**
     * 备用（verchar）字段2
     */
    @Column(name = "ay_vc_params2")
    private String ayVcParams2;

    /**
     * 备用（timestamp）字段1
     */
    @Column(name = "ay_tm_param1")
    private Date ayTmParam1;

    /**
     * 备用（timestamp）字段
     */
    @Column(name = "ay_tm_param2")
    private Date ayTmParam2;

    /**
     * 顺序号，排序时使用
     */
    private Integer sxh;

    /**
     * 版本号
     */
    private String version;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 是否有效，0表示无效，1表示有效
     */
    private Integer flag;

    @Transient
    @JsonProperty(value = "children")
    private List<Ay> chirldAy;

    public List<Ay> getChirldAy() {
        return chirldAy;
    }

    public void setChirldAy(List<Ay> chirldAy) {
        this.chirldAy = chirldAy;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取案件类别
     *
     * @return ajlb_key - 案件类别
     */
    public String getAjlbKey() {
        return ajlbKey;
    }

    /**
     * 设置案件类别
     *
     * @param ajlbKey 案件类别
     */
    public void setAjlbKey(String ajlbKey) {
        this.ajlbKey = ajlbKey == null ? null : ajlbKey.trim();
    }

    /**
     * 获取代码
     *
     * @return ay_dm - 代码
     */
    public String getAyDm() {
        return ayDm;
    }

    /**
     * 设置代码
     *
     * @param ayDm 代码
     */
    public void setAyDm(String ayDm) {
        this.ayDm = ayDm == null ? null : ayDm.trim();
    }

    /**
     * 获取上级代码
     *
     * @return ay_sjdm - 上级代码
     */
    public String getAySjdm() {
        return aySjdm;
    }

    /**
     * 设置上级代码
     *
     * @param aySjdm 上级代码
     */
    public void setAySjdm(String aySjdm) {
        this.aySjdm = aySjdm == null ? null : aySjdm.trim();
    }

    /**
     * 获取分级码
     *
     * @return ay_fjm - 分级码
     */
    public String getAyFjm() {
        return ayFjm;
    }

    /**
     * 设置分级码
     *
     * @param ayFjm 分级码
     */
    public void setAyFjm(String ayFjm) {
        this.ayFjm = ayFjm == null ? null : ayFjm.trim();
    }

    /**
     * 获取名称
     *
     * @return ay_mc - 名称
     */
    public String getAyMc() {
        return ayMc;
    }

    /**
     * 设置名称
     *
     * @param ayMc 名称
     */
    public void setAyMc(String ayMc) {
        this.ayMc = ayMc == null ? null : ayMc.trim();
    }

    /**
     * 获取说明
     *
     * @return ay_sm - 说明
     */
    public String getAySm() {
        return aySm;
    }

    /**
     * 设置说明
     *
     * @param aySm 说明
     */
    public void setAySm(String aySm) {
        this.aySm = aySm == null ? null : aySm.trim();
    }

    /**
     * 获取备用（verchar）字段1
     *
     * @return ay_vc_param1 - 备用（verchar）字段1
     */
    public String getAyVcParam1() {
        return ayVcParam1;
    }

    /**
     * 设置备用（verchar）字段1
     *
     * @param ayVcParam1 备用（verchar）字段1
     */
    public void setAyVcParam1(String ayVcParam1) {
        this.ayVcParam1 = ayVcParam1 == null ? null : ayVcParam1.trim();
    }

    /**
     * 获取备用（verchar）字段2
     *
     * @return ay_vc_params2 - 备用（verchar）字段2
     */
    public String getAyVcParams2() {
        return ayVcParams2;
    }

    /**
     * 设置备用（verchar）字段2
     *
     * @param ayVcParams2 备用（verchar）字段2
     */
    public void setAyVcParams2(String ayVcParams2) {
        this.ayVcParams2 = ayVcParams2 == null ? null : ayVcParams2.trim();
    }

    /**
     * 获取备用（timestamp）字段1
     *
     * @return ay_tm_param1 - 备用（timestamp）字段1
     */
    public Date getAyTmParam1() {
        return ayTmParam1;
    }

    /**
     * 设置备用（timestamp）字段1
     *
     * @param ayTmParam1 备用（timestamp）字段1
     */
    public void setAyTmParam1(Date ayTmParam1) {
        this.ayTmParam1 = ayTmParam1;
    }

    /**
     * 获取备用（timestamp）字段
     *
     * @return ay_tm_param2 - 备用（timestamp）字段
     */
    public Date getAyTmParam2() {
        return ayTmParam2;
    }

    /**
     * 设置备用（timestamp）字段
     *
     * @param ayTmParam2 备用（timestamp）字段
     */
    public void setAyTmParam2(Date ayTmParam2) {
        this.ayTmParam2 = ayTmParam2;
    }

    /**
     * 获取顺序号，排序时使用
     *
     * @return sxh - 顺序号，排序时使用
     */
    public Integer getSxh() {
        return sxh;
    }

    /**
     * 设置顺序号，排序时使用
     *
     * @param sxh 顺序号，排序时使用
     */
    public void setSxh(Integer sxh) {
        this.sxh = sxh;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取是否有效，0表示无效，1表示有效
     *
     * @return flag - 是否有效，0表示无效，1表示有效
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否有效，0表示无效，1表示有效
     *
     * @param flag 是否有效，0表示无效，1表示有效
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}