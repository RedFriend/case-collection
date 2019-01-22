package cn.com.taiji.collection.entity;

import javax.persistence.*;

@Table(name = "common.t_ggk_china_district")
public class District extends BaseEntity {
    /**
     * 行政区划代码
     */
    @Id
    private String id;

    /**
     * 行政区划名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 上级行政区划ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 上级行政区划名称
     */
    @Column(name = "parent_city_name")
    private String parentCityName;

    /**
     * 排序号
     */
    @Column(name = "index_no")
    private Integer indexNo;

    /**
     *  城市级别，0国家、1省、2市、3区县、4乡镇
     */
    private Integer level;

    /**
     * 是否启用，0启用，1停用
     */
    @Column(name = "is_stop")
    private Integer isStop;

    /**
     * 获取行政区划代码
     *
     * @return id - 行政区划代码
     */
    public String getId() {
        return id;
    }

    /**
     * 设置行政区划代码
     *
     * @param id 行政区划代码
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取行政区划名称
     *
     * @return city_name - 行政区划名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置行政区划名称
     *
     * @param cityName 行政区划名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 获取上级行政区划ID
     *
     * @return parent_id - 上级行政区划ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置上级行政区划ID
     *
     * @param parentId 上级行政区划ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取上级行政区划名称
     *
     * @return parent_city_name - 上级行政区划名称
     */
    public String getParentCityName() {
        return parentCityName;
    }

    /**
     * 设置上级行政区划名称
     *
     * @param parentCityName 上级行政区划名称
     */
    public void setParentCityName(String parentCityName) {
        this.parentCityName = parentCityName == null ? null : parentCityName.trim();
    }

    /**
     * 获取排序号
     *
     * @return index_no - 排序号
     */
    public Integer getIndexNo() {
        return indexNo;
    }

    /**
     * 设置排序号
     *
     * @param indexNo 排序号
     */
    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    /**
     * 获取 城市级别，0国家、1省、2市、3区县、4乡镇
     *
     * @return level -  城市级别，0国家、1省、2市、3区县、4乡镇
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 城市级别，0国家、1省、2市、3区县、4乡镇
     *
     * @param level  城市级别，0国家、1省、2市、3区县、4乡镇
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取是否启用，0启用，1停用
     *
     * @return is_stop - 是否启用，0启用，1停用
     */
    public Integer getIsStop() {
        return isStop;
    }

    /**
     * 设置是否启用，0启用，1停用
     *
     * @param isStop 是否启用，0启用，1停用
     */
    public void setIsStop(Integer isStop) {
        this.isStop = isStop;
    }
}