package com.embel.pectrotec.bluetoothUtil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfigCountResponse {
    private String boardName;
    private Integer numberOfCount;
}
