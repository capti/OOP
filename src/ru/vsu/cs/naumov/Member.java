package ru.vsu.cs.naumov;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String mName;
    private String mAddress;
    private Integer mNo;
    private List<Alert> alerts;

    public Member(String mName, String mAddress, Integer mNo) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNo = mNo;
        this.alerts = new ArrayList<>();
    }

    // Геттеры и сеттеры для полей (по желанию)

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public Integer getmNo() {
        return mNo;
    }

    public void setmNo(Integer mNo) {
        this.mNo = mNo;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    // Метод для добавления записи Alert
    public void addAlert(Alert alert) {
        alerts.add(alert);
    }

    // Метод для удаления записи Alert
    public void removeAlert(Alert alert) {
        alerts.remove(alert);
    }
}
