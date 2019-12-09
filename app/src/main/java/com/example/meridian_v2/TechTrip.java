package com.example.meridian_v2;

public class TechTrip {

    private String techTripNum = "";
    private String relatedBirdSurv = "";
    private String mileage = "";
    private String siteVisitComments = "";
    private String BRT = "";
    private String techIssues = "";
    private String issueDevice = "";
    private String issueDetails = "";
    private String techExperFeed = "";
    private String techExperFeedDate = "";
    private String startTimeIntDate = "";
    private String startTimeIntTime = "";
    private String timeOutIntDate = "";
    private String timeOutIntTime = "";
    private String startTimeExtDate = "";
    private String startTimeExtTime = "";
    private String timeOutExtDate = "";
    private String timeOutExtTime = "";

    public String getTechTripNum() {
        return techTripNum;
    }

    public void setTechTripNum(String techTripNum) {
        this.techTripNum = techTripNum;
    }

    public String getRelatedBirdSurv() {
        return relatedBirdSurv;
    }

    public void setRelatedBirdSurv(String relatedBirdSurv) {
        this.relatedBirdSurv = relatedBirdSurv;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getSiteVisitComments() {
        return siteVisitComments;
    }

    public void setSiteVisitComments(String siteVisitComments) {
        this.siteVisitComments = siteVisitComments;
    }

    public String getBRT() {
        return BRT;
    }

    public void setBRT(String BRT) {
        this.BRT = BRT;
    }

    public String getTechIssues() {
        return techIssues;
    }

    public void setTechIssues(String techIssues) {
        this.techIssues = techIssues;
    }

    public String getIssueDevice() {
        return issueDevice;
    }

    public void setIssueDevice(String issueDevice) {
        this.issueDevice = issueDevice;
    }

    public String getIssueDetails() {
        return issueDetails;
    }

    public void setIssueDetails(String issueDetails) {
        this.issueDetails = issueDetails;
    }

    public String getTechExperFeed() {
        return techExperFeed;
    }

    public void setTechExperFeed(String techExperFeed) {
        this.techExperFeed = techExperFeed;
    }

    public String getTechExperFeedDate() {
        return techExperFeedDate;
    }

    public void setTechExperFeedDate(String techExperFeedDate) {
        this.techExperFeedDate = techExperFeedDate;
    }

    public String getStartTimeIntDate() {
        return startTimeIntDate;
    }

    public void setStartTimeIntDate(String startTimeIntDate) {
        this.startTimeIntDate = startTimeIntDate;
    }

    public String getStartTimeIntTime() {
        return startTimeIntTime;
    }

    public void setStartTimeIntTime(String startTimeIntTime) {
        this.startTimeIntTime = startTimeIntTime;
    }

    public String getTimeOutIntDate() {
        return timeOutIntDate;
    }

    public void setTimeOutIntDate(String timeOutIntDate) {
        this.timeOutIntDate = timeOutIntDate;
    }

    public String getTimeOutIntTime() {
        return timeOutIntTime;
    }

    public void setTimeOutIntTime(String timeOutIntTime) {
        this.timeOutIntTime = timeOutIntTime;
    }

    public String getStartTimeExtDate() {
        return startTimeExtDate;
    }

    public void setStartTimeExtDate(String startTimeExtDate) {
        this.startTimeExtDate = startTimeExtDate;
    }

    public String getStartTimeExtTime() {
        return startTimeExtTime;
    }

    public void setStartTimeExtTime(String startTimeExtTime) {
        this.startTimeExtTime = startTimeExtTime;
    }

    public String getTimeOutExtDate() {
        return timeOutExtDate;
    }

    public void setTimeOutExtDate(String timeOutExtDate) {
        this.timeOutExtDate = timeOutExtDate;
    }

    public String getTimeOutExtTime() {
        return timeOutExtTime;
    }

    public void setTimeOutExtTime(String timeOutExtTime) {
        this.timeOutExtTime = timeOutExtTime;
    }

    public void saveForm(){

        ; //TODO Write Function that pulls all data and writes to file (possible XML)

    }

    public void testPrint(){

        ; //TODO Write Function that outputs content of all variables to screen

    }

    public void checkVariables(){

        ; //TODO write function that checks error prone variables

    }

    public boolean checkConnection(){

        //TODO write function that verifys connection to SalesForce server

        return true;
    }

    public void attachTechTrip(){

        ;//TODO write function that attempts to upload form to server

    }


}