package com.embel.pectrotec.bluetoothUtil.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class DeviceStream {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String configName;
    private String serialNumber;
    private String boardName;
    private String processNumber;
    private String jobType;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata")
    private Timestamp createdTimestamp=new Timestamp(System.currentTimeMillis());

}
