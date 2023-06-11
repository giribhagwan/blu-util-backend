package com.embel.pectrotec.bluetoothUtil.service;

import com.embel.pectrotec.bluetoothUtil.domain.ConfigMaster;
import com.embel.pectrotec.bluetoothUtil.dto.ConfigCountResponse;
import com.embel.pectrotec.bluetoothUtil.repository.ConfigMasterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConfigMasterService {
    private final ConfigMasterRepository configMasterRepository;
    public List<ConfigCountResponse> getBoardCountByConfig(String configName) {
        return configMasterRepository.findByConfigName(configName);
    }

    public ConfigMaster save(ConfigMaster configMaster) {
       return configMasterRepository.save(configMaster);
    }
}
