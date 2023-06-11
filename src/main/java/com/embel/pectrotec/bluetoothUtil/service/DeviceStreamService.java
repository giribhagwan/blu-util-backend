package com.embel.pectrotec.bluetoothUtil.service;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import com.embel.pectrotec.bluetoothUtil.repository.DeviceStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceStreamService {
    @Autowired
    DeviceStreamRepository deviceStreamRepository;
    public String save(DeviceStream deviceStream){
        deviceStreamRepository.save(deviceStream);
        return "Saved";
    }

    public DeviceStream get(Long id) {
        return deviceStreamRepository.findById(id)
                .get();
    }

    public List<DeviceStream> getAll() {
       return deviceStreamRepository.findAll();
    }

    public List<DeviceStream> getByWorkOrderNo(String workOrderNumber) {
       return deviceStreamRepository.findByWorkOrderNo(workOrderNumber);
    }

    public List<DeviceStream> getByWorkOrderNo(String jobType, String workOrderNumber) {
        return deviceStreamRepository.findByJobTypeAndWorkOrderNo(jobType,workOrderNumber);
    }
}
