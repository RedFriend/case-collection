package cn.com.taiji.collection.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_jck_ajjbxx")
public class Ajjbxx extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 流水号
     */
    private String code;

    /**
     * 材料编号
     */
    private String clbh;

    /**
     * 材料状态=1=以核对、0=未核对
     */
    private String clzt;

    /**
     * 创建日期
     */
    private String cjrq;

    /**
     * 承办法院
     */
    private String cbfy;

    /**
     * 承办部门
     */
    private String cbbm;

    /**
     * 案件来源
     */
    private String ajly;

    /**
     * 诉讼标的
     */
    private String ssbd;

    /**
     * 诉讼标的行为
     */
    private String ssbdxw;

    /**
     * 诉讼标的物
     */
    private String ssbdw;

    /**
     * 适用程序 ：1简易 2 普通
     */
    private String sycx;

    /**
     * 案件类别
     */
    private String ajlb;

    /**
     * 案件分类
     */
    private String ajfl;

    /**
     * 字号
     */
    private String zh;

    /**
     * 收到诉状日期
     */
    private String sdszrq;

    /**
     * 立案案由
     */
    private String laay;

    /**
     * 是否繁案
     */
    private String sffa;

    /**
     * 案件状态
     */
    private String ajzt;

    /**
     * 应缴诉讼费
     */
    private String yjssf;

    /**
     * 刑事案件:公诉机关
     */
    private String gsjg;

    /**
     * 刑事案件:公诉书编号
     */
    private String gssbh;

    /**
     * 刑事案件:公安机关
     */
    private String gajg;

    /**
     * 收案法官
     */
    private String safg;

    /**
     * 案由名称
     */
    private String aymc;

    /**
     * 案件涉及
     */
    private String ajsj;

    /**
     * 是否大案
     */
    private String sfda;

    /**
     * 大案成因
     */
    private String dacy;

    /**
     * 是否要案
     */
    private String sfya;

    /**
     * 要案成因
     */
    private String yacy;

    /**
     * 收费类型
     */
    private String sflx;

    /**
     * 适用审限
     */
    private String sysx;

    /**
     * 适用审限
     */
    private String spcx;

    /**
     * 立案管辖依据
     */
    private String lagxyj;

    /**
     * 立案案由 （主体类型）
     */
    @Column(name = "laay_ztlx")
    private String laayZtlx;

    /**
     * 立案案由（行政行为种类）
     */
    @Column(name = "laay_xzxwzl")
    private String laayXzxwzl;

    /**
     * 行政行为
     */
    private String xzxw;

    /**
     * 提起行政赔偿方式
     */
    private String tqpcfs;

    /**
     * 受理程序
     */
    private String slcx;

    /**
     * 赔偿案件类型
     */
    private String pcajlx;

    /**
     * 请求赔偿对象
     */
    private String qqpcdx;

    /**
     * 确认案件类别
     */
    private String pcfs;

    /**
     * 赔偿审判依据
     */
    private String pcspcx;

    /**
     * 报请案件案由
     */
    @Column(name = "laay_bqajay")
    private String laayBqajay;

    /**
     * 公诉人
     */
    private String gsr1;

    /**
     * 案件类型
     */
    private String ajlx;

    /**
     * 收案法官姓名
     */
    private String safgxm;

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

    @Column(name = "HY_SASJ")
    private String hySasj;

    @Column(name = "HY_LASJ")
    private String hyLasj;

    @Column(name = "HY_SXRQ")
    private String hySxrq;

    @Column(name = "HY_YWLX")
    private String hyYwlx;

    private String source;

    private Integer level;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 诉讼请求
     */
    private String ssqq;

    /**
     * 事实与理由
     */
    private String ssyly;

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
     * 获取材料状态=1=以核对、0=未核对
     *
     * @return clzt - 材料状态=1=以核对、0=未核对
     */
    public String getClzt() {
        return clzt;
    }

    /**
     * 设置材料状态=1=以核对、0=未核对
     *
     * @param clzt 材料状态=1=以核对、0=未核对
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
     * 获取承办法院
     *
     * @return cbfy - 承办法院
     */
    public String getCbfy() {
        return cbfy;
    }

    /**
     * 设置承办法院
     *
     * @param cbfy 承办法院
     */
    public void setCbfy(String cbfy) {
        this.cbfy = cbfy == null ? null : cbfy.trim();
    }

    /**
     * 获取承办部门
     *
     * @return cbbm - 承办部门
     */
    public String getCbbm() {
        return cbbm;
    }

    /**
     * 设置承办部门
     *
     * @param cbbm 承办部门
     */
    public void setCbbm(String cbbm) {
        this.cbbm = cbbm == null ? null : cbbm.trim();
    }

    /**
     * 获取案件来源
     *
     * @return ajly - 案件来源
     */
    public String getAjly() {
        return ajly;
    }

    /**
     * 设置案件来源
     *
     * @param ajly 案件来源
     */
    public void setAjly(String ajly) {
        this.ajly = ajly == null ? null : ajly.trim();
    }

    /**
     * 获取诉讼标的
     *
     * @return ssbd - 诉讼标的
     */
    public String getSsbd() {
        return ssbd;
    }

    /**
     * 设置诉讼标的
     *
     * @param ssbd 诉讼标的
     */
    public void setSsbd(String ssbd) {
        this.ssbd = ssbd == null ? null : ssbd.trim();
    }

    /**
     * 获取诉讼标的行为
     *
     * @return ssbdxw - 诉讼标的行为
     */
    public String getSsbdxw() {
        return ssbdxw;
    }

    /**
     * 设置诉讼标的行为
     *
     * @param ssbdxw 诉讼标的行为
     */
    public void setSsbdxw(String ssbdxw) {
        this.ssbdxw = ssbdxw == null ? null : ssbdxw.trim();
    }

    /**
     * 获取诉讼标的物
     *
     * @return ssbdw - 诉讼标的物
     */
    public String getSsbdw() {
        return ssbdw;
    }

    /**
     * 设置诉讼标的物
     *
     * @param ssbdw 诉讼标的物
     */
    public void setSsbdw(String ssbdw) {
        this.ssbdw = ssbdw == null ? null : ssbdw.trim();
    }

    /**
     * 获取适用程序 ：1简易 2 普通
     *
     * @return sycx - 适用程序 ：1简易 2 普通
     */
    public String getSycx() {
        return sycx;
    }

    /**
     * 设置适用程序 ：1简易 2 普通
     *
     * @param sycx 适用程序 ：1简易 2 普通
     */
    public void setSycx(String sycx) {
        this.sycx = sycx == null ? null : sycx.trim();
    }

    /**
     * 获取案件类别
     *
     * @return ajlb - 案件类别
     */
    public String getAjlb() {
        return ajlb;
    }

    /**
     * 设置案件类别
     *
     * @param ajlb 案件类别
     */
    public void setAjlb(String ajlb) {
        this.ajlb = ajlb == null ? null : ajlb.trim();
    }

    /**
     * 获取案件分类
     *
     * @return ajfl - 案件分类
     */
    public String getAjfl() {
        return ajfl;
    }

    /**
     * 设置案件分类
     *
     * @param ajfl 案件分类
     */
    public void setAjfl(String ajfl) {
        this.ajfl = ajfl == null ? null : ajfl.trim();
    }

    /**
     * 获取字号
     *
     * @return zh - 字号
     */
    public String getZh() {
        return zh;
    }

    /**
     * 设置字号
     *
     * @param zh 字号
     */
    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    /**
     * 获取收到诉状日期
     *
     * @return sdszrq - 收到诉状日期
     */
    public String getSdszrq() {
        return sdszrq;
    }

    /**
     * 设置收到诉状日期
     *
     * @param sdszrq 收到诉状日期
     */
    public void setSdszrq(String sdszrq) {
        this.sdszrq = sdszrq == null ? null : sdszrq.trim();
    }

    /**
     * 获取立案案由
     *
     * @return laay - 立案案由
     */
    public String getLaay() {
        return laay;
    }

    /**
     * 设置立案案由
     *
     * @param laay 立案案由
     */
    public void setLaay(String laay) {
        this.laay = laay == null ? null : laay.trim();
    }

    /**
     * 获取是否繁案
     *
     * @return sffa - 是否繁案
     */
    public String getSffa() {
        return sffa;
    }

    /**
     * 设置是否繁案
     *
     * @param sffa 是否繁案
     */
    public void setSffa(String sffa) {
        this.sffa = sffa == null ? null : sffa.trim();
    }

    /**
     * 获取案件状态
     *
     * @return ajzt - 案件状态
     */
    public String getAjzt() {
        return ajzt;
    }

    /**
     * 设置案件状态
     *
     * @param ajzt 案件状态
     */
    public void setAjzt(String ajzt) {
        this.ajzt = ajzt == null ? null : ajzt.trim();
    }

    /**
     * 获取应缴诉讼费
     *
     * @return yjssf - 应缴诉讼费
     */
    public String getYjssf() {
        return yjssf;
    }

    /**
     * 设置应缴诉讼费
     *
     * @param yjssf 应缴诉讼费
     */
    public void setYjssf(String yjssf) {
        this.yjssf = yjssf == null ? null : yjssf.trim();
    }

    /**
     * 获取刑事案件:公诉机关
     *
     * @return gsjg - 刑事案件:公诉机关
     */
    public String getGsjg() {
        return gsjg;
    }

    /**
     * 设置刑事案件:公诉机关
     *
     * @param gsjg 刑事案件:公诉机关
     */
    public void setGsjg(String gsjg) {
        this.gsjg = gsjg == null ? null : gsjg.trim();
    }

    /**
     * 获取刑事案件:公诉书编号
     *
     * @return gssbh - 刑事案件:公诉书编号
     */
    public String getGssbh() {
        return gssbh;
    }

    /**
     * 设置刑事案件:公诉书编号
     *
     * @param gssbh 刑事案件:公诉书编号
     */
    public void setGssbh(String gssbh) {
        this.gssbh = gssbh == null ? null : gssbh.trim();
    }

    /**
     * 获取刑事案件:公安机关
     *
     * @return gajg - 刑事案件:公安机关
     */
    public String getGajg() {
        return gajg;
    }

    /**
     * 设置刑事案件:公安机关
     *
     * @param gajg 刑事案件:公安机关
     */
    public void setGajg(String gajg) {
        this.gajg = gajg == null ? null : gajg.trim();
    }

    /**
     * 获取收案法官
     *
     * @return safg - 收案法官
     */
    public String getSafg() {
        return safg;
    }

    /**
     * 设置收案法官
     *
     * @param safg 收案法官
     */
    public void setSafg(String safg) {
        this.safg = safg == null ? null : safg.trim();
    }

    /**
     * 获取案由名称
     *
     * @return aymc - 案由名称
     */
    public String getAymc() {
        return aymc;
    }

    /**
     * 设置案由名称
     *
     * @param aymc 案由名称
     */
    public void setAymc(String aymc) {
        this.aymc = aymc == null ? null : aymc.trim();
    }

    /**
     * 获取案件涉及
     *
     * @return ajsj - 案件涉及
     */
    public String getAjsj() {
        return ajsj;
    }

    /**
     * 设置案件涉及
     *
     * @param ajsj 案件涉及
     */
    public void setAjsj(String ajsj) {
        this.ajsj = ajsj == null ? null : ajsj.trim();
    }

    /**
     * 获取是否大案
     *
     * @return sfda - 是否大案
     */
    public String getSfda() {
        return sfda;
    }

    /**
     * 设置是否大案
     *
     * @param sfda 是否大案
     */
    public void setSfda(String sfda) {
        this.sfda = sfda == null ? null : sfda.trim();
    }

    /**
     * 获取大案成因
     *
     * @return dacy - 大案成因
     */
    public String getDacy() {
        return dacy;
    }

    /**
     * 设置大案成因
     *
     * @param dacy 大案成因
     */
    public void setDacy(String dacy) {
        this.dacy = dacy == null ? null : dacy.trim();
    }

    /**
     * 获取是否要案
     *
     * @return sfya - 是否要案
     */
    public String getSfya() {
        return sfya;
    }

    /**
     * 设置是否要案
     *
     * @param sfya 是否要案
     */
    public void setSfya(String sfya) {
        this.sfya = sfya == null ? null : sfya.trim();
    }

    /**
     * 获取要案成因
     *
     * @return yacy - 要案成因
     */
    public String getYacy() {
        return yacy;
    }

    /**
     * 设置要案成因
     *
     * @param yacy 要案成因
     */
    public void setYacy(String yacy) {
        this.yacy = yacy == null ? null : yacy.trim();
    }

    /**
     * 获取收费类型
     *
     * @return sflx - 收费类型
     */
    public String getSflx() {
        return sflx;
    }

    /**
     * 设置收费类型
     *
     * @param sflx 收费类型
     */
    public void setSflx(String sflx) {
        this.sflx = sflx == null ? null : sflx.trim();
    }

    /**
     * 获取适用审限
     *
     * @return sysx - 适用审限
     */
    public String getSysx() {
        return sysx;
    }

    /**
     * 设置适用审限
     *
     * @param sysx 适用审限
     */
    public void setSysx(String sysx) {
        this.sysx = sysx == null ? null : sysx.trim();
    }

    /**
     * 获取适用审限
     *
     * @return spcx - 适用审限
     */
    public String getSpcx() {
        return spcx;
    }

    /**
     * 设置适用审限
     *
     * @param spcx 适用审限
     */
    public void setSpcx(String spcx) {
        this.spcx = spcx == null ? null : spcx.trim();
    }

    /**
     * 获取立案管辖依据
     *
     * @return lagxyj - 立案管辖依据
     */
    public String getLagxyj() {
        return lagxyj;
    }

    /**
     * 设置立案管辖依据
     *
     * @param lagxyj 立案管辖依据
     */
    public void setLagxyj(String lagxyj) {
        this.lagxyj = lagxyj == null ? null : lagxyj.trim();
    }

    /**
     * 获取立案案由 （主体类型）
     *
     * @return laay_ztlx - 立案案由 （主体类型）
     */
    public String getLaayZtlx() {
        return laayZtlx;
    }

    /**
     * 设置立案案由 （主体类型）
     *
     * @param laayZtlx 立案案由 （主体类型）
     */
    public void setLaayZtlx(String laayZtlx) {
        this.laayZtlx = laayZtlx == null ? null : laayZtlx.trim();
    }

    /**
     * 获取立案案由（行政行为种类）
     *
     * @return laay_xzxwzl - 立案案由（行政行为种类）
     */
    public String getLaayXzxwzl() {
        return laayXzxwzl;
    }

    /**
     * 设置立案案由（行政行为种类）
     *
     * @param laayXzxwzl 立案案由（行政行为种类）
     */
    public void setLaayXzxwzl(String laayXzxwzl) {
        this.laayXzxwzl = laayXzxwzl == null ? null : laayXzxwzl.trim();
    }

    /**
     * 获取行政行为
     *
     * @return xzxw - 行政行为
     */
    public String getXzxw() {
        return xzxw;
    }

    /**
     * 设置行政行为
     *
     * @param xzxw 行政行为
     */
    public void setXzxw(String xzxw) {
        this.xzxw = xzxw == null ? null : xzxw.trim();
    }

    /**
     * 获取提起行政赔偿方式
     *
     * @return tqpcfs - 提起行政赔偿方式
     */
    public String getTqpcfs() {
        return tqpcfs;
    }

    /**
     * 设置提起行政赔偿方式
     *
     * @param tqpcfs 提起行政赔偿方式
     */
    public void setTqpcfs(String tqpcfs) {
        this.tqpcfs = tqpcfs == null ? null : tqpcfs.trim();
    }

    /**
     * 获取受理程序
     *
     * @return slcx - 受理程序
     */
    public String getSlcx() {
        return slcx;
    }

    /**
     * 设置受理程序
     *
     * @param slcx 受理程序
     */
    public void setSlcx(String slcx) {
        this.slcx = slcx == null ? null : slcx.trim();
    }

    /**
     * 获取赔偿案件类型
     *
     * @return pcajlx - 赔偿案件类型
     */
    public String getPcajlx() {
        return pcajlx;
    }

    /**
     * 设置赔偿案件类型
     *
     * @param pcajlx 赔偿案件类型
     */
    public void setPcajlx(String pcajlx) {
        this.pcajlx = pcajlx == null ? null : pcajlx.trim();
    }

    /**
     * 获取请求赔偿对象
     *
     * @return qqpcdx - 请求赔偿对象
     */
    public String getQqpcdx() {
        return qqpcdx;
    }

    /**
     * 设置请求赔偿对象
     *
     * @param qqpcdx 请求赔偿对象
     */
    public void setQqpcdx(String qqpcdx) {
        this.qqpcdx = qqpcdx == null ? null : qqpcdx.trim();
    }

    /**
     * 获取确认案件类别
     *
     * @return pcfs - 确认案件类别
     */
    public String getPcfs() {
        return pcfs;
    }

    /**
     * 设置确认案件类别
     *
     * @param pcfs 确认案件类别
     */
    public void setPcfs(String pcfs) {
        this.pcfs = pcfs == null ? null : pcfs.trim();
    }

    /**
     * 获取赔偿审判依据
     *
     * @return pcspcx - 赔偿审判依据
     */
    public String getPcspcx() {
        return pcspcx;
    }

    /**
     * 设置赔偿审判依据
     *
     * @param pcspcx 赔偿审判依据
     */
    public void setPcspcx(String pcspcx) {
        this.pcspcx = pcspcx == null ? null : pcspcx.trim();
    }

    /**
     * 获取报请案件案由
     *
     * @return laay_bqajay - 报请案件案由
     */
    public String getLaayBqajay() {
        return laayBqajay;
    }

    /**
     * 设置报请案件案由
     *
     * @param laayBqajay 报请案件案由
     */
    public void setLaayBqajay(String laayBqajay) {
        this.laayBqajay = laayBqajay == null ? null : laayBqajay.trim();
    }

    /**
     * 获取公诉人
     *
     * @return gsr1 - 公诉人
     */
    public String getGsr1() {
        return gsr1;
    }

    /**
     * 设置公诉人
     *
     * @param gsr1 公诉人
     */
    public void setGsr1(String gsr1) {
        this.gsr1 = gsr1 == null ? null : gsr1.trim();
    }

    /**
     * 获取案件类型
     *
     * @return ajlx - 案件类型
     */
    public String getAjlx() {
        return ajlx;
    }

    /**
     * 设置案件类型
     *
     * @param ajlx 案件类型
     */
    public void setAjlx(String ajlx) {
        this.ajlx = ajlx == null ? null : ajlx.trim();
    }

    /**
     * 获取收案法官姓名
     *
     * @return safgxm - 收案法官姓名
     */
    public String getSafgxm() {
        return safgxm;
    }

    /**
     * 设置收案法官姓名
     *
     * @param safgxm 收案法官姓名
     */
    public void setSafgxm(String safgxm) {
        this.safgxm = safgxm == null ? null : safgxm.trim();
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
     * @return HY_SASJ
     */
    public String getHySasj() {
        return hySasj;
    }

    /**
     * @param hySasj
     */
    public void setHySasj(String hySasj) {
        this.hySasj = hySasj == null ? null : hySasj.trim();
    }

    /**
     * @return HY_LASJ
     */
    public String getHyLasj() {
        return hyLasj;
    }

    /**
     * @param hyLasj
     */
    public void setHyLasj(String hyLasj) {
        this.hyLasj = hyLasj == null ? null : hyLasj.trim();
    }

    /**
     * @return HY_SXRQ
     */
    public String getHySxrq() {
        return hySxrq;
    }

    /**
     * @param hySxrq
     */
    public void setHySxrq(String hySxrq) {
        this.hySxrq = hySxrq == null ? null : hySxrq.trim();
    }

    /**
     * @return HY_YWLX
     */
    public String getHyYwlx() {
        return hyYwlx;
    }

    /**
     * @param hyYwlx
     */
    public void setHyYwlx(String hyYwlx) {
        this.hyYwlx = hyYwlx == null ? null : hyYwlx.trim();
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
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

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取诉讼请求
     *
     * @return ssqq - 诉讼请求
     */
    public String getSsqq() {
        return ssqq;
    }

    /**
     * 设置诉讼请求
     *
     * @param ssqq 诉讼请求
     */
    public void setSsqq(String ssqq) {
        this.ssqq = ssqq == null ? null : ssqq.trim();
    }

    /**
     * 获取事实与理由
     *
     * @return ssyly - 事实与理由
     */
    public String getSsyly() {
        return ssyly;
    }

    /**
     * 设置事实与理由
     *
     * @param ssyly 事实与理由
     */
    public void setSsyly(String ssyly) {
        this.ssyly = ssyly == null ? null : ssyly.trim();
    }
}