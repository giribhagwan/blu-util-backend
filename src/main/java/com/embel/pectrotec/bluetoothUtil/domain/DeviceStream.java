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
    String mcuBoardSoftwareSrNo;
    String mcuBoardHardwareVersion;
    String mcuBoardSrNo;
    String mcuBoardSHA2;
    String mcuBoardSignXBitBlock;
    String mcuBoardPublicKey;
    String mcuBoardPrivateKey;
    String mcuBoardRCAPublicKey;
    String csdBoardSoftwareSrNo;
    String csdBoardHardwareVersion;
    String csdBoardSrNo;
    String csdBoardSHA2;
    String csdBoardSignXBitBlock;
    String csdBoardPublicKey;
    String csdBoardPrivateKey;
    String csdBoardRCAPublicKey;
    String mreBoardSoftwareSrNo;
    String mreBoardHardwareVersion;
    String mreBoardSrNo;
    String mreBoardSHA2;
    String mreBoardSignXBitBlock;
    String mreBoardPublicKey;
    String mreBoardPrivateKey;
    String mreBoardRCAPublicKey;
    String sdlBoardSoftwareSrNo;
    String sdlBoardHardwareVersion;
    String sdlBoardSrNo;
    String sdlBoardSHA2;
//    String sdlBoardSignXBitBlock;
//    String sdlBoardPublicKey;
//    String sdlBoardPrivateKey;
//    String sdlBoardRCAPublicKey;
//    String board1SoftwareSrNo;
//    String board1HardwareVersion;
//    String board1BoardSrNo;
//    String board1BoardSHA2;
//    String board1SignXBitBlock;
//    String board1PublicKey;
//    String board1PrivateKey;
//    String board1RCAPublicKey;
//    String board2SoftwareSrNo;
//    String board2HardwareVersion;
//    String board2BoardSrNo;
//    String board2BoardSHA2;
//    String board2SignXBitBlock;
//    String board2PublicKey;
//    String board2PrivateKey;
//    String board2RCAPublicKey;
//    String board3SoftwareSrNo;
//    String board3HardwareVersion;
//    String board3BoardSrNo;
//    String board3BoardSHA2;
//    String board3SignXBitBlock;
//    String board3PublicKey;
//    String board3PrivateKey;
//    String board3RCAPublicKey;
//    String board4SoftwareSrNo;
//    String board4HardwareVersion;
//    String board4BoardSrNo;
//    String board4BoardSHA2;
//    String board4SignXBitBlock;
//    String board4PublicKey;
//    String board4PrivateKey;
//    String board4RCAPublicKey;
}
