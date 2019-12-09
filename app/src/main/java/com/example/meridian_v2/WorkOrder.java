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






}
