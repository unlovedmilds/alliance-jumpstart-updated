package com.alliance.jumpstart.viewmodels;

public class ApplicantDetails {

    private Long id;
    private String fullName;
    private String email;
    private String appliedPosition;
    private String resumeDownloadPath;

    public String getFullName() {
        return this.fullName;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the resumeDownloadPath
     */
    public String getResumeDownloadPath() {
        return resumeDownloadPath;
    }

    /**
     * @param resumeDownloadPath the resumeDownloadPath to set
     */
    public void setResumeDownloadPath(String resumeDownloadPath) {
        this.resumeDownloadPath = resumeDownloadPath;
    }

    /**
     * @return the appliedPosition
     */
    public String getAppliedPosition() {
        return appliedPosition;
    }

    /**
     * @param appliedPosition the appliedPosition to set
     */
    public void setAppliedPosition(String appliedPosition) {
        this.appliedPosition = appliedPosition;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}