package com.wasy.web.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Employee implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date birthday;

    private String idCard;

    private String wedlock;

    private Integer nationId;

    private String nativePlace;

    private Integer politicId;

    private String email;

    private String phone;

    private String address;

    private Integer departmentId;

    private Integer jobLevelId;

    private Integer posId;

    private String engageForm;

    private String tiptopDegree;

    private String specialty;

    private String school;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date beginDate;

    private String workState;

    private String workId;

    private Double contractTerm;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date conversionTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date notWorkDate;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date beginContract;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date endContract;

    private Integer workAge;

}