package com.example.meridian_v2;

public class WorkOrder {


    private String[] PSReport ;
    private String[] AssigndBRT ; //TODO create object type that allows for the retrieval of BRTs and their email addresses
    //Reminder that above array will replace the need for the "AssigndBRTMobEmail" and "AssigndBRTContact" arrays.

    private String parentWorkOrd = "";
    private String callerName = "";
    private String StrMngr = "";
    private String contactName = "";
    private String acctName = "";
    private String custWrkOrdNum = "";
    private String sm8JobNotes = "";
    private String nxtServiceDate = "";
    private String servResEntDate = "";
    private String interStatNotes = "";
    private String missedETA = "";
    private String preServAssessOwner = "";
    private String preServCallOwner = "";
    private String PSRepOwner = "";
    private String followCallOwner = "";
    private String WOCRevDate = "";
    private String cancelReason = "";
    private String BRTJobAckDate = "";
    private String BRTJobAckTime = "";
    private String subject = "";
    private String description = "";
    private String successPreServCalls = "";
    private String terms = "";
    private String InternComments = "";
    private String status = "";
    private String followUpStat = "";
    private String WOOrigin = "";
    private String priority = "";
    private String nestRem = "";
    private String otherMiscDetail = "";
    private String PSReportPrior = "";
    private String WORecDate = "";
    private String WORecTime = "";
    private String preServCallCompDate = "";
    private String preServCallCompTime = "";
    private String preServCallContName = "";
    private String birdLocInt = "";
    private String birdLocExt = "";
    private String intSpecies = "";
    private String extSpecies = "";
    private String nestLocInt = "";
    private String nestLocExt = "";
    private String preSServAssesCont = "";
    private String daysNotToServ = "";
    private String jobCat = "";
    private String servStreetAddr = "";
    private String servCity = "";
    private String servState = "";
    private String servZipCode = "";
    private String servCharge = "";
    private String quotedAmt = "";
    private String invoiceNum = "";
    private String quoteNotes = "";
    private String invoiceDate = "";
    private String NTE = "";
    private String paidDate = "";
    private String depositedDate = "";
    private String custLiftCharge = "";
    private String contRevenType = "";
    private String liftCompany = "";
    private String ContRevenTypeValue = "";
    private String liftInvDate = "";
    private String revType = "";
    private String liftInvAmnt = "";
    private String amntPaid = "";
    private String dateApprvd = "";
    private String timeApprvd = "";
    private String propSubDate = "";
    private String propSubTime = "";
    private String dispDate = "";
    private String dispTime = "";
    private String schedVisitDate = "";
    private String schedVisitTime = "";
    private String compDate = "";
    private String compTime = "";
    private String expensTotal = "";
    private String rentalFuelCost = "";
    private String resolved = "";
    private String postServCallCont = "";
    private String verified = "";
    private String surveySub = "";
    private String PSRepToSME = "";
    private String PSRepSub = "";
    private String thankYouRecip = "";
    private String thankYouSent = "";
    private String webName = "";
    private String webEmail = "";
    private String webCompany = "";
    private String webPhone = "";
    private String QARevDate = "";
    private String QARevTime = "";
    private String picReview = "";
    private String returnVisDecis = "";
    private String picReviewCom = "";
    private String QAFollowUp = "";
    private String jobSummary = "";
    private String BRTNxtStepError = "";
    private String jobSumRevComments = "";
    private String reqActions = "";
    private String reqActionsComments = "";
    private String survey = "";
    private String surveyComments = "";
    private String SM8JobUUID = "";
    private String SM8JobNum = "";






    private int birdQtyInt = 0;
    private int birdQtyExt = 0;
    private int nestRemInt = 0;
    private int nestRemExt = 0;
    private int numOfVisitsSurveys = 0;
    private int totalBirdsRem = 0;
    private int countOfOne = 0;



    private boolean redlineOverride = false;
    private boolean trainingJob = false;
    private boolean possNxtDayServ = false;
    private boolean firstWorkNewAcct = false;
    private boolean firstWorkOrdAcctLoc = false;
    private boolean recurrRevenue = false;
    private boolean specAttenWorkOrd = false;
    private boolean interior = false;
    private boolean exterior = false;
    private boolean flockReloc = false;
    private boolean otherMisc = false;
    private boolean pigePresent = false;
    private boolean liftServProv = false;
    private boolean overrideWalmartForm = false;


    public String[] getPSReport() {
        return PSReport;
    }

    public void setPSReport(String[] PSReport) {
        this.PSReport = PSReport;
    }

    public String[] getAssigndBRT() {
        return AssigndBRT;
    }

    public void setAssigndBRT(String[] assigndBRT) {
        AssigndBRT = assigndBRT;
    }

    public String getParentWorkOrd() {
        return parentWorkOrd;
    }

    public void setParentWorkOrd(String parentWorkOrd) {
        this.parentWorkOrd = parentWorkOrd;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getStrMngr() {
        return StrMngr;
    }

    public void setStrMngr(String strMngr) {
        StrMngr = strMngr;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getCustWrkOrdNum() {
        return custWrkOrdNum;
    }

    public void setCustWrkOrdNum(String custWrkOrdNum) {
        this.custWrkOrdNum = custWrkOrdNum;
    }

    public String getSm8JobNotes() {
        return sm8JobNotes;
    }

    public void setSm8JobNotes(String sm8JobNotes) {
        this.sm8JobNotes = sm8JobNotes;
    }

    public String getNxtServiceDate() {
        return nxtServiceDate;
    }

    public void setNxtServiceDate(String nxtServiceDate) {
        this.nxtServiceDate = nxtServiceDate;
    }

    public String getServResEntDate() {
        return servResEntDate;
    }

    public void setServResEntDate(String servResEntDate) {
        this.servResEntDate = servResEntDate;
    }

    public String getInterStatNotes() {
        return interStatNotes;
    }

    public void setInterStatNotes(String interStatNotes) {
        this.interStatNotes = interStatNotes;
    }

    public String getMissedETA() {
        return missedETA;
    }

    public void setMissedETA(String missedETA) {
        this.missedETA = missedETA;
    }

    public String getPreServAssessOwner() {
        return preServAssessOwner;
    }

    public void setPreServAssessOwner(String preServAssessOwner) {
        this.preServAssessOwner = preServAssessOwner;
    }

    public String getPreServCallOwner() {
        return preServCallOwner;
    }

    public void setPreServCallOwner(String preServCallOwner) {
        this.preServCallOwner = preServCallOwner;
    }

    public String getPSRepOwner() {
        return PSRepOwner;
    }

    public void setPSRepOwner(String PSRepOwner) {
        this.PSRepOwner = PSRepOwner;
    }

    public String getFollowCallOwner() {
        return followCallOwner;
    }

    public void setFollowCallOwner(String followCallOwner) {
        this.followCallOwner = followCallOwner;
    }

    public String getWOCRevDate() {
        return WOCRevDate;
    }

    public void setWOCRevDate(String WOCRevDate) {
        this.WOCRevDate = WOCRevDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getBRTJobAckDate() {
        return BRTJobAckDate;
    }

    public void setBRTJobAckDate(String BRTJobAckDate) {
        this.BRTJobAckDate = BRTJobAckDate;
    }

    public String getBRTJobAckTime() {
        return BRTJobAckTime;
    }

    public void setBRTJobAckTime(String BRTJobAckTime) {
        this.BRTJobAckTime = BRTJobAckTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuccessPreServCalls() {
        return successPreServCalls;
    }

    public void setSuccessPreServCalls(String successPreServCalls) {
        this.successPreServCalls = successPreServCalls;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getInternComments() {
        return InternComments;
    }

    public void setInternComments(String internComments) {
        InternComments = internComments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFollowUpStat() {
        return followUpStat;
    }

    public void setFollowUpStat(String followUpStat) {
        this.followUpStat = followUpStat;
    }

    public String getWOOrigin() {
        return WOOrigin;
    }

    public void setWOOrigin(String WOOrigin) {
        this.WOOrigin = WOOrigin;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNestRem() {
        return nestRem;
    }

    public void setNestRem(String nestRem) {
        this.nestRem = nestRem;
    }

    public String getOtherMiscDetail() {
        return otherMiscDetail;
    }

    public void setOtherMiscDetail(String otherMiscDetail) {
        this.otherMiscDetail = otherMiscDetail;
    }

    public String getPSReportPrior() {
        return PSReportPrior;
    }

    public void setPSReportPrior(String PSReportPrior) {
        this.PSReportPrior = PSReportPrior;
    }

    public String getWORecDate() {
        return WORecDate;
    }

    public void setWORecDate(String WORecDate) {
        this.WORecDate = WORecDate;
    }

    public String getWORecTime() {
        return WORecTime;
    }

    public void setWORecTime(String WORecTime) {
        this.WORecTime = WORecTime;
    }

    public String getPreServCallCompDate() {
        return preServCallCompDate;
    }

    public void setPreServCallCompDate(String preServCallCompDate) {
        this.preServCallCompDate = preServCallCompDate;
    }

    public String getPreServCallCompTime() {
        return preServCallCompTime;
    }

    public void setPreServCallCompTime(String preServCallCompTime) {
        this.preServCallCompTime = preServCallCompTime;
    }

    public String getPreServCallContName() {
        return preServCallContName;
    }

    public void setPreServCallContName(String preServCallContName) {
        this.preServCallContName = preServCallContName;
    }

    public String getBirdLocInt() {
        return birdLocInt;
    }

    public void setBirdLocInt(String birdLocInt) {
        this.birdLocInt = birdLocInt;
    }

    public String getBirdLocExt() {
        return birdLocExt;
    }

    public void setBirdLocExt(String birdLocExt) {
        this.birdLocExt = birdLocExt;
    }

    public String getIntSpecies() {
        return intSpecies;
    }

    public void setIntSpecies(String intSpecies) {
        this.intSpecies = intSpecies;
    }

    public String getExtSpecies() {
        return extSpecies;
    }

    public void setExtSpecies(String extSpecies) {
        this.extSpecies = extSpecies;
    }

    public String getNestLocInt() {
        return nestLocInt;
    }

    public void setNestLocInt(String nestLocInt) {
        this.nestLocInt = nestLocInt;
    }

    public String getNestLocExt() {
        return nestLocExt;
    }

    public void setNestLocExt(String nestLocExt) {
        this.nestLocExt = nestLocExt;
    }

    public String getPreSServAssesCont() {
        return preSServAssesCont;
    }

    public void setPreSServAssesCont(String preSServAssesCont) {
        this.preSServAssesCont = preSServAssesCont;
    }

    public String getDaysNotToServ() {
        return daysNotToServ;
    }

    public void setDaysNotToServ(String daysNotToServ) {
        this.daysNotToServ = daysNotToServ;
    }

    public String getJobCat() {
        return jobCat;
    }

    public void setJobCat(String jobCat) {
        this.jobCat = jobCat;
    }

    public String getServStreetAddr() {
        return servStreetAddr;
    }

    public void setServStreetAddr(String servStreetAddr) {
        this.servStreetAddr = servStreetAddr;
    }

    public String getServCity() {
        return servCity;
    }

    public void setServCity(String servCity) {
        this.servCity = servCity;
    }

    public String getServState() {
        return servState;
    }

    public void setServState(String servState) {
        this.servState = servState;
    }

    public String getServZipCode() {
        return servZipCode;
    }

    public void setServZipCode(String servZipCode) {
        this.servZipCode = servZipCode;
    }

    public String getServCharge() {
        return servCharge;
    }

    public void setServCharge(String servCharge) {
        this.servCharge = servCharge;
    }

    public String getQuotedAmt() {
        return quotedAmt;
    }

    public void setQuotedAmt(String quotedAmt) {
        this.quotedAmt = quotedAmt;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getQuoteNotes() {
        return quoteNotes;
    }

    public void setQuoteNotes(String quoteNotes) {
        this.quoteNotes = quoteNotes;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getNTE() {
        return NTE;
    }

    public void setNTE(String NTE) {
        this.NTE = NTE;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getDepositedDate() {
        return depositedDate;
    }

    public void setDepositedDate(String depositedDate) {
        this.depositedDate = depositedDate;
    }

    public String getCustLiftCharge() {
        return custLiftCharge;
    }

    public void setCustLiftCharge(String custLiftCharge) {
        this.custLiftCharge = custLiftCharge;
    }

    public String getContRevenType() {
        return contRevenType;
    }

    public void setContRevenType(String contRevenType) {
        this.contRevenType = contRevenType;
    }

    public String getLiftCompany() {
        return liftCompany;
    }

    public void setLiftCompany(String liftCompany) {
        this.liftCompany = liftCompany;
    }

    public String getContRevenTypeValue() {
        return ContRevenTypeValue;
    }

    public void setContRevenTypeValue(String contRevenTypeValue) {
        ContRevenTypeValue = contRevenTypeValue;
    }

    public String getLiftInvDate() {
        return liftInvDate;
    }

    public void setLiftInvDate(String liftInvDate) {
        this.liftInvDate = liftInvDate;
    }

    public String getRevType() {
        return revType;
    }

    public void setRevType(String revType) {
        this.revType = revType;
    }

    public String getLiftInvAmnt() {
        return liftInvAmnt;
    }

    public void setLiftInvAmnt(String liftInvAmnt) {
        this.liftInvAmnt = liftInvAmnt;
    }

    public String getAmntPaid() {
        return amntPaid;
    }

    public void setAmntPaid(String amntPaid) {
        this.amntPaid = amntPaid;
    }

    public String getDateApprvd() {
        return dateApprvd;
    }

    public void setDateApprvd(String dateApprvd) {
        this.dateApprvd = dateApprvd;
    }

    public String getTimeApprvd() {
        return timeApprvd;
    }

    public void setTimeApprvd(String timeApprvd) {
        this.timeApprvd = timeApprvd;
    }

    public String getPropSubDate() {
        return propSubDate;
    }

    public void setPropSubDate(String propSubDate) {
        this.propSubDate = propSubDate;
    }

    public String getPropSubTime() {
        return propSubTime;
    }

    public void setPropSubTime(String propSubTime) {
        this.propSubTime = propSubTime;
    }

    public String getDispDate() {
        return dispDate;
    }

    public void setDispDate(String dispDate) {
        this.dispDate = dispDate;
    }

    public String getDispTime() {
        return dispTime;
    }

    public void setDispTime(String dispTime) {
        this.dispTime = dispTime;
    }

    public String getSchedVisitDate() {
        return schedVisitDate;
    }

    public void setSchedVisitDate(String schedVisitDate) {
        this.schedVisitDate = schedVisitDate;
    }

    public String getSchedVisitTime() {
        return schedVisitTime;
    }

    public void setSchedVisitTime(String schedVisitTime) {
        this.schedVisitTime = schedVisitTime;
    }

    public String getCompDate() {
        return compDate;
    }

    public void setCompDate(String compDate) {
        this.compDate = compDate;
    }

    public String getCompTime() {
        return compTime;
    }

    public void setCompTime(String compTime) {
        this.compTime = compTime;
    }

    public String getExpensTotal() {
        return expensTotal;
    }

    public void setExpensTotal(String expensTotal) {
        this.expensTotal = expensTotal;
    }

    public String getRentalFuelCost() {
        return rentalFuelCost;
    }

    public void setRentalFuelCost(String rentalFuelCost) {
        this.rentalFuelCost = rentalFuelCost;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public String getPostServCallCont() {
        return postServCallCont;
    }

    public void setPostServCallCont(String postServCallCont) {
        this.postServCallCont = postServCallCont;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getSurveySub() {
        return surveySub;
    }

    public void setSurveySub(String surveySub) {
        this.surveySub = surveySub;
    }

    public String getPSRepToSME() {
        return PSRepToSME;
    }

    public void setPSRepToSME(String PSRepToSME) {
        this.PSRepToSME = PSRepToSME;
    }

    public String getPSRepSub() {
        return PSRepSub;
    }

    public void setPSRepSub(String PSRepSub) {
        this.PSRepSub = PSRepSub;
    }

    public String getThankYouRecip() {
        return thankYouRecip;
    }

    public void setThankYouRecip(String thankYouRecip) {
        this.thankYouRecip = thankYouRecip;
    }

    public String getThankYouSent() {
        return thankYouSent;
    }

    public void setThankYouSent(String thankYouSent) {
        this.thankYouSent = thankYouSent;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getWebEmail() {
        return webEmail;
    }

    public void setWebEmail(String webEmail) {
        this.webEmail = webEmail;
    }

    public String getWebCompany() {
        return webCompany;
    }

    public void setWebCompany(String webCompany) {
        this.webCompany = webCompany;
    }

    public String getWebPhone() {
        return webPhone;
    }

    public void setWebPhone(String webPhone) {
        this.webPhone = webPhone;
    }

    public String getQARevDate() {
        return QARevDate;
    }

    public void setQARevDate(String QARevDate) {
        this.QARevDate = QARevDate;
    }

    public String getQARevTime() {
        return QARevTime;
    }

    public void setQARevTime(String QARevTime) {
        this.QARevTime = QARevTime;
    }

    public String getPicReview() {
        return picReview;
    }

    public void setPicReview(String picReview) {
        this.picReview = picReview;
    }

    public String getReturnVisDecis() {
        return returnVisDecis;
    }

    public void setReturnVisDecis(String returnVisDecis) {
        this.returnVisDecis = returnVisDecis;
    }

    public String getPicReviewCom() {
        return picReviewCom;
    }

    public void setPicReviewCom(String picReviewCom) {
        this.picReviewCom = picReviewCom;
    }

    public String getQAFollowUp() {
        return QAFollowUp;
    }

    public void setQAFollowUp(String QAFollowUp) {
        this.QAFollowUp = QAFollowUp;
    }

    public String getJobSummary() {
        return jobSummary;
    }

    public void setJobSummary(String jobSummary) {
        this.jobSummary = jobSummary;
    }

    public String getBRTNxtStepError() {
        return BRTNxtStepError;
    }

    public void setBRTNxtStepError(String BRTNxtStepError) {
        this.BRTNxtStepError = BRTNxtStepError;
    }

    public String getJobSumRevComments() {
        return jobSumRevComments;
    }

    public void setJobSumRevComments(String jobSumRevComments) {
        this.jobSumRevComments = jobSumRevComments;
    }

    public String getReqActions() {
        return reqActions;
    }

    public void setReqActions(String reqActions) {
        this.reqActions = reqActions;
    }

    public String getReqActionsComments() {
        return reqActionsComments;
    }

    public void setReqActionsComments(String reqActionsComments) {
        this.reqActionsComments = reqActionsComments;
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public String getSurveyComments() {
        return surveyComments;
    }

    public void setSurveyComments(String surveyComments) {
        this.surveyComments = surveyComments;
    }

    public String getSM8JobUUID() {
        return SM8JobUUID;
    }

    public void setSM8JobUUID(String SM8JobUUID) {
        this.SM8JobUUID = SM8JobUUID;
    }

    public String getSM8JobNum() {
        return SM8JobNum;
    }

    public void setSM8JobNum(String SM8JobNum) {
        this.SM8JobNum = SM8JobNum;
    }

    public int getBirdQtyInt() {
        return birdQtyInt;
    }

    public void setBirdQtyInt(int birdQtyInt) {
        this.birdQtyInt = birdQtyInt;
    }

    public int getBirdQtyExt() {
        return birdQtyExt;
    }

    public void setBirdQtyExt(int birdQtyExt) {
        this.birdQtyExt = birdQtyExt;
    }

    public int getNestRemInt() {
        return nestRemInt;
    }

    public void setNestRemInt(int nestRemInt) {
        this.nestRemInt = nestRemInt;
    }

    public int getNestRemExt() {
        return nestRemExt;
    }

    public void setNestRemExt(int nestRemExt) {
        this.nestRemExt = nestRemExt;
    }

    public int getNumOfVisitsSurveys() {
        return numOfVisitsSurveys;
    }

    public void setNumOfVisitsSurveys(int numOfVisitsSurveys) {
        this.numOfVisitsSurveys = numOfVisitsSurveys;
    }

    public int getTotalBirdsRem() {
        return totalBirdsRem;
    }

    public void setTotalBirdsRem(int totalBirdsRem) {
        this.totalBirdsRem = totalBirdsRem;
    }

    public int getCountOfOne() {
        return countOfOne;
    }

    public void setCountOfOne(int countOfOne) {
        this.countOfOne = countOfOne;
    }

    public boolean isRedlineOverride() {
        return redlineOverride;
    }

    public void setRedlineOverride(boolean redlineOverride) {
        this.redlineOverride = redlineOverride;
    }

    public boolean isTrainingJob() {
        return trainingJob;
    }

    public void setTrainingJob(boolean trainingJob) {
        this.trainingJob = trainingJob;
    }

    public boolean isPossNxtDayServ() {
        return possNxtDayServ;
    }

    public void setPossNxtDayServ(boolean possNxtDayServ) {
        this.possNxtDayServ = possNxtDayServ;
    }

    public boolean isFirstWorkNewAcct() {
        return firstWorkNewAcct;
    }

    public void setFirstWorkNewAcct(boolean firstWorkNewAcct) {
        this.firstWorkNewAcct = firstWorkNewAcct;
    }

    public boolean isFirstWorkOrdAcctLoc() {
        return firstWorkOrdAcctLoc;
    }

    public void setFirstWorkOrdAcctLoc(boolean firstWorkOrdAcctLoc) {
        this.firstWorkOrdAcctLoc = firstWorkOrdAcctLoc;
    }

    public boolean isRecurrRevenue() {
        return recurrRevenue;
    }

    public void setRecurrRevenue(boolean recurrRevenue) {
        this.recurrRevenue = recurrRevenue;
    }

    public boolean isSpecAttenWorkOrd() {
        return specAttenWorkOrd;
    }

    public void setSpecAttenWorkOrd(boolean specAttenWorkOrd) {
        this.specAttenWorkOrd = specAttenWorkOrd;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }

    public boolean isFlockReloc() {
        return flockReloc;
    }

    public void setFlockReloc(boolean flockReloc) {
        this.flockReloc = flockReloc;
    }

    public boolean isOtherMisc() {
        return otherMisc;
    }

    public void setOtherMisc(boolean otherMisc) {
        this.otherMisc = otherMisc;
    }

    public boolean isPigePresent() {
        return pigePresent;
    }

    public void setPigePresent(boolean pigePresent) {
        this.pigePresent = pigePresent;
    }

    public boolean isLiftServProv() {
        return liftServProv;
    }

    public void setLiftServProv(boolean liftServProv) {
        this.liftServProv = liftServProv;
    }

    public boolean isOverrideWalmartForm() {
        return overrideWalmartForm;
    }

    public void setOverrideWalmartForm(boolean overrideWalmartForm) {
        this.overrideWalmartForm = overrideWalmartForm;
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

    public void uploadWorkOrder(){

        ;//TODO write function that attempts to upload form to server

    }
}
