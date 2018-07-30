package xaut.wjh.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.wjh.validator.UserFirstGroup;
import com.wjh.validator.UserSecondGroup;

public class TUser {
    private Integer id;
    @NotEmpty(message="用户名不能为空",groups=UserFirstGroup.class)
    @Length(min=6,max=20,message="用户名长度应该在6到16个字符之间",groups=UserSecondGroup.class)
    private String username;

    @NotEmpty(message="密码不能为空",groups=UserFirstGroup.class)
    @Length(min=9,max=16,message="密码长度应该在9到16个字符之间",groups=UserSecondGroup.class)
    private String password;

    private String sex;

    private Integer age;

    private String tel;

    private String photoname;

    private Integer provinceid;

    private Integer cityid;

    private Integer areaid;

    private Date inputdate;

    private String ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

	@Override
	public String toString() {
		return "TUser [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ ", tel=" + tel + ", photoname=" + photoname + ", provinceid=" + provinceid + ", cityid=" + cityid
				+ ", areaid=" + areaid + ", inputdate=" + inputdate + ", ip=" + ip + "]";
	}
    
    
}