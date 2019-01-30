package cn.com.taiji.collection.entity;

import javax.persistence.*;

@Table(name = "t_jck_dsr")
public class Dsr extends BaseEntity {
    @Id
    @Column(name = "dsr_id")
    private Integer dsrId;

    /**
     * 流水号
     */
    private String code;

    /**
     * 材料编号：16人0表示智审回填数据，16个1表示同步综合业务系统数据
     */
    private String clbh;

    /**
     * 材料状态：
     */
    private String state;

    /**
     * 创建日期
     */
    @Column(name = "createDate")
    private String createdate;

    private Integer id1;

    /**
     * 综合业务系统里当事人表ID
     */
    @Column(name = "dsrid")
    private String dsrid;

    /**
     * 案件ID
     */
    private String ajid;

    /**
     * 诉讼地位
     */
    private String ssdw;

    /**
     * 当事人类型
     */
    private String dsrlx;

    /**
     * 当事人姓名
     */
    private String dsrmc;

    /**
     * 性别
     */
    private String xb;

    /**
     * 年龄
     */
    private String nl;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 民族
     */
    private String mz;

    /**
     * 出生日期
     */
    private String csrq;

    /**
     * 文化程度
     */
    private String whcd;

    /**
     * 户籍所在地
     */
    private String hjszd;

    /**
     * 政治面貌
     */
    private String zzmm;

    /**
     * 职务
     */
    private String zw;

    /**
     * 身份
     */
    private String sf;

    /**
     * 级别
     */
    private String jb;

    /**
     * 证件种类
     */
    private String zjzl;

    /**
     * 证件号码
     */
    private String zjhm;

    /**
     * 单位性质
     */
    private String dwxz;

    /**
     * 组织机构代码/统一社会信用代码/工商登记号三选一
     */
    private String zzjgdm;

    /**
     * 法定代表人姓名
     */
    private String fddbr;

    /**
     * 法定代表人职务
     */
    private String fddbrzw;

    /**
     * 代表人证件种类
     */
    private String dbrzjzl;

    /**
     * 代表人证件号码
     */
    private String dbrzjhm;

    /**
     * 联系电话
     */
    private String lxdh;

    /**
     * 刑事案件被告人附加表:羁押日期
     */
    private String jyrq;

    /**
     * 刑事案件被告人附加表:羁押场所
     */
    private String jycs;

    /**
     * 手机号码
     */
    private String sjhm;

    /**
     * 犯罪时年龄
     */
    private String sxfzsnl;

    /**
     * 核对人
     */
    private String hdr;

    /**
     * 核对时间
     */
    private String hdsj;

    /**
     * 分级码
     */
    private String fjm;

    /**
     * 地址
     */
    private String dz;

    /**
     * @return dsr_id
     */
    public Integer getDsrId() {
        return dsrId;
    }

    /**
     * @param dsrId
     */
    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
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
     * 获取材料编号：16人0表示智审回填数据，16个1表示同步综合业务系统数据
     *
     * @return clbh - 材料编号：16人0表示智审回填数据，16个1表示同步综合业务系统数据
     */
    public String getClbh() {
        return clbh;
    }

    /**
     * 设置材料编号：16人0表示智审回填数据，16个1表示同步综合业务系统数据
     *
     * @param clbh 材料编号：16人0表示智审回填数据，16个1表示同步综合业务系统数据
     */
    public void setClbh(String clbh) {
        this.clbh = clbh == null ? null : clbh.trim();
    }

    /**
     * 获取材料状态：
     *
     * @return state - 材料状态：
     */
    public String getState() {
        return state;
    }

    /**
     * 设置材料状态：
     *
     * @param state 材料状态：
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取创建日期
     *
     * @return createDate - 创建日期
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建日期
     *
     * @param createdate 创建日期
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    /**
     * @return id1
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * @param id1
     */
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    /**
     * 获取综合业务系统里当事人表ID
     *
     * @return dsrid - 综合业务系统里当事人表ID
     */
    public String getDsrid() {
        return dsrid;
    }

    /**
     * 设置综合业务系统里当事人表ID
     *
     * @param dsrid 综合业务系统里当事人表ID
     */
    public void setDsrid(String dsrid) {
        this.dsrid = dsrid == null ? null : dsrid.trim();
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
     * 获取诉讼地位
     *
     * @return ssdw - 诉讼地位
     */
    public String getSsdw() {
        return ssdw;
    }

    /**
     * 设置诉讼地位
     *
     * @param ssdw 诉讼地位
     */
    public void setSsdw(String ssdw) {
        this.ssdw = ssdw == null ? null : ssdw.trim();
    }

    /**
     * 获取当事人类型
     *
     * @return dsrlx - 当事人类型
     */
    public String getDsrlx() {
        return dsrlx;
    }

    /**
     * 设置当事人类型
     *
     * @param dsrlx 当事人类型
     */
    public void setDsrlx(String dsrlx) {
        this.dsrlx = dsrlx == null ? null : dsrlx.trim();
    }

    /**
     * 获取当事人姓名
     *
     * @return dsrmc - 当事人姓名
     */
    public String getDsrmc() {
        return dsrmc;
    }

    /**
     * 设置当事人姓名
     *
     * @param dsrmc 当事人姓名
     */
    public void setDsrmc(String dsrmc) {
        this.dsrmc = dsrmc == null ? null : dsrmc.trim();
    }

    /**
     * 获取性别
     *
     * @return xb - 性别
     */
    public String getXb() {
        return xb;
    }

    /**
     * 设置性别
     *
     * @param xb 性别
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * 获取年龄
     *
     * @return nl - 年龄
     */
    public String getNl() {
        return nl;
    }

    /**
     * 设置年龄
     *
     * @param nl 年龄
     */
    public void setNl(String nl) {
        this.nl = nl == null ? null : nl.trim();
    }

    /**
     * 获取国籍
     *
     * @return gj - 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 设置国籍
     *
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj == null ? null : gj.trim();
    }

    /**
     * 获取民族
     *
     * @return mz - 民族
     */
    public String getMz() {
        return mz;
    }

    /**
     * 设置民族
     *
     * @param mz 民族
     */
    public void setMz(String mz) {
        this.mz = mz == null ? null : mz.trim();
    }

    /**
     * 获取出生日期
     *
     * @return csrq - 出生日期
     */
    public String getCsrq() {
        return csrq;
    }

    /**
     * 设置出生日期
     *
     * @param csrq 出生日期
     */
    public void setCsrq(String csrq) {
        this.csrq = csrq == null ? null : csrq.trim();
    }

    /**
     * 获取文化程度
     *
     * @return whcd - 文化程度
     */
    public String getWhcd() {
        return whcd;
    }

    /**
     * 设置文化程度
     *
     * @param whcd 文化程度
     */
    public void setWhcd(String whcd) {
        this.whcd = whcd == null ? null : whcd.trim();
    }

    /**
     * 获取户籍所在地
     *
     * @return hjszd - 户籍所在地
     */
    public String getHjszd() {
        return hjszd;
    }

    /**
     * 设置户籍所在地
     *
     * @param hjszd 户籍所在地
     */
    public void setHjszd(String hjszd) {
        this.hjszd = hjszd == null ? null : hjszd.trim();
    }

    /**
     * 获取政治面貌
     *
     * @return zzmm - 政治面貌
     */
    public String getZzmm() {
        return zzmm;
    }

    /**
     * 设置政治面貌
     *
     * @param zzmm 政治面貌
     */
    public void setZzmm(String zzmm) {
        this.zzmm = zzmm == null ? null : zzmm.trim();
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
     * 获取级别
     *
     * @return jb - 级别
     */
    public String getJb() {
        return jb;
    }

    /**
     * 设置级别
     *
     * @param jb 级别
     */
    public void setJb(String jb) {
        this.jb = jb == null ? null : jb.trim();
    }

    /**
     * 获取证件种类
     *
     * @return zjzl - 证件种类
     */
    public String getZjzl() {
        return zjzl;
    }

    /**
     * 设置证件种类
     *
     * @param zjzl 证件种类
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
     * 获取单位性质
     *
     * @return dwxz - 单位性质
     */
    public String getDwxz() {
        return dwxz;
    }

    /**
     * 设置单位性质
     *
     * @param dwxz 单位性质
     */
    public void setDwxz(String dwxz) {
        this.dwxz = dwxz == null ? null : dwxz.trim();
    }

    /**
     * 获取组织机构代码/统一社会信用代码/工商登记号三选一
     *
     * @return zzjgdm - 组织机构代码/统一社会信用代码/工商登记号三选一
     */
    public String getZzjgdm() {
        return zzjgdm;
    }

    /**
     * 设置组织机构代码/统一社会信用代码/工商登记号三选一
     *
     * @param zzjgdm 组织机构代码/统一社会信用代码/工商登记号三选一
     */
    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm == null ? null : zzjgdm.trim();
    }

    /**
     * 获取法定代表人姓名
     *
     * @return fddbr - 法定代表人姓名
     */
    public String getFddbr() {
        return fddbr;
    }

    /**
     * 设置法定代表人姓名
     *
     * @param fddbr 法定代表人姓名
     */
    public void setFddbr(String fddbr) {
        this.fddbr = fddbr == null ? null : fddbr.trim();
    }

    /**
     * 获取法定代表人职务
     *
     * @return fddbrzw - 法定代表人职务
     */
    public String getFddbrzw() {
        return fddbrzw;
    }

    /**
     * 设置法定代表人职务
     *
     * @param fddbrzw 法定代表人职务
     */
    public void setFddbrzw(String fddbrzw) {
        this.fddbrzw = fddbrzw == null ? null : fddbrzw.trim();
    }

    /**
     * 获取代表人证件种类
     *
     * @return dbrzjzl - 代表人证件种类
     */
    public String getDbrzjzl() {
        return dbrzjzl;
    }

    /**
     * 设置代表人证件种类
     *
     * @param dbrzjzl 代表人证件种类
     */
    public void setDbrzjzl(String dbrzjzl) {
        this.dbrzjzl = dbrzjzl == null ? null : dbrzjzl.trim();
    }

    /**
     * 获取代表人证件号码
     *
     * @return dbrzjhm - 代表人证件号码
     */
    public String getDbrzjhm() {
        return dbrzjhm;
    }

    /**
     * 设置代表人证件号码
     *
     * @param dbrzjhm 代表人证件号码
     */
    public void setDbrzjhm(String dbrzjhm) {
        this.dbrzjhm = dbrzjhm == null ? null : dbrzjhm.trim();
    }

    /**
     * 获取联系电话
     *
     * @return lxdh - 联系电话
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
     * 设置联系电话
     *
     * @param lxdh 联系电话
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    /**
     * 获取刑事案件被告人附加表:羁押日期
     *
     * @return jyrq - 刑事案件被告人附加表:羁押日期
     */
    public String getJyrq() {
        return jyrq;
    }

    /**
     * 设置刑事案件被告人附加表:羁押日期
     *
     * @param jyrq 刑事案件被告人附加表:羁押日期
     */
    public void setJyrq(String jyrq) {
        this.jyrq = jyrq == null ? null : jyrq.trim();
    }

    /**
     * 获取刑事案件被告人附加表:羁押场所
     *
     * @return jycs - 刑事案件被告人附加表:羁押场所
     */
    public String getJycs() {
        return jycs;
    }

    /**
     * 设置刑事案件被告人附加表:羁押场所
     *
     * @param jycs 刑事案件被告人附加表:羁押场所
     */
    public void setJycs(String jycs) {
        this.jycs = jycs == null ? null : jycs.trim();
    }

    /**
     * 获取手机号码
     *
     * @return sjhm - 手机号码
     */
    public String getSjhm() {
        return sjhm;
    }

    /**
     * 设置手机号码
     *
     * @param sjhm 手机号码
     */
    public void setSjhm(String sjhm) {
        this.sjhm = sjhm == null ? null : sjhm.trim();
    }

    /**
     * 获取犯罪时年龄
     *
     * @return sxfzsnl - 犯罪时年龄
     */
    public String getSxfzsnl() {
        return sxfzsnl;
    }

    /**
     * 设置犯罪时年龄
     *
     * @param sxfzsnl 犯罪时年龄
     */
    public void setSxfzsnl(String sxfzsnl) {
        this.sxfzsnl = sxfzsnl == null ? null : sxfzsnl.trim();
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
     * 获取分级码
     *
     * @return fjm - 分级码
     */
    public String getFjm() {
        return fjm;
    }

    /**
     * 设置分级码
     *
     * @param fjm 分级码
     */
    public void setFjm(String fjm) {
        this.fjm = fjm == null ? null : fjm.trim();
    }

    /**
     * 获取地址
     *
     * @return dz - 地址
     */
    public String getDz() {
        return dz;
    }

    /**
     * 设置地址
     *
     * @param dz 地址
     */
    public void setDz(String dz) {
        this.dz = dz == null ? null : dz.trim();
    }
}