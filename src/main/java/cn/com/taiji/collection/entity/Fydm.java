package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "common.t_ggk_fydm")
public class Fydm extends BaseEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "fy_id")
    private Integer fyId;

    /**
     * 法院代码
     */
    @Column(name = "fy_fydm")
    private String fyFydm;

    /**
     * 法院分级码
     */
    @Column(name = "fy_fjm")
    private String fyFjm;

    /**
     * 法院父级代码
     */
    @Column(name = "fy_p_fydm")
    private String fyPFydm;

    /**
     * 父级法院分级码
     */
    @Column(name = "fy_p_fjm")
    private String fyPFjm;

    /**
     * 法院名称
     */
    @Column(name = "fy_fymc")
    private String fyFymc;

    /**
     * 法院代字
     */
    @Column(name = "fy_fydz")
    private String fyFydz;

    /**
     * 区划简称
     */
    @Column(name = "fy_qhjc")
    private String fyQhjc;

    /**
     * 法院简称
     */
    @Column(name = "fy_fyjc")
    private String fyFyjc;

    /**
     * 顺序号
     */
    private Integer sxh;

    /**
     * 版本号
     */
    private Integer version;

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

    /**
     * 获取主键
     *
     * @return fy_id - 主键
     */
    public Integer getFyId() {
        return fyId;
    }

    /**
     * 设置主键
     *
     * @param fyId 主键
     */
    public void setFyId(Integer fyId) {
        this.fyId = fyId;
    }

    /**
     * 获取法院代码
     *
     * @return fy_fydm - 法院代码
     */
    public String getFyFydm() {
        return fyFydm;
    }

    /**
     * 设置法院代码
     *
     * @param fyFydm 法院代码
     */
    public void setFyFydm(String fyFydm) {
        this.fyFydm = fyFydm == null ? null : fyFydm.trim();
    }

    /**
     * 获取法院分级码
     *
     * @return fy_fjm - 法院分级码
     */
    public String getFyFjm() {
        return fyFjm;
    }

    /**
     * 设置法院分级码
     *
     * @param fyFjm 法院分级码
     */
    public void setFyFjm(String fyFjm) {
        this.fyFjm = fyFjm == null ? null : fyFjm.trim();
    }

    /**
     * 获取法院父级代码
     *
     * @return fy_p_fydm - 法院父级代码
     */
    public String getFyPFydm() {
        return fyPFydm;
    }

    /**
     * 设置法院父级代码
     *
     * @param fyPFydm 法院父级代码
     */
    public void setFyPFydm(String fyPFydm) {
        this.fyPFydm = fyPFydm == null ? null : fyPFydm.trim();
    }

    /**
     * 获取父级法院分级码
     *
     * @return fy_p_fjm - 父级法院分级码
     */
    public String getFyPFjm() {
        return fyPFjm;
    }

    /**
     * 设置父级法院分级码
     *
     * @param fyPFjm 父级法院分级码
     */
    public void setFyPFjm(String fyPFjm) {
        this.fyPFjm = fyPFjm == null ? null : fyPFjm.trim();
    }

    /**
     * 获取法院名称
     *
     * @return fy_fymc - 法院名称
     */
    public String getFyFymc() {
        return fyFymc;
    }

    /**
     * 设置法院名称
     *
     * @param fyFymc 法院名称
     */
    public void setFyFymc(String fyFymc) {
        this.fyFymc = fyFymc == null ? null : fyFymc.trim();
    }

    /**
     * 获取法院代字
     *
     * @return fy_fydz - 法院代字
     */
    public String getFyFydz() {
        return fyFydz;
    }

    /**
     * 设置法院代字
     *
     * @param fyFydz 法院代字
     */
    public void setFyFydz(String fyFydz) {
        this.fyFydz = fyFydz == null ? null : fyFydz.trim();
    }

    /**
     * 获取区划简称
     *
     * @return fy_qhjc - 区划简称
     */
    public String getFyQhjc() {
        return fyQhjc;
    }

    /**
     * 设置区划简称
     *
     * @param fyQhjc 区划简称
     */
    public void setFyQhjc(String fyQhjc) {
        this.fyQhjc = fyQhjc == null ? null : fyQhjc.trim();
    }

    /**
     * 获取法院简称
     *
     * @return fy_fyjc - 法院简称
     */
    public String getFyFyjc() {
        return fyFyjc;
    }

    /**
     * 设置法院简称
     *
     * @param fyFyjc 法院简称
     */
    public void setFyFyjc(String fyFyjc) {
        this.fyFyjc = fyFyjc == null ? null : fyFyjc.trim();
    }

    /**
     * 获取顺序号
     *
     * @return sxh - 顺序号
     */
    public Integer getSxh() {
        return sxh;
    }

    /**
     * 设置顺序号
     *
     * @param sxh 顺序号
     */
    public void setSxh(Integer sxh) {
        this.sxh = sxh;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
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