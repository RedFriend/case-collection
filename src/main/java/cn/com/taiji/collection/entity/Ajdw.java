package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_ggk_ajdw")
public class Ajdw extends BaseEntity {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 有效标识
     */
    @Column(name = "enable_flag")
    private Integer enableFlag;

    /**
     * 案件类型代码
     */
    private String ajlx;

    /**
     * 案件类型名称
     */
    @Column(name = "ajlx_name")
    private String ajlxName;

    /**
     * 诉讼地位代码
     */
    private String ssdw;

    /**
     * 诉讼地位名称
     */
    @Column(name = "ssdw_name")
    private String ssdwName;

    /**
     * 转换成单一诉讼地位,即原告:1,被告:2,第三人:3
     */
    @Column(name = "convert_ssdw")
    private String convertSsdw;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
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
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取有效标识
     *
     * @return enable_flag - 有效标识
     */
    public Integer getEnableFlag() {
        return enableFlag;
    }

    /**
     * 设置有效标识
     *
     * @param enableFlag 有效标识
     */
    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    /**
     * 获取案件类型代码
     *
     * @return ajlx - 案件类型代码
     */
    public String getAjlx() {
        return ajlx;
    }

    /**
     * 设置案件类型代码
     *
     * @param ajlx 案件类型代码
     */
    public void setAjlx(String ajlx) {
        this.ajlx = ajlx == null ? null : ajlx.trim();
    }

    /**
     * 获取案件类型名称
     *
     * @return ajlx_name - 案件类型名称
     */
    public String getAjlxName() {
        return ajlxName;
    }

    /**
     * 设置案件类型名称
     *
     * @param ajlxName 案件类型名称
     */
    public void setAjlxName(String ajlxName) {
        this.ajlxName = ajlxName == null ? null : ajlxName.trim();
    }

    /**
     * 获取诉讼地位代码
     *
     * @return ssdw - 诉讼地位代码
     */
    public String getSsdw() {
        return ssdw;
    }

    /**
     * 设置诉讼地位代码
     *
     * @param ssdw 诉讼地位代码
     */
    public void setSsdw(String ssdw) {
        this.ssdw = ssdw == null ? null : ssdw.trim();
    }

    /**
     * 获取诉讼地位名称
     *
     * @return ssdw_name - 诉讼地位名称
     */
    public String getSsdwName() {
        return ssdwName;
    }

    /**
     * 设置诉讼地位名称
     *
     * @param ssdwName 诉讼地位名称
     */
    public void setSsdwName(String ssdwName) {
        this.ssdwName = ssdwName == null ? null : ssdwName.trim();
    }

    /**
     * 获取转换成单一诉讼地位,即原告:1,被告:2,第三人:3
     *
     * @return convert_ssdw - 转换成单一诉讼地位,即原告:1,被告:2,第三人:3
     */
    public String getConvertSsdw() {
        return convertSsdw;
    }

    /**
     * 设置转换成单一诉讼地位,即原告:1,被告:2,第三人:3
     *
     * @param convertSsdw 转换成单一诉讼地位,即原告:1,被告:2,第三人:3
     */
    public void setConvertSsdw(String convertSsdw) {
        this.convertSsdw = convertSsdw == null ? null : convertSsdw.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}