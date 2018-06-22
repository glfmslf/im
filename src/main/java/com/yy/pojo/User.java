package com.yy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/11 9:51
 */
public class User {
    private String userName; // 用户名。对于SELLER角色的卖家用户，其卖家登录账号是sellerLoginAccount字段，而不是userName字段。
    private String nickName; // 昵称
    private String trueName; // 真实姓名
    private String custId; //会员id

    private String password; //卖家或后台管理员的登录密码。买家通过单点登录进行登录，所以买家的密码在cas server端保存
    private String userRole; // 用户角色。当买家提交开店申请且管理员审核通过该申请后，买家的此字段的值会由“BUYER”变为“SELLER”。可选值有 ：ADMIN、BUYER、SELLER
    private Date birthday; // 出生日期
    private String telephone; // 电话号码
    private String QQ; // 用户QQ
    private String WW; // 用户阿里旺旺
    private int month_income; // 月收入 0为无收入 1为2000元以下 2为2000-3999 3为4000-5999
    // 4为6000-7999 5为8000以上
    private int years; // 用户年龄
    private String MSN; // 用户MSN
    private String address; // 用户详细地址
    private int sex; // 性别 1为男、0为女、-1为保密
    private String email; // 邮箱地址
    private String mobile; // 手机号码
    private String card; // 身份证号
    private Date lastLoginDate; // 上次作为买家成功登录的时间
    private Date loginDate; // 当前登陆的时间
    private String lastLoginIp; // 上次作为买家成功登录的IP
    private String loginIp; // 当前登陆Ip


    private int loginCount; //作为买家成功登录的总次数
    private int report; // 是否允许举报商品,0为允许，-1为不允许
    private BigDecimal availableBalance; // 可用余额，此字段的值可能与用户在CRM中保存的真实余额有出入（此字段的值只会在从CRM中同步用户信息到商城且同步时updateFlag为true时才会更新）。用户的真实余额可以从user.getAvailableBalance()中获得。
    private BigDecimal freezeBlance; // 冻结余额。此字段当前并未使用
    private int integral; // 用户积分
    private int gold; // 用户金币
    private User parent; // 如果为卖家子账号，则该属性不为空，通过该属性获取卖家子账号对应的店铺信息
    private List<User> childs = new ArrayList<User>();
    private String qq_openid; // qq互联
    private String sina_openid; // 新浪微博id
    private int user_type; // 用户类别，默认为0个人用户，1为企业用户
    private String contact_user; // 企业联系人
    private String department; // 企业联系人所在部门
    private String company_name; // 企业名称
    private String company_address; // 企业地址
    private String company_purpose; // 购买类型
    private String company_url; // 企业网址
    private String company_person_num; // 企业员工人数
    private String company_trade; // 公司行业
    private String company_nature; // 企业性质
    private int store_apply_step; // 店铺申请进行的步骤，默认为0,总共分为0、1、2、3、4、5、6、7、8

    private BigDecimal user_goods_fee; // 该用户总商品消费金额，1、用于计算用户等级，消费越高，等级越高。2、平台发放优惠券时（如：限制人数100人），按照用户消费金额排序，前100人可以得到该优惠券
    private String staple_gc; // 用户店铺常用分类，使用json管理[{"id",1"name":"女装"},{"id",3"name":"男装"}]这里只记录最底层分类的id
    private String app_login_token; // 用户手机app登录产生的token
    private String app_seller_login_token; // 商家手机app登录产生的token
    private String user_form; // 用户类型，分为pc，android,ios，
    private String mobile_pay_password; // 手机支付密码，用户手机端使用预存款支付时需要输入支付密码，如果用户没有设置支付密码需要输入登录密码
    private String invoice; // 用户发票信息
    private int invoiceType; // 发票类型
    private int invoiceTitleType;//发票抬头类型（0：默认没有选择 1:个人 2:企业）
    private String enterpriseTaxNumber;//企业税号，如果抬头选择个人则为空
    private Long delivery_id; // 用户所申请的自提点id
    private int whether_attention; // 是否允许关注 关闭后其他人无法访问您的个人主页 且无法对您进行关注
    // 0为不允许,1为允许
    private String circle_create_info; // 用户所创建圈子id,可以多个，使用json管理[{"id":1,"name":"搞笑一家人"},{"id":1,"name":"搞笑一家人"},{"id":1,"name":"搞笑一家人"}]
    private String circle_attention_info; // 用户关注的圈子信息，使用json管理[{"id":1,"name":"搞笑一家人"},{"id":1,"name":"搞笑一家人"},{"id":1,"name":"搞笑一家人"}]
    private String openId; // 微信公众平台使用的openid
    private String userMark; // 用户保密


    private String sellerLoginAccount;//卖家的登录账号名。


    private String currentLoginRole; //用户登录的角色。因为卖家既可以以店主身份登录，也可以以买家身份登录，故此字段记录的是已登录的用户当前的角色。此字段只会在登录时被设置

    /**
     * 指示当前登录的用户是否是从wap端登录的。注：只有买家可以从wap端登录。此字段会在登录成功时被设置
     */
    private boolean isWapContext = false;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWW() {
        return WW;
    }

    public void setWW(String WW) {
        this.WW = WW;
    }

    public int getMonth_income() {
        return month_income;
    }

    public void setMonth_income(int month_income) {
        this.month_income = month_income;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getMSN() {
        return MSN;
    }

    public void setMSN(String MSN) {
        this.MSN = MSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getFreezeBlance() {
        return freezeBlance;
    }

    public void setFreezeBlance(BigDecimal freezeBlance) {
        this.freezeBlance = freezeBlance;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public List<User> getChilds() {
        return childs;
    }

    public void setChilds(List<User> childs) {
        this.childs = childs;
    }

    public String getQq_openid() {
        return qq_openid;
    }

    public void setQq_openid(String qq_openid) {
        this.qq_openid = qq_openid;
    }

    public String getSina_openid() {
        return sina_openid;
    }

    public void setSina_openid(String sina_openid) {
        this.sina_openid = sina_openid;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getContact_user() {
        return contact_user;
    }

    public void setContact_user(String contact_user) {
        this.contact_user = contact_user;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getCompany_purpose() {
        return company_purpose;
    }

    public void setCompany_purpose(String company_purpose) {
        this.company_purpose = company_purpose;
    }

    public String getCompany_url() {
        return company_url;
    }

    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }

    public String getCompany_person_num() {
        return company_person_num;
    }

    public void setCompany_person_num(String company_person_num) {
        this.company_person_num = company_person_num;
    }

    public String getCompany_trade() {
        return company_trade;
    }

    public void setCompany_trade(String company_trade) {
        this.company_trade = company_trade;
    }

    public String getCompany_nature() {
        return company_nature;
    }

    public void setCompany_nature(String company_nature) {
        this.company_nature = company_nature;
    }

    public int getStore_apply_step() {
        return store_apply_step;
    }

    public void setStore_apply_step(int store_apply_step) {
        this.store_apply_step = store_apply_step;
    }

    public BigDecimal getUser_goods_fee() {
        return user_goods_fee;
    }

    public void setUser_goods_fee(BigDecimal user_goods_fee) {
        this.user_goods_fee = user_goods_fee;
    }

    public String getStaple_gc() {
        return staple_gc;
    }

    public void setStaple_gc(String staple_gc) {
        this.staple_gc = staple_gc;
    }

    public String getApp_login_token() {
        return app_login_token;
    }

    public void setApp_login_token(String app_login_token) {
        this.app_login_token = app_login_token;
    }

    public String getApp_seller_login_token() {
        return app_seller_login_token;
    }

    public void setApp_seller_login_token(String app_seller_login_token) {
        this.app_seller_login_token = app_seller_login_token;
    }

    public String getUser_form() {
        return user_form;
    }

    public void setUser_form(String user_form) {
        this.user_form = user_form;
    }

    public String getMobile_pay_password() {
        return mobile_pay_password;
    }

    public void setMobile_pay_password(String mobile_pay_password) {
        this.mobile_pay_password = mobile_pay_password;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public int getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }

    public int getInvoiceTitleType() {
        return invoiceTitleType;
    }

    public void setInvoiceTitleType(int invoiceTitleType) {
        this.invoiceTitleType = invoiceTitleType;
    }

    public String getEnterpriseTaxNumber() {
        return enterpriseTaxNumber;
    }

    public void setEnterpriseTaxNumber(String enterpriseTaxNumber) {
        this.enterpriseTaxNumber = enterpriseTaxNumber;
    }

    public Long getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Long delivery_id) {
        this.delivery_id = delivery_id;
    }

    public int getWhether_attention() {
        return whether_attention;
    }

    public void setWhether_attention(int whether_attention) {
        this.whether_attention = whether_attention;
    }

    public String getCircle_create_info() {
        return circle_create_info;
    }

    public void setCircle_create_info(String circle_create_info) {
        this.circle_create_info = circle_create_info;
    }

    public String getCircle_attention_info() {
        return circle_attention_info;
    }

    public void setCircle_attention_info(String circle_attention_info) {
        this.circle_attention_info = circle_attention_info;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public String getSellerLoginAccount() {
        return sellerLoginAccount;
    }

    public void setSellerLoginAccount(String sellerLoginAccount) {
        this.sellerLoginAccount = sellerLoginAccount;
    }

    public String getCurrentLoginRole() {
        return currentLoginRole;
    }

    public void setCurrentLoginRole(String currentLoginRole) {
        this.currentLoginRole = currentLoginRole;
    }

    public boolean isWapContext() {
        return isWapContext;
    }

    public void setWapContext(boolean wapContext) {
        isWapContext = wapContext;
    }
}
