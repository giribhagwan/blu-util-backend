package com.embel.pectrotec.bluetoothUtil.controller;

import com.embel.pectrotec.bluetoothUtil.domain.ConfigMaster;
import com.embel.pectrotec.bluetoothUtil.dto.ConfigCountResponse;
import com.embel.pectrotec.bluetoothUtil.service.ConfigMasterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/v1/config")
@AllArgsConstructor
public class ConfigController {
    private final ConfigMasterService configMasterService;

    @GetMapping("/getBy")
    private List<ConfigCountResponse> getBoardCountByConfig(@RequestParam String configName){
        return configMasterService.getBoardCountByConfig(configName);
    }
    @PostMapping("")
    private ConfigMaster save(@RequestBody ConfigMaster configName){
        return configMasterService.save(configName);
    }
}
