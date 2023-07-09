package vo;

import java.util.Date;

public class MemberVO {
    private String id;
    private String bankCode;
    private String kakaoId;
    private String userId;
    private String name;
    private String userPassword;
    private String easyPassword;
    private String email;
    private String phone;
    private String personalIdNumber;
    private String gender;
    private String birth;
    private String zipcode;
    private String address;
    private String detailAddress;
    private String receiveSmsYn;
    private String privacyAgreeYn;
    private Date privacyAgreeDate;
    private Date regDate;
    private String accountStatus;
    private Date withdrawalDate;

    // Getter and Setter methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getKakaoId() {
        return kakaoId;
    }

    public void setKakaoId(String kakaoId) {
        this.kakaoId = kakaoId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEasyPassword() {
        return easyPassword;
    }

    public void setEasyPassword(String easyPassword) {
        this.easyPassword = easyPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(String personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getReceiveSmsYn() {
        return receiveSmsYn;
    }

    public void setReceiveSmsYn(String receiveSmsYn) {
        this.receiveSmsYn = receiveSmsYn;
    }

}
