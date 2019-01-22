package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "common.t_ggk_dict")
public class Dict extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 类型值
     */
    @Column(name = "type_id")
    private String typeId;

    /**
     * 类型
     */
    private String type;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 值
     */
    private String value;

    /**
     * 上级类型
     */
    @Column(name = "parent_type_id")
    private String parentTypeId;

    /**
     * 排序号
     */
    @Column(name = "order_by")
    private Integer orderBy;

    /**
     * 所属系统(all共用，dzjz电子卷宗，yyzx鹰眼)
     */
    private String ssxt;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 是否有效，0表示无效，1表示有效
     */
    private Integer flag;

    /**
     * 版本号
     */
    private String version;

    /**
     * 创建者
     */
    @Column(name = "create_id")
    private String createId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 最后修改者
     */
    @Column(name = "update_id")
    private String updateId;

    /**
     * 最后修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 备用字段1
     */
    private String column1;

    /**
     * 备用字段2
     */
    private String column2;

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
     * 获取类型值
     *
     * @return type_id - 类型值
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设置类型值
     *
     * @param typeId 类型值
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取值
     *
     * @return value - 值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置值
     *
     * @param value 值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 获取上级类型
     *
     * @return parent_type_id - 上级类型
     */
    public String getParentTypeId() {
        return parentTypeId;
    }

    /**
     * 设置上级类型
     *
     * @param parentTypeId 上级类型
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId == null ? null : parentTypeId.trim();
    }

    /**
     * 获取排序号
     *
     * @return order_by - 排序号
     */
    public Integer getOrderBy() {
        return orderBy;
    }

    /**
     * 设置排序号
     *
     * @param orderBy 排序号
     */
    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获取所属系统(all共用，dzjz电子卷宗，yyzx鹰眼)
     *
     * @return ssxt - 所属系统(all共用，dzjz电子卷宗，yyzx鹰眼)
     */
    public String getSsxt() {
        return ssxt;
    }

    /**
     * 设置所属系统(all共用，dzjz电子卷宗，yyzx鹰眼)
     *
     * @param ssxt 所属系统(all共用，dzjz电子卷宗，yyzx鹰眼)
     */
    public void setSsxt(String ssxt) {
        this.ssxt = ssxt == null ? null : ssxt.trim();
    }

    /**
     * 获取层级
     *
     * @return level - 层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置层级
     *
     * @param level 层级
     */
    public void setLevel(Integer level) {
        this.level = level;
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
     * 获取创建者
     *
     * @return create_id - 创建者
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * 设置创建者
     *
     * @param createId 创建者
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取最后修改者
     *
     * @return update_id - 最后修改者
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * 设置最后修改者
     *
     * @param updateId 最后修改者
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    /**
     * 获取最后修改时间
     *
     * @return update_date - 最后修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param updateDate 最后修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取备用字段1
     *
     * @return column1 - 备用字段1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * 设置备用字段1
     *
     * @param column1 备用字段1
     */
    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    /**
     * 获取备用字段2
     *
     * @return column2 - 备用字段2
     */
    public String getColumn2() {
        return column2;
    }

    /**
     * 设置备用字段2
     *
     * @param column2 备用字段2
     */
    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }
}