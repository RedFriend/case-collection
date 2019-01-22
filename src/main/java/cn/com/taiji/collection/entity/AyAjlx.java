package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "common.t_ggk_ay_ajlx")
public class AyAjlx extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 案件类型编码
     */
    @Column(name = "ay_ajlx_key")
    private String ayAjlxKey;

    /**
     * 案件类型值
     */
    @Column(name = "ay_ajlx_value")
    private String ayAjlxValue;

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
     * 获取案件类型编码
     *
     * @return ay_ajlx_key - 案件类型编码
     */
    public String getAyAjlxKey() {
        return ayAjlxKey;
    }

    /**
     * 设置案件类型编码
     *
     * @param ayAjlxKey 案件类型编码
     */
    public void setAyAjlxKey(String ayAjlxKey) {
        this.ayAjlxKey = ayAjlxKey == null ? null : ayAjlxKey.trim();
    }

    /**
     * 获取案件类型值
     *
     * @return ay_ajlx_value - 案件类型值
     */
    public String getAyAjlxValue() {
        return ayAjlxValue;
    }

    /**
     * 设置案件类型值
     *
     * @param ayAjlxValue 案件类型值
     */
    public void setAyAjlxValue(String ayAjlxValue) {
        this.ayAjlxValue = ayAjlxValue == null ? null : ayAjlxValue.trim();
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