package cn.tycoding.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * @author tycoding
 * @date 2019-01-19
 */
@Data
@ToString
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 3554316034860494763L;

    @Id
    private Long id;

    private String username;

    private String password;

    private String salt;

    @Column(name = "dept_id")
    private Long deptId;

    @Transient
    private String deptName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "create_time")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "modify_time")
    private Date modifyTime;

    private String avatar;

    private Long phone;

    private String sex;

    private String description;

    private Boolean status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public Long getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public Long getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setUsername(String username) {
        this.username = username == null ? "" : username.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? "" : password.trim();
    }
}
