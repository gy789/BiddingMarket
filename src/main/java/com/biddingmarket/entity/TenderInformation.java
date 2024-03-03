package com.biddingmarket.entity;

public class TenderInformation {

    private String projectName; // 招标项目名称
    private String projectNumber; // 招标项目编号

    private String projectType; // 招标项目类型
    private String tenderUnit; // 招标单位
    private String tenderAgency; // 招标代理机构
    private String publicationDate; // 招标发布时间
    private String deadlineDate; // 招标截止时间
    private String tenderScope; // 招标范围
    private String documentAccessMethod; // 招标文件获取方式
    private String bidDeadline; // 投标截止时间
    private String bidOpeningDate; // 开标时间
    private String bidBond; // 投标保证金
    private String bidderQualifications; // 投标人资格要求
    private String bidSubmissionMethod; // 投标文件递交方式
    private String documentFee; // 招标文件费用
    private String contactInformation; // 招标联系人信息

    private String create_time; // 创建时间
    private String update_time; // 更新时间

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    // 构造函数
    public TenderInformation() {
        // 可根据需要进行初始化
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getTenderUnit() {
        return tenderUnit;
    }

    public void setTenderUnit(String tenderUnit) {
        this.tenderUnit = tenderUnit;
    }

    public String getTenderAgency() {
        return tenderAgency;
    }

    public void setTenderAgency(String tenderAgency) {
        this.tenderAgency = tenderAgency;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getTenderScope() {
        return tenderScope;
    }

    public void setTenderScope(String tenderScope) {
        this.tenderScope = tenderScope;
    }

    public String getDocumentAccessMethod() {
        return documentAccessMethod;
    }

    public void setDocumentAccessMethod(String documentAccessMethod) {
        this.documentAccessMethod = documentAccessMethod;
    }

    public String getBidDeadline() {
        return bidDeadline;
    }

    public void setBidDeadline(String bidDeadline) {
        this.bidDeadline = bidDeadline;
    }

    public String getBidOpeningDate() {
        return bidOpeningDate;
    }

    public void setBidOpeningDate(String bidOpeningDate) {
        this.bidOpeningDate = bidOpeningDate;
    }

    public String getBidBond() {
        return bidBond;
    }

    public void setBidBond(String bidBond) {
        this.bidBond = bidBond;
    }

    public String getBidderQualifications() {
        return bidderQualifications;
    }

    public void setBidderQualifications(String bidderQualifications) {
        this.bidderQualifications = bidderQualifications;
    }

    public String getBidSubmissionMethod() {
        return bidSubmissionMethod;
    }

    public void setBidSubmissionMethod(String bidSubmissionMethod) {
        this.bidSubmissionMethod = bidSubmissionMethod;
    }

    public String getDocumentFee() {
        return documentFee;
    }

    public void setDocumentFee(String documentFee) {
        this.documentFee = documentFee;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
