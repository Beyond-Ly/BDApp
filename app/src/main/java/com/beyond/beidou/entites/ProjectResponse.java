package com.beyond.beidou.entites;

import java.util.List;

/**
 * @author: 李垚
 * @date: 2021/3/10
 */
public class ProjectResponse {

    /**
     * ResponseCode : 200
     * ResponseMsg : 操作成功
     * PageInfo : {"PageFlag":"ProjectStartTime","PageNumber":1,"PageSize":10,"TotalNumber":1}
     * ProjectList : [{"ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","ProjectPrincipalUUID":"cc775619-7beb-61c3-e192-7018f776f554","ProjectName":"系统测试工程","ProjectAddress":"BDJC","ProjectPrincipalName":"管理员","ProjectPrincipalMobile":"13800138000","ProjectStartTime":"2020-01-01 00:00:00","ProjectEndTime":"2030-01-01 00:00:00","ProjectStatus":"1","ProjectCreateTime":"2020-01-01 00:00:00","ProjectModifyTime":"2020-01-01 00:00:00","StationList":[{"StationUUID":"dcbe771b-b3fa-efad-ff4b-fabc0a1841d6","DeviceUUID":"dcbe771b-b3fa-efad-ff4b-fabc0a1841d6","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点1","StationType":"1","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-02 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 02:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 02:00:00","StationModifyTime":"2021-02-24 11:22:01","StationLastTime":"2021-02-23 15:53:52","ProjectName":"系统测试工程","StationConditionList":[]},{"StationUUID":"8eaec45b-559c-78ec-f7de-bc8c88e5efcd","DeviceUUID":"8eaec45b-559c-78ec-f7de-bc8c88e5efcd","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点2","StationType":"2","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-03 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 03:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 03:00:00","StationModifyTime":"2021-02-23 15:53:52","StationLastTime":"2021-02-23 15:53:52","ProjectName":"系统测试工程","StationConditionList":[]},{"StationUUID":"6159529a-6bc3-4c73-84d1-e59f6f60ece6","DeviceUUID":"6159529a-6bc3-4c73-84d1-e59f6f60ece6","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点名称","StationType":"2","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-01 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 01:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 01:00:00","StationModifyTime":"2021-02-24 15:01:00","StationLastTime":"2021-02-23 18:02:33","ProjectName":"系统测试工程","StationConditionList":[]}],"ProjectStationStatus":{"Total":3,"Online":0,"Error":0,"Warning":0,"Offline":3}}]
     */

    private String ResponseCode;
    private String ResponseMsg;
    private PageInfoBean PageInfo;
    private List<ProjectListBean> ProjectList;

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public String getResponseMsg() {
        return ResponseMsg;
    }

    public void setResponseMsg(String ResponseMsg) {
        this.ResponseMsg = ResponseMsg;
    }

    public PageInfoBean getPageInfo() {
        return PageInfo;
    }

    public void setPageInfo(PageInfoBean PageInfo) {
        this.PageInfo = PageInfo;
    }

    public List<ProjectListBean> getProjectList() {
        return ProjectList;
    }

    public void setProjectList(List<ProjectListBean> ProjectList) {
        this.ProjectList = ProjectList;
    }

    public static class PageInfoBean {
        /**
         * PageFlag : ProjectStartTime
         * PageNumber : 1
         * PageSize : 10
         * TotalNumber : 1
         */

        private String PageFlag;
        private int PageNumber;
        private int PageSize;
        private int TotalNumber;

        public String getPageFlag() {
            return PageFlag;
        }

        public void setPageFlag(String PageFlag) {
            this.PageFlag = PageFlag;
        }

        public int getPageNumber() {
            return PageNumber;
        }

        public void setPageNumber(int PageNumber) {
            this.PageNumber = PageNumber;
        }

        public int getPageSize() {
            return PageSize;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public int getTotalNumber() {
            return TotalNumber;
        }

        public void setTotalNumber(int TotalNumber) {
            this.TotalNumber = TotalNumber;
        }
    }

    public static class ProjectListBean {
        /**
         * ProjectUUID : 1febf7af-2159-6218-16b2-91d14c8dd186
         * ProjectPrincipalUUID : cc775619-7beb-61c3-e192-7018f776f554
         * ProjectName : 系统测试工程
         * ProjectAddress : BDJC
         * ProjectPrincipalName : 管理员
         * ProjectPrincipalMobile : 13800138000
         * ProjectStartTime : 2020-01-01 00:00:00
         * ProjectEndTime : 2030-01-01 00:00:00
         * ProjectStatus : 1
         * ProjectCreateTime : 2020-01-01 00:00:00
         * ProjectModifyTime : 2020-01-01 00:00:00
         * StationList : [{"StationUUID":"dcbe771b-b3fa-efad-ff4b-fabc0a1841d6","DeviceUUID":"dcbe771b-b3fa-efad-ff4b-fabc0a1841d6","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点1","StationType":"1","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-02 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 02:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 02:00:00","StationModifyTime":"2021-02-24 11:22:01","StationLastTime":"2021-02-23 15:53:52","ProjectName":"系统测试工程","StationConditionList":[]},{"StationUUID":"8eaec45b-559c-78ec-f7de-bc8c88e5efcd","DeviceUUID":"8eaec45b-559c-78ec-f7de-bc8c88e5efcd","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点2","StationType":"2","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-03 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 03:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 03:00:00","StationModifyTime":"2021-02-23 15:53:52","StationLastTime":"2021-02-23 15:53:52","ProjectName":"系统测试工程","StationConditionList":[]},{"StationUUID":"6159529a-6bc3-4c73-84d1-e59f6f60ece6","DeviceUUID":"6159529a-6bc3-4c73-84d1-e59f6f60ece6","ProjectUUID":"1febf7af-2159-6218-16b2-91d14c8dd186","StationName":"监测点名称","StationType":"2","StationAddress":"北京","StationLongitude":"116.480998473333","StationLatitude":"39.872120703333","StationAltitude":"57.613500000000","StationModel":"设备型号","StationSerialNumber":"设备序列号","StationBatchNumber":"生产批号","StationProductDate":"2020-01-01 00:00:00","StationManufacturer":"BDJC","StationMAC":"00:00:00:00:00","StationIMSI":"IMSI","StationICCID":"ICCID","StationGNSSInfo":"GNSSInfo","StationPrincipleName":"","StationPrincipleMobile":"","StationStatus":"20","StationStatusDetail":"离线(监测点超过900秒无上报)","StationStartTime":"2020-02-23 01:00:00","StationEndTime":"2030-01-01 00:00:00","StationCreateTime":"2020-02-23 01:00:00","StationModifyTime":"2021-02-24 15:01:00","StationLastTime":"2021-02-23 18:02:33","ProjectName":"系统测试工程","StationConditionList":[]}]
         * ProjectStationStatus : {"Total":3,"Online":0,"Error":0,"Warning":0,"Offline":3}
         */

        private String ProjectUUID;
        private String ProjectPrincipalUUID;
        private String ProjectName;
        private String ProjectAddress;
        private String ProjectPrincipalName;
        private String ProjectPrincipalMobile;
        private String ProjectStartTime;
        private String ProjectEndTime;
        private String ProjectStatus;
        private String ProjectCreateTime;
        private String ProjectModifyTime;
        private ProjectStationStatusBean ProjectStationStatus;
        private List<StationListBean> StationList;

        public String getProjectUUID() {
            return ProjectUUID;
        }

        public void setProjectUUID(String ProjectUUID) {
            this.ProjectUUID = ProjectUUID;
        }

        public String getProjectPrincipalUUID() {
            return ProjectPrincipalUUID;
        }

        public void setProjectPrincipalUUID(String ProjectPrincipalUUID) {
            this.ProjectPrincipalUUID = ProjectPrincipalUUID;
        }

        public String getProjectName() {
            return ProjectName;
        }

        public void setProjectName(String ProjectName) {
            this.ProjectName = ProjectName;
        }

        public String getProjectAddress() {
            return ProjectAddress;
        }

        public void setProjectAddress(String ProjectAddress) {
            this.ProjectAddress = ProjectAddress;
        }

        public String getProjectPrincipalName() {
            return ProjectPrincipalName;
        }

        public void setProjectPrincipalName(String ProjectPrincipalName) {
            this.ProjectPrincipalName = ProjectPrincipalName;
        }

        public String getProjectPrincipalMobile() {
            return ProjectPrincipalMobile;
        }

        public void setProjectPrincipalMobile(String ProjectPrincipalMobile) {
            this.ProjectPrincipalMobile = ProjectPrincipalMobile;
        }

        public String getProjectStartTime() {
            return ProjectStartTime;
        }

        public void setProjectStartTime(String ProjectStartTime) {
            this.ProjectStartTime = ProjectStartTime;
        }

        public String getProjectEndTime() {
            return ProjectEndTime;
        }

        public void setProjectEndTime(String ProjectEndTime) {
            this.ProjectEndTime = ProjectEndTime;
        }

        public String getProjectStatus() {
            return ProjectStatus;
        }

        public void setProjectStatus(String ProjectStatus) {
            this.ProjectStatus = ProjectStatus;
        }

        public String getProjectCreateTime() {
            return ProjectCreateTime;
        }

        public void setProjectCreateTime(String ProjectCreateTime) {
            this.ProjectCreateTime = ProjectCreateTime;
        }

        public String getProjectModifyTime() {
            return ProjectModifyTime;
        }

        public void setProjectModifyTime(String ProjectModifyTime) {
            this.ProjectModifyTime = ProjectModifyTime;
        }

        public ProjectStationStatusBean getProjectStationStatus() {
            return ProjectStationStatus;
        }

        public void setProjectStationStatus(ProjectStationStatusBean ProjectStationStatus) {
            this.ProjectStationStatus = ProjectStationStatus;
        }

        public List<StationListBean> getStationList() {
            return StationList;
        }

        public void setStationList(List<StationListBean> StationList) {
            this.StationList = StationList;
        }

        public static class ProjectStationStatusBean {
            /**
             * Total : 3
             * Online : 0
             * Error : 0
             * Warning : 0
             * Offline : 3
             */

            private int Total;
            private int Online;
            private int Error;
            private int Warning;
            private int Offline;

            public int getTotal() {
                return Total;
            }

            public void setTotal(int Total) {
                this.Total = Total;
            }

            public int getOnline() {
                return Online;
            }

            public void setOnline(int Online) {
                this.Online = Online;
            }

            public int getError() {
                return Error;
            }

            public void setError(int Error) {
                this.Error = Error;
            }

            public int getWarning() {
                return Warning;
            }

            public void setWarning(int Warning) {
                this.Warning = Warning;
            }

            public int getOffline() {
                return Offline;
            }

            public void setOffline(int Offline) {
                this.Offline = Offline;
            }
        }

        public static class StationListBean {
            /**
             * StationUUID : dcbe771b-b3fa-efad-ff4b-fabc0a1841d6
             * DeviceUUID : dcbe771b-b3fa-efad-ff4b-fabc0a1841d6
             * ProjectUUID : 1febf7af-2159-6218-16b2-91d14c8dd186
             * StationName : 监测点1
             * StationType : 1
             * StationAddress : 北京
             * StationLongitude : 116.480998473333
             * StationLatitude : 39.872120703333
             * StationAltitude : 57.613500000000
             * StationModel : 设备型号
             * StationSerialNumber : 设备序列号
             * StationBatchNumber : 生产批号
             * StationProductDate : 2020-01-02 00:00:00
             * StationManufacturer : BDJC
             * StationMAC : 00:00:00:00:00
             * StationIMSI : IMSI
             * StationICCID : ICCID
             * StationGNSSInfo : GNSSInfo
             * StationPrincipleName :
             * StationPrincipleMobile :
             * StationStatus : 20
             * StationStatusDetail : 离线(监测点超过900秒无上报)
             * StationStartTime : 2020-02-23 02:00:00
             * StationEndTime : 2030-01-01 00:00:00
             * StationCreateTime : 2020-02-23 02:00:00
             * StationModifyTime : 2021-02-24 11:22:01
             * StationLastTime : 2021-02-23 15:53:52
             * ProjectName : 系统测试工程
             * StationConditionList : []
             */

            private String StationUUID;
            private String DeviceUUID;
            private String ProjectUUID;
            private String StationName;
            private String StationType;
            private String StationAddress;
            private String StationLongitude;
            private String StationLatitude;
            private String StationAltitude;
            private String StationModel;
            private String StationSerialNumber;
            private String StationBatchNumber;
            private String StationProductDate;
            private String StationManufacturer;
            private String StationMAC;
            private String StationIMSI;
            private String StationICCID;
            private String StationGNSSInfo;
            private String StationPrincipleName;
            private String StationPrincipleMobile;
            private String StationStatus;
            private String StationStatusDetail;
            private String StationStartTime;
            private String StationEndTime;
            private String StationCreateTime;
            private String StationModifyTime;
            private String StationLastTime;
            private String ProjectName;
            private List<?> StationConditionList;

            public String getStationUUID() {
                return StationUUID;
            }

            public void setStationUUID(String StationUUID) {
                this.StationUUID = StationUUID;
            }

            public String getDeviceUUID() {
                return DeviceUUID;
            }

            public void setDeviceUUID(String DeviceUUID) {
                this.DeviceUUID = DeviceUUID;
            }

            public String getProjectUUID() {
                return ProjectUUID;
            }

            public void setProjectUUID(String ProjectUUID) {
                this.ProjectUUID = ProjectUUID;
            }

            public String getStationName() {
                return StationName;
            }

            public void setStationName(String StationName) {
                this.StationName = StationName;
            }

            public String getStationType() {
                return StationType;
            }

            public void setStationType(String StationType) {
                this.StationType = StationType;
            }

            public String getStationAddress() {
                return StationAddress;
            }

            public void setStationAddress(String StationAddress) {
                this.StationAddress = StationAddress;
            }

            public String getStationLongitude() {
                return StationLongitude;
            }

            public void setStationLongitude(String StationLongitude) {
                this.StationLongitude = StationLongitude;
            }

            public String getStationLatitude() {
                return StationLatitude;
            }

            public void setStationLatitude(String StationLatitude) {
                this.StationLatitude = StationLatitude;
            }

            public String getStationAltitude() {
                return StationAltitude;
            }

            public void setStationAltitude(String StationAltitude) {
                this.StationAltitude = StationAltitude;
            }

            public String getStationModel() {
                return StationModel;
            }

            public void setStationModel(String StationModel) {
                this.StationModel = StationModel;
            }

            public String getStationSerialNumber() {
                return StationSerialNumber;
            }

            public void setStationSerialNumber(String StationSerialNumber) {
                this.StationSerialNumber = StationSerialNumber;
            }

            public String getStationBatchNumber() {
                return StationBatchNumber;
            }

            public void setStationBatchNumber(String StationBatchNumber) {
                this.StationBatchNumber = StationBatchNumber;
            }

            public String getStationProductDate() {
                return StationProductDate;
            }

            public void setStationProductDate(String StationProductDate) {
                this.StationProductDate = StationProductDate;
            }

            public String getStationManufacturer() {
                return StationManufacturer;
            }

            public void setStationManufacturer(String StationManufacturer) {
                this.StationManufacturer = StationManufacturer;
            }

            public String getStationMAC() {
                return StationMAC;
            }

            public void setStationMAC(String StationMAC) {
                this.StationMAC = StationMAC;
            }

            public String getStationIMSI() {
                return StationIMSI;
            }

            public void setStationIMSI(String StationIMSI) {
                this.StationIMSI = StationIMSI;
            }

            public String getStationICCID() {
                return StationICCID;
            }

            public void setStationICCID(String StationICCID) {
                this.StationICCID = StationICCID;
            }

            public String getStationGNSSInfo() {
                return StationGNSSInfo;
            }

            public void setStationGNSSInfo(String StationGNSSInfo) {
                this.StationGNSSInfo = StationGNSSInfo;
            }

            public String getStationPrincipleName() {
                return StationPrincipleName;
            }

            public void setStationPrincipleName(String StationPrincipleName) {
                this.StationPrincipleName = StationPrincipleName;
            }

            public String getStationPrincipleMobile() {
                return StationPrincipleMobile;
            }

            public void setStationPrincipleMobile(String StationPrincipleMobile) {
                this.StationPrincipleMobile = StationPrincipleMobile;
            }

            public String getStationStatus() {
                return StationStatus;
            }

            public void setStationStatus(String StationStatus) {
                this.StationStatus = StationStatus;
            }

            public String getStationStatusDetail() {
                return StationStatusDetail;
            }

            public void setStationStatusDetail(String StationStatusDetail) {
                this.StationStatusDetail = StationStatusDetail;
            }

            public String getStationStartTime() {
                return StationStartTime;
            }

            public void setStationStartTime(String StationStartTime) {
                this.StationStartTime = StationStartTime;
            }

            public String getStationEndTime() {
                return StationEndTime;
            }

            public void setStationEndTime(String StationEndTime) {
                this.StationEndTime = StationEndTime;
            }

            public String getStationCreateTime() {
                return StationCreateTime;
            }

            public void setStationCreateTime(String StationCreateTime) {
                this.StationCreateTime = StationCreateTime;
            }

            public String getStationModifyTime() {
                return StationModifyTime;
            }

            public void setStationModifyTime(String StationModifyTime) {
                this.StationModifyTime = StationModifyTime;
            }

            public String getStationLastTime() {
                return StationLastTime;
            }

            public void setStationLastTime(String StationLastTime) {
                this.StationLastTime = StationLastTime;
            }

            public String getProjectName() {
                return ProjectName;
            }

            public void setProjectName(String ProjectName) {
                this.ProjectName = ProjectName;
            }

            public List<?> getStationConditionList() {
                return StationConditionList;
            }

            public void setStationConditionList(List<?> StationConditionList) {
                this.StationConditionList = StationConditionList;
            }
        }
    }
}
