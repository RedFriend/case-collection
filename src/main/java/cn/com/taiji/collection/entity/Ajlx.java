package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "common.t_ggk_ajlx")
public class Ajlx extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 案件类别(t_ggk_ajlb表ajlb_key)
     */
    @Column(name = "ajlb_key")
    private String ajlbKey;

    /**
     * 案件类型
     */
    @Column(name = "ajlx_key")
    private String ajlxKey;

    /**
     * 案件类型名称
     */
    private String ajlxmc;

    /**
     * 案件类型代字
     */
    private String ajlxdz;

    /**
     * 案件类型父节点
     */
    @Column(name = "parent_ajlx_key")
    private String parentAjlxKey;

    /**
     * 顺序号
     */
    private Integer sxh;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否有效，0表示无效，1表示有效
     */
    private Integer flag;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取案件类别(t_ggk_ajlb表ajlb_key)
     *
     * @return ajlb_key - 案件类别(t_ggk_ajlb表ajlb_key)
     */
    public String getAjlbKey() {
        return ajlbKey;
    }

    /**
     * 设置案件类别(t_ggk_ajlb表ajlb_key)
     *
     * @param ajlbKey 案件类别(t_ggk_ajlb表ajlb_key)
     */
    public void setAjlbKey(String ajlbKey) {
        this.ajlbKey = ajlbKey == null ? null : ajlbKey.trim();
    }

    /**
     * 获取案件类型
     *
     * @return ajlx_key - 案件类型
     */
    public String getAjlxKey() {
        return ajlxKey;
    }

    /**
     * 设置案件类型
     *
     * @param ajlxKey 案件类型
     */
    public void setAjlxKey(String ajlxKey) {
        this.ajlxKey = ajlxKey == null ? null : ajlxKey.trim();
    }

    /**
     * 获取案件类型名称
     *
     * @return ajlxmc - 案件类型名称
     */
    public String getAjlxmc() {
        return ajlxmc;
    }

    /**
     * 设置案件类型名称
     *
     * @param ajlxmc 案件类型名称
     */
    public void setAjlxmc(String ajlxmc) {
        this.ajlxmc = ajlxmc == null ? null : ajlxmc.trim();
    }

    /**
     * 获取案件类型代字
     *
     * @return ajlxdz - 案件类型代字
     */
    public String getAjlxdz() {
        return ajlxdz;
    }

    /**
     * 设置案件类型代字
     *
     * @param ajlxdz 案件类型代字
     */
    public void setAjlxdz(String ajlxdz) {
        this.ajlxdz = ajlxdz == null ? null : ajlxdz.trim();
    }

    /**
     * 获取案件类型父节点
     *
     * @return parent_ajlx_key - 案件类型父节点
     */
    public String getParentAjlxKey() {
        return parentAjlxKey;
    }

    /**
     * 设置案件类型父节点
     *
     * @param parentAjlxKey 案件类型父节点
     */
    public void setParentAjlxKey(String parentAjlxKey) {
        this.parentAjlxKey = parentAjlxKey == null ? null : parentAjlxKey.trim();
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

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}