package com.example.meridian_v2;



public class BirdSurvey {



     private String[] walmartSurveys = null;
     private String[] lowesSurveys = null;
     private String[] assignedBRTs = null;
     private String[] accountStr = null;

     private String prevOpProbIdent = "";
     private String prevPtsEntProbsIdent = "";
     private String prevSanitProbIdent = "";
     private String mngrChkdWith = "";
     private String chkdInMngrTitl = "";
     private String othrOperPracts = "";
     private String operRecomnds = "";
     private String othrPossEntPoints = "";
     private String entryPointRecs = "";
     private String othrSanItems = "";
     private String sanRecomnds = "";
     private String typeOfProtSpec = "";
     private String descrbBatAct = "";
     private String jobSummry = "";
     private String typeOfProtSpecCap = "";
     private String typeOfOthrBrdsRem = "";
     private String resNxtStep = "";
     private String structType = "";
     private String sigName = "";
     private String sigRole = "";
     private String linkCapSig = "";

     private int numNestInt = 0;
     private int numNestExt = 0;
     private int houseSparQtyIntEst = 0;
     private int starQtyIntEst = 0;
     private int pigeQtyIntEst = 0;
     private int hawkQtyIntEst = 0;
     private int houseSparQtyExtEst = 0;
     private int starQtyExtEst = 0;
     private int pigeQtyExtEst = 0;
     private int hawkQtyExtEst = 0;
     private int numNestRemInt = 0;
     private int numNestRemExt = 0;
     private int houseSparQtyInt = 0;
     private int starQtyInt = 0;
     private int pigeQtyInt = 0;
     private int hawkQtyInt = 0;
     private int houseSparQtyExt = 0;
     private int starQtyExt = 0;
     private int pigeQtyExt = 0;
     private int hawkQtyExt = 0;
     private int numOfNativeBrdRem = 0;
     private int numOfOthrBrdRem = 0;



     private boolean frntDrOpn = false;
     private boolean cartDrOpn = false;
     private boolean grdnCentDrOpn = false;
     private boolean recvnDrOpn = false;
     private boolean delvryBayDrOpn = false;
     private boolean TLEDrOpn = false;
     private boolean drGrtr10 = false;
     private boolean seedStrdLexanOut = false;
     private boolean noIssues = false;
     private boolean holeInWall = false;
     private boolean gapsArounRaftEnd = false;
     private boolean condenLines = false;
     private boolean TLEWall = false;
     private boolean gardnCtrWall = false;
     private boolean gapDocPlats = false;
     private boolean doorway = false;
     private boolean noEntIssNoted = false;
     private boolean trshFrntStr = false;
     private boolean trshComp = false;
     private boolean roostOvrDoors = false;
     private boolean spilledSeed = false;
     private boolean spilledPetFood= false;
     private boolean nestsInt = false;
     private boolean nestsExt = false;
     private boolean prodDmg = false;
     private boolean brdDrpWrkspce = false;
     private boolean noSanIssNoted = false;
     private boolean batActivity = false;
     private boolean likelyToRec = true;



    public String[] getWalmartSurveys() {
        return walmartSurveys;
    }

    public void setWalmartSurveys(String[] walmartSurveys) {
        this.walmartSurveys = walmartSurveys;
    }

    public String[] getLowesSurveys() {
        return lowesSurveys;
    }

    public void setLowesSurveys(String[] lowesSurveys) {
        this.lowesSurveys = lowesSurveys;
    }

    public String[] getAssignedBRTs() {
        return assignedBRTs;
    }

    public void setAssignedBRTs(String[] assignedBRTs) {
        this.assignedBRTs = assignedBRTs;
    }

    public String[] getAccountStr() {
        return accountStr;
    }

    public void setAccountStr(String[] accountStr) {
        this.accountStr = accountStr;
    }

    public String getPrevOpProbIdent() {
        return prevOpProbIdent;
    }

    public void setPrevOpProbIdent(String prevOpProbIdent) {
        this.prevOpProbIdent = prevOpProbIdent;
    }

    public String getPrevPtsEntProbsIdent() {
        return prevPtsEntProbsIdent;
    }

    public void setPrevPtsEntProbsIdent(String prevPtsEntProbsIdent) {
        this.prevPtsEntProbsIdent = prevPtsEntProbsIdent;
    }

    public String getPrevSanitProbIdent() {
        return prevSanitProbIdent;
    }

    public void setPrevSanitProbIdent(String prevSanitProbIdent) {
        this.prevSanitProbIdent = prevSanitProbIdent;
    }

    public String getMngrChkdWith() {
        return mngrChkdWith;
    }

    public void setMngrChkdWith(String mngrChkdWith) {
        this.mngrChkdWith = mngrChkdWith;
    }

    public String getChkdInMngrTitl() {
        return chkdInMngrTitl;
    }

    public void setChkdInMngrTitl(String chkdInMngrTitl) {
        this.chkdInMngrTitl = chkdInMngrTitl;
    }

    public String getOthrOperPracts() {
        return othrOperPracts;
    }

    public void setOthrOperPracts(String othrOperPracts) {
        this.othrOperPracts = othrOperPracts;
    }

    public String getOperRecomnds() {
        return operRecomnds;
    }

    public void setOperRecomnds(String operRecomnds) {
        this.operRecomnds = operRecomnds;
    }

    public String getOthrPossEntPoints() {
        return othrPossEntPoints;
    }

    public void setOthrPossEntPoints(String othrPossEntPoints) {
        this.othrPossEntPoints = othrPossEntPoints;
    }

    public String getEntryPointRecs() {
        return entryPointRecs;
    }

    public void setEntryPointRecs(String entryPointRecs) {
        this.entryPointRecs = entryPointRecs;
    }

    public String getOthrSanItems() {
        return othrSanItems;
    }

    public void setOthrSanItems(String othrSanItems) {
        this.othrSanItems = othrSanItems;
    }

    public String getSanRecomnds() {
        return sanRecomnds;
    }

    public void setSanRecomnds(String sanRecomnds) {
        this.sanRecomnds = sanRecomnds;
    }

    public String getTypeOfProtSpec() {
        return typeOfProtSpec;
    }

    public void setTypeOfProtSpec(String typeOfProtSpec) {
        this.typeOfProtSpec = typeOfProtSpec;
    }

    public String getDescrbBatAct() {
        return descrbBatAct;
    }

    public void setDescrbBatAct(String descrbBatAct) {
        this.descrbBatAct = descrbBatAct;
    }

    public String getJobSummry() {
        return jobSummry;
    }

    public void setJobSummry(String jobSummry) {
        this.jobSummry = jobSummry;
    }

    public String getTypeOfProtSpecCap() {
        return typeOfProtSpecCap;
    }

    public void setTypeOfProtSpecCap(String typeOfProtSpecCap) {
        this.typeOfProtSpecCap = typeOfProtSpecCap;
    }

    public String getTypeOfOthrBrdsRem() {
        return typeOfOthrBrdsRem;
    }

    public void setTypeOfOthrBrdsRem(String typeOfOthrBrdsRem) {
        this.typeOfOthrBrdsRem = typeOfOthrBrdsRem;
    }

    public String getResNxtStep() {
        return resNxtStep;
    }

    public void setResNxtStep(String resNxtStep) {
        this.resNxtStep = resNxtStep;
    }

    public String getStructType() {
        return structType;
    }

    public void setStructType(String structType) {
        this.structType = structType;
    }

    public String getSigName() {
        return sigName;
    }

    public void setSigName(String sigName) {
        this.sigName = sigName;
    }

    public String getSigRole() {
        return sigRole;
    }

    public void setSigRole(String sigRole) {
        this.sigRole = sigRole;
    }

    public String getLinkCapSig() {
        return linkCapSig;
    }

    public void setLinkCapSig(String linkCapSig) {
        this.linkCapSig = linkCapSig;
    }

    public int getNumNestInt() {
        return numNestInt;
    }

    public void setNumNestInt(int numNestInt) {
        this.numNestInt = numNestInt;
    }

    public int getNumNestExt() {
        return numNestExt;
    }

    public void setNumNestExt(int numNestExt) {
        this.numNestExt = numNestExt;
    }

    public int getHouseSparQtyIntEst() {
        return houseSparQtyIntEst;
    }

    public void setHouseSparQtyIntEst(int houseSparQtyIntEst) {
        this.houseSparQtyIntEst = houseSparQtyIntEst;
    }

    public int getStarQtyIntEst() {
        return starQtyIntEst;
    }

    public void setStarQtyIntEst(int starQtyIntEst) {
        this.starQtyIntEst = starQtyIntEst;
    }

    public int getPigeQtyIntEst() {
        return pigeQtyIntEst;
    }

    public void setPigeQtyIntEst(int pigeQtyIntEst) {
        this.pigeQtyIntEst = pigeQtyIntEst;
    }

    public int getHawkQtyIntEst() {
        return hawkQtyIntEst;
    }

    public void setHawkQtyIntEst(int hawkQtyIntEst) {
        this.hawkQtyIntEst = hawkQtyIntEst;
    }

    public int getHouseSparQtyExtEst() {
        return houseSparQtyExtEst;
    }

    public void setHouseSparQtyExtEst(int houseSparQtyExtEst) {
        this.houseSparQtyExtEst = houseSparQtyExtEst;
    }

    public int getStarQtyExtEst() {
        return starQtyExtEst;
    }

    public void setStarQtyExtEst(int starQtyExtEst) {
        this.starQtyExtEst = starQtyExtEst;
    }

    public int getPigeQtyExtEst() {
        return pigeQtyExtEst;
    }

    public void setPigeQtyExtEst(int pigeQtyExtEst) {
        this.pigeQtyExtEst = pigeQtyExtEst;
    }

    public int getHawkQtyExtEst() {
        return hawkQtyExtEst;
    }

    public void setHawkQtyExtEst(int hawkQtyExtEst) {
        this.hawkQtyExtEst = hawkQtyExtEst;
    }

    public int getNumNestRemInt() {
        return numNestRemInt;
    }

    public void setNumNestRemInt(int numNestRemInt) {
        this.numNestRemInt = numNestRemInt;
    }

    public int getNumNestRemExt() {
        return numNestRemExt;
    }

    public void setNumNestRemExt(int numNestRemExt) {
        this.numNestRemExt = numNestRemExt;
    }

    public int getHouseSparQtyInt() {
        return houseSparQtyInt;
    }

    public void setHouseSparQtyInt(int houseSparQtyInt) {
        this.houseSparQtyInt = houseSparQtyInt;
    }

    public int getStarQtyInt() {
        return starQtyInt;
    }

    public void setStarQtyInt(int starQtyInt) {
        this.starQtyInt = starQtyInt;
    }

    public int getPigeQtyInt() {
        return pigeQtyInt;
    }

    public void setPigeQtyInt(int pigeQtyInt) {
        this.pigeQtyInt = pigeQtyInt;
    }

    public int getHawkQtyInt() {
        return hawkQtyInt;
    }

    public void setHawkQtyInt(int hawkQtyInt) {
        this.hawkQtyInt = hawkQtyInt;
    }

    public int getHouseSparQtyExt() {
        return houseSparQtyExt;
    }

    public void setHouseSparQtyExt(int houseSparQtyExt) {
        this.houseSparQtyExt = houseSparQtyExt;
    }

    public int getStarQtyExt() {
        return starQtyExt;
    }

    public void setStarQtyExt(int starQtyExt) {
        this.starQtyExt = starQtyExt;
    }

    public int getPigeQtyExt() {
        return pigeQtyExt;
    }

    public void setPigeQtyExt(int pigeQtyExt) {
        this.pigeQtyExt = pigeQtyExt;
    }

    public int getHawkQtyExt() {
        return hawkQtyExt;
    }

    public void setHawkQtyExt(int hawkQtyExt) {
        this.hawkQtyExt = hawkQtyExt;
    }

    public int getNumOfNativeBrdRem() {
        return numOfNativeBrdRem;
    }

    public void setNumOfNativeBrdRem(int numOfNativeBrdRem) {
        this.numOfNativeBrdRem = numOfNativeBrdRem;
    }

    public int getNumOfOthrBrdRem() {
        return numOfOthrBrdRem;
    }

    public void setNumOfOthrBrdRem(int numOfOthrBrdRem) {
        this.numOfOthrBrdRem = numOfOthrBrdRem;
    }

    public boolean isFrntDrOpn() {
        return frntDrOpn;
    }

    public void setFrntDrOpn(boolean frntDrOpn) {
        this.frntDrOpn = frntDrOpn;
    }

    public boolean isCartDrOpn() {
        return cartDrOpn;
    }

    public void setCartDrOpn(boolean cartDrOpn) {
        this.cartDrOpn = cartDrOpn;
    }

    public boolean isGrdnCentDrOpn() {
        return grdnCentDrOpn;
    }

    public void setGrdnCentDrOpn(boolean grdnCentDrOpn) {
        this.grdnCentDrOpn = grdnCentDrOpn;
    }

    public boolean isRecvnDrOpn() {
        return recvnDrOpn;
    }

    public void setRecvnDrOpn(boolean recvnDrOpn) {
        this.recvnDrOpn = recvnDrOpn;
    }

    public boolean isDelvryBayDrOpn() {
        return delvryBayDrOpn;
    }

    public void setDelvryBayDrOpn(boolean delvryBayDrOpn) {
        this.delvryBayDrOpn = delvryBayDrOpn;
    }

    public boolean isTLEDrOpn() {
        return TLEDrOpn;
    }

    public void setTLEDrOpn(boolean TLEDrOpn) {
        this.TLEDrOpn = TLEDrOpn;
    }

    public boolean isDrGrtr10() {
        return drGrtr10;
    }

    public void setDrGrtr10(boolean drGrtr10) {
        this.drGrtr10 = drGrtr10;
    }

    public boolean isSeedStrdLexanOut() {
        return seedStrdLexanOut;
    }

    public void setSeedStrdLexanOut(boolean seedStrdLexanOut) {
        this.seedStrdLexanOut = seedStrdLexanOut;
    }

    public boolean isNoIssues() {
        return noIssues;
    }

    public void setNoIssues(boolean noIssues) {
        this.noIssues = noIssues;
    }

    public boolean isHoleInWall() {
        return holeInWall;
    }

    public void setHoleInWall(boolean holeInWall) {
        this.holeInWall = holeInWall;
    }

    public boolean isGapsArounRaftEnd() {
        return gapsArounRaftEnd;
    }

    public void setGapsArounRaftEnd(boolean gapsArounRaftEnd) {
        this.gapsArounRaftEnd = gapsArounRaftEnd;
    }

    public boolean isCondenLines() {
        return condenLines;
    }

    public void setCondenLines(boolean condenLines) {
        this.condenLines = condenLines;
    }

    public boolean isTLEWall() {
        return TLEWall;
    }

    public void setTLEWall(boolean TLEWall) {
        this.TLEWall = TLEWall;
    }

    public boolean isGardnCtrWall() {
        return gardnCtrWall;
    }

    public void setGardnCtrWall(boolean gardnCtrWall) {
        this.gardnCtrWall = gardnCtrWall;
    }

    public boolean isGapDocPlats() {
        return gapDocPlats;
    }

    public void setGapDocPlats(boolean gapDocPlats) {
        this.gapDocPlats = gapDocPlats;
    }

    public boolean isDoorway() {
        return doorway;
    }

    public void setDoorway(boolean doorway) {
        this.doorway = doorway;
    }

    public boolean isNoEntIssNoted() {
        return noEntIssNoted;
    }

    public void setNoEntIssNoted(boolean noEntIssNoted) {
        this.noEntIssNoted = noEntIssNoted;
    }

    public boolean isTrshFrntStr() {
        return trshFrntStr;
    }

    public void setTrshFrntStr(boolean trshFrntStr) {
        this.trshFrntStr = trshFrntStr;
    }

    public boolean isTrshComp() {
        return trshComp;
    }

    public void setTrshComp(boolean trshComp) {
        this.trshComp = trshComp;
    }

    public boolean isRoostOvrDoors() {
        return roostOvrDoors;
    }

    public void setRoostOvrDoors(boolean roostOvrDoors) {
        this.roostOvrDoors = roostOvrDoors;
    }

    public boolean isSpilledSeed() {
        return spilledSeed;
    }

    public void setSpilledSeed(boolean spilledSeed) {
        this.spilledSeed = spilledSeed;
    }

    public boolean isSpilledPetFood() {
        return spilledPetFood;
    }

    public void setSpilledPetFood(boolean spilledPetFood) {
        this.spilledPetFood = spilledPetFood;
    }

    public boolean isNestsInt() {
        return nestsInt;
    }

    public void setNestsInt(boolean nestsInt) {
        this.nestsInt = nestsInt;
    }

    public boolean isNestsExt() {
        return nestsExt;
    }

    public void setNestsExt(boolean nestsExt) {
        this.nestsExt = nestsExt;
    }

    public boolean isProdDmg() {
        return prodDmg;
    }

    public void setProdDmg(boolean prodDmg) {
        this.prodDmg = prodDmg;
    }

    public boolean isBrdDrpWrkspce() {
        return brdDrpWrkspce;
    }

    public void setBrdDrpWrkspce(boolean brdDrpWrkspce) {
        this.brdDrpWrkspce = brdDrpWrkspce;
    }

    public boolean isNoSanIssNoted() {
        return noSanIssNoted;
    }

    public void setNoSanIssNoted(boolean noSanIssNoted) {
        this.noSanIssNoted = noSanIssNoted;
    }

    public boolean isBatActivity() {
        return batActivity;
    }

    public void setBatActivity(boolean batActivity) {
        this.batActivity = batActivity;
    }

    public boolean isLikelyToRec() {
        return likelyToRec;
    }

    public void setLikelyToRec(boolean likelyToRec) {
        this.likelyToRec = likelyToRec;
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

    public void uploadBirdSurvey(){

        ;//TODO write function that attempts to upload form to server

    }



}
