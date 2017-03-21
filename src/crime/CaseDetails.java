/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime;

/**
 *
 * @author mita
 */
public class CaseDetails {

    public int caseID = 0;
    public String VictimNID = "0";
    public String VictimName = "";
    public String CaseDescription = null;
    public String CriminalName = null;
    public String CaseDate = null;

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getVictimNID() {
        return VictimNID;
    }

    public void setVictimNID(String victimNID) {
        VictimNID = victimNID;
    }

    public String getVictimName() {
        return VictimName;
    }

    public void setVictimName(String victimName) {
        VictimName = victimName;
    }

    public String getCaseDescription() {
        return CaseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        CaseDescription = caseDescription;
    }

    public String getCriminalName() {
        return CriminalName;
    }

    public void setCriminalName(String criminalName) {
        CriminalName = criminalName;
    }

    public String getCaseDate() {
        return CaseDate;
    }

    public void setCaseDate(String caseDate) {
        CaseDate = caseDate;
    }
}
