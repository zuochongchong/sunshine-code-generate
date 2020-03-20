package com.sunshine.app.common.base.entity;

import java.io.Serializable;
import java.util.Date;

public class MsgCodeInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 内容
     */
    private String content;

    /**
     * 短信验证码
     */
    private String smgCode;

    /**
     * 状态：
            0: 成功 1:失败
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 经手人
     */
    private String handleUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 审核人
     */
    private String auditUser;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 打印时间
     */
    private Date printTime;

    /**
     * 更新人
     */
    private String updateUser;

    private static final long serialVersionUID = 1L;

    /**
     * 
     *  msg_code_info.id 主键
     *
     * @return the value of msg_code_info.id
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id 主键
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     *  msg_code_info.phone 手机号
     *
     * @return the value of msg_code_info.phone
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone 手机号
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 
     *  msg_code_info.content 内容
     *
     * @return the value of msg_code_info.content
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content 内容
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 
     *  msg_code_info.smg_code 短信验证码
     *
     * @return the value of msg_code_info.smg_code
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getSmgCode() {
        return smgCode;
    }

    /**
     *
     * @param smgCode 短信验证码
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setSmgCode(String smgCode) {
        this.smgCode = smgCode == null ? null : smgCode.trim();
    }

    /**
     * 
     *  msg_code_info.status 状态：
            0: 成功 1:失败
     *
     * @return the value of msg_code_info.status
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status 状态：
            0: 成功 1:失败
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     *  msg_code_info.remark 备注
     *
     * @return the value of msg_code_info.remark
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getRemark() {
        return remark;
    }

    /**
     *
     * @param remark 备注
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     *  msg_code_info.handle_user 经手人
     *
     * @return the value of msg_code_info.handle_user
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getHandleUser() {
        return handleUser;
    }

    /**
     *
     * @param handleUser 经手人
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser == null ? null : handleUser.trim();
    }

    /**
     * 
     *  msg_code_info.create_time 创建时间
     *
     * @return the value of msg_code_info.create_time
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @param createTime 创建时间
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     *  msg_code_info.create_user 创建人
     *
     * @return the value of msg_code_info.create_user
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     *
     * @param createUser 创建人
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 
     *  msg_code_info.audit_user 审核人
     *
     * @return the value of msg_code_info.audit_user
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     *
     * @param auditUser 审核人
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    /**
     * 
     *  msg_code_info.audit_time 审核时间
     *
     * @return the value of msg_code_info.audit_time
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     *
     * @param auditTime 审核时间
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 
     *  msg_code_info.update_time 更新时间
     *
     * @return the value of msg_code_info.update_time
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @param updateTime 更新时间
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     *  msg_code_info.print_time 打印时间
     *
     * @return the value of msg_code_info.print_time
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public Date getPrintTime() {
        return printTime;
    }

    /**
     *
     * @param printTime 打印时间
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    /**
     * 
     *  msg_code_info.update_user 更新人
     *
     * @return the value of msg_code_info.update_user
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     *
     * @param updateUser 更新人
     *
     * @sunshine.generated 2020-03-21 01:44:12
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", content=").append(content);
        sb.append(", smgCode=").append(smgCode);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", handleUser=").append(handleUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", auditUser=").append(auditUser);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", printTime=").append(printTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}