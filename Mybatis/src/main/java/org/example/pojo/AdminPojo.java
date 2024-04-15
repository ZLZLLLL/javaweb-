package org.example.pojo;

public class AdminPojo {private String AdminID;
    private String AdminName;
    private String AdminPhone;
    private String AdminPassword;

    public String getAdminID() {
        return AdminID;
    }

    @Override
    public String toString() {
        return "AdminPojo{" +
                "AdminID='" + AdminID + '\'' +
                ", AdminName='" + AdminName + '\'' +
                ", AdminPhone='" + AdminPhone + '\'' +
                ", AdminPassword='" + AdminPassword + '\'' +
                '}';
    }

    public void setAdminID(String adminID) {
        AdminID = adminID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminPhone() {
        return AdminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        AdminPhone = adminPhone;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }
}