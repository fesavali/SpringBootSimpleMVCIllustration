package com.savali;

public class Friend {

    private Integer id;  
    private String name;
    private String nickName;
    private String status;
    private String duration;

    public Friend(Integer id, String name, String nickName, String status, String duration) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.status = status;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
	public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}
