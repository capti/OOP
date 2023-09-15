package ru.vsu.cs.naumov;

public class Member {

    public Member(String mName, String mAddress, Integer mNo) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNo = mNo;
    }

    public String mName;

    public String mAddress;

    public Integer mNo;

    public void mRequestForBook() {
        System.out.println();
    }
}