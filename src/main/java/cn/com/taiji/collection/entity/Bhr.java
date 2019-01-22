package cn.com.taiji.collection.entity;

import javax.persistence.*;

@Table(name = "t_jck_bhr")
public class Bhr extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 综合业务系统里代理人表的id
     */
    private String bhrid;

    /**
     * 案件ID
     */
    private String ajid;

    /**
     * 综合业务系统里当事人表的id
     */
    private String dsrid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 代理人类型ID
     */
    private String lx;

    /**
     * 单位 
     */
    private String dw;

    /**
     * 职务
     */
    private String zw;

    /**
     * 身份
     */
    private String sf;

    /**
     * 证件总类
     */
    private String zjzl;

    /**
     * 证件号码
     */
    private String zjhm;

    /**
     * 联系方法
     */
    private String lxff;

    /**
     * 流水号
     */
    private String code;

    /**
     * 材料编号
     */
    private String clbh;

    /**
     * 材料状态
     */
    private String clzt;

    /**
     * 创建日期
     */
    private String cjrq;

    /**
     * 核对人
     */
    private String hdr;

    /**
     * 核对时间
     */
    private String hdsj;

    /**
     * 分级码：
     */
    private String fjm;

    /**
     * 当事人ID:FK当事人表ID
     */
    @Column(name = "dsr_id")
    private Integer dsrId;

    /**
     * 身份证号码
     */
    private String sfzhm;

    /**
     * 数据来源
     */
    private String source;

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
     * 获取综合业务系统里代理人表的id
     *
     * @return bhrid - 综合业务系统里代理人表的id
     */
    public String getBhrid() {
        return bhrid;
    }

    /**
     * 设置综合业务系统里代理人表的id
     *
     * @param bhrid 综合业务系统里代理人表的id
     */
    public void setBhrid(String bhrid) {
        this.bhrid = bhrid == null ? null : bhrid.trim();
    }

    /**
     * 获取案件ID
     *
     * @return ajid - 案件ID
     */
    public String getAjid() {
        return ajid;
    }

    /**
     * 设置案件ID
     *
     * @param ajid 案件ID
     */
    public void setAjid(String ajid) {
        this.ajid = ajid == null ? null : ajid.trim();
    }

    /**
     * 获取综合业务系统里当事人表的id
     *
     * @return dsrid - 综合业务系统里当事人表的id
     */
    public String getDsrid() {
        return dsrid;
    }

    /**
     * 设置综合业务系统里当事人表的id
     *
     * @param dsrid 综合业务系统里当事人表的id
     */
    public void setDsrid(String dsrid) {
        this.dsrid = dsrid == null ? null : dsrid.trim();
    }

    /**
     * 获取姓名
     *
     * @return xm - 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 设置姓名
     *
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 获取代理人类型ID
     *
     * @return lx - 代理人类型ID
     */
    public String getLx() {
        return lx;
    }

    /**
     * 设置代理人类型ID
     *
     * @param lx 代理人类型ID
     */
    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }

    /**
     * 获取单位 
     *
     * @return dw - 单位 
     */
    public String getDw() {
        return dw;
    }

    /**
     * 设置单位 
     *
     * @param dw 单位 
     */
    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
    }

    /**
     * 获取职务
     *
     * @return zw - 职务
     */
    public String getZw() {
        return zw;
    }

    /**
     * 设置职务
     *
     * @param zw 职务
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    /**
     * 获取身份
     *
     * @return sf - 身份
     */
    public String getSf() {
        return sf;
    }

    /**
     * 设置身份
     *
     * @param sf 身份
     */
    public void setSf(String sf) {
        this.sf = sf == null ? null : sf.trim();
    }

    /**
     * 获取证件总类
     *
     * @return zjzl - 证件总类
     */
    public String getZjzl() {
        return zjzl;
    }

    /**
     * 设置证件总类
     *
     * @param zjzl 证件总类
     */
    public void setZjzl(String zjzl) {
        this.zjzl = zjzl == null ? null : zjzl.trim();
    }

    /**
     * 获取证件号码
     *
     * @return zjhm - 证件号码
     */
    public String getZjhm() {
        return zjhm;
    }

    /**
     * 设置证件号码
     *
     * @param zjhm 证件号码
     */
    public void setZjhm(String zjhm) {
        this.zjhm = zjhm == null ? null : zjhm.trim();
    }

    /**
     * 获取联系方法
     *
     * @return lxff - 联系方法
     */
    public String getLxff() {
        return lxff;
    }

    /**
     * 设置联系方法
     *
     * @param lxff 联系方法
     */
    public void setLxff(String lxff) {
        this.lxff = lxff == null ? null : lxff.trim();
    }

    /**
     * 获取流水号
     *
     * @return code - 流水号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置流水号
     *
     * @param code 流水号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取材料编号
     *
     * @return clbh - 材料编号
     */
    public String getClbh() {
        return clbh;
    }

    /**
     * 设置材料编号
     *
     * @param clbh 材料编号
     */
    public void setClbh(String clbh) {
        this.clbh = clbh == null ? null : clbh.trim();
    }

    /**
     * 获取材料状态
     *
     * @return clzt - 材料状态
     */
    public String getClzt() {
        return clzt;
    }

    /**
     * 设置材料状态
     *
     * @param clzt 材料状态
     */
    public void setClzt(String clzt) {
        this.clzt = clzt == null ? null : clzt.trim();
    }

    /**
     * 获取创建日期
     *
     * @return cjrq - 创建日期
     */
    public String getCjrq() {
        return cjrq;
    }

    /**
     * 设置创建日期
     *
     * @param cjrq 创建日期
     */
    public void setCjrq(String cjrq) {
        this.cjrq = cjrq == null ? null : cjrq.trim();
    }

    /**
     * 获取核对人
     *
     * @return hdr - 核对人
     */
    public String getHdr() {
        return hdr;
    }

    /**
     * 设置核对人
     *
     * @param hdr 核对人
     */
    public void setHdr(String hdr) {
        this.hdr = hdr == null ? null : hdr.trim();
    }

    /**
     * 获取核对时间
     *
     * @return hdsj - 核对时间
     */
    public String getHdsj() {
        return hdsj;
    }

    /**
     * 设置核对时间
     *
     * @param hdsj 核对时间
     */
    public void setHdsj(String hdsj) {
        this.hdsj = hdsj == null ? null : hdsj.trim();
    }

    /**
     * 获取分级码：
     *
     * @return fjm - 分级码：
     */
    public String getFjm() {
        return fjm;
    }

    /**
     * 设置分级码：
     *
     * @param fjm 分级码：
     */
    public void setFjm(String fjm) {
        this.fjm = fjm == null ? null : fjm.trim();
    }

    /**
     * 获取当事人ID:FK当事人表ID
     *
     * @return dsr_id - 当事人ID:FK当事人表ID
     */
    public Integer getDsrId() {
        return dsrId;
    }

    /**
     * 设置当事人ID:FK当事人表ID
     *
     * @param dsrId 当事人ID:FK当事人表ID
     */
    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
    }

    /**
     * 获取身份证号码
     *
     * @return sfzhm - 身份证号码
     */
    public String getSfzhm() {
        return sfzhm;
    }

    /**
     * 设置身份证号码
     *
     * @param sfzhm 身份证号码
     */
    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm == null ? null : sfzhm.trim();
    }

    /**
     * 获取数据来源
     *
     * @return source - 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源
     *
     * @param source 数据来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}