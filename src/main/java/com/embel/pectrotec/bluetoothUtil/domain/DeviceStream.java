package com.embel.pectrotec.bluetoothUtil.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
