package com.embel.pectrotec.bluetoothUtil.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "device_stream")
@Data
public class DeviceStream {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String configuration;
    private String cardNo;
    private String jobType;
    private String workOrderNo;

}
