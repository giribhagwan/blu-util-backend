package com.embel.pectrotec.bluetoothUtil.repository;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceStreamRepository extends JpaRepository<DeviceStream,Long> {
}
