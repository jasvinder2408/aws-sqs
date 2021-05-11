package com.demo.Demo.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TMP_LABCODE_SUMMARY_Test")
public class LabCodeMapperSummary implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
@Id @GeneratedValue(generator="system-uuid")
@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="GROUP_ID")
    private String groupId;

    @Column(name = "CLIENT_DATA_SRC_ID")
    private Integer clientDataSrcId;

    @Column(name="CODE_VALUE")
    private String codeValue;

    @Column(name="DICT_NAME")
    private String dictName;

    @Column(name="REF_RANGE")
    private String refRange;

    @Column(name="UNIT_NAME")
    private String unitName;

    @Column(name="ORDER_NAME")
    private String orderName;



    @Column(name="DATA_TYPE")
    private String dataType;

    @Column(name="SPECIMEN_NAME")
    private String SPECIMEN_NAME;

    @Column(name="BODYSITE_NAME")
    private String bodysiteName;

    @Column(name="LOCAL_LOINC_CODE")
    private String localLoincCode;

    @Column(name="CNT")
    private Long cnt;

    @Column(name="CNT_NUM")
    private Long cntNum;

    @Column(name="CNT_NULL")
    private Long cntNull;

    @Column(name="CNT_TEXT")
    private Long cntText;

    @Column(name="PERCENTILE10_NUM")
    private Integer percentile10Num;

    @Column(name="PERCENTILE25_NUM")
    private Integer percentile25Num;

    @Column(name="PERCENTILE50_NUM")
    private Integer percentile50Num;


    @Column(name="PERCENTILE75_NUM")
    private Integer percentile75Num;

    @Column(name="PERCENTILE90_NUM")
    private Integer percentile90Num;
    @Column(name="LOCALRESULT_TEXT")
    private String localResultText;


    @Column(name="CLIENT_DS_ID")
    private String clientDsId;

    @Column(name="RELEASE_CYCLE")
    private String releaseCycle;


    public void setClientDataSrcId(Integer clientDataSrcId) {
        this.clientDataSrcId = clientDataSrcId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getRefRange() {
        return refRange;
    }

    public void setRefRange(String refRange) {
        this.refRange = refRange;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSPECIMEN_NAME() {
        return SPECIMEN_NAME;
    }

    public void setSPECIMEN_NAME(String SPECIMEN_NAME) {
        this.SPECIMEN_NAME = SPECIMEN_NAME;
    }

    public String getBodysiteName() {
        return bodysiteName;
    }

    public void setBodysiteName(String bodysiteName) {
        this.bodysiteName = bodysiteName;
    }

    public String getLocalLoincCode() {
        return localLoincCode;
    }

    public void setLocalLoincCode(String localLoincCode) {
        this.localLoincCode = localLoincCode;
    }

    public Integer getPercentile10Num() {
        return percentile10Num;
    }

    public void setPercentile10Num(Integer percentile10Num) {
        this.percentile10Num = percentile10Num;
    }

    public Integer getPercentile25Num() {
        return percentile25Num;
    }

    public void setPercentile25Num(Integer percentile25Num) {
        this.percentile25Num = percentile25Num;
    }

    public Integer getPercentile50Num() {
        return percentile50Num;
    }

    public void setPercentile50Num(Integer percentile50Num) {
        this.percentile50Num = percentile50Num;
    }

    public Integer getPercentile75Num() {
        return percentile75Num;
    }

    public void setPercentile75Num(Integer percentile75Num) {
        this.percentile75Num = percentile75Num;
    }

    public Integer getPercentile90Num() {
        return percentile90Num;
    }

    public void setPercentile90Num(Integer percentile90Num) {
        this.percentile90Num = percentile90Num;
    }

    public String getLocalResultText() {
        return localResultText;
    }

    public void setLocalResultText(String localResultText) {
        this.localResultText = localResultText;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getClientDsId() {
        return clientDsId;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public Long getCntNum() {
        return cntNum;
    }

    public void setCntNum(Long cntNum) {
        this.cntNum = cntNum;
    }

    public Long getCntNull() {
        return cntNull;
    }

    public void setCntNull(Long cntNull) {
        this.cntNull = cntNull;
    }

    public Long getCntText() {
        return cntText;
    }

    public void setCntText(Long cntText) {
        this.cntText = cntText;
    }

    public void setClientDsId(String clientDsId) {
        this.clientDsId = clientDsId;
    }

    public Integer getClientDataSrcId() {
        return clientDataSrcId;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getReleaseCycle() {
        return releaseCycle;
    }

    public void setReleaseCycle(String releaseCycle) {
        this.releaseCycle = releaseCycle;
    }
}
