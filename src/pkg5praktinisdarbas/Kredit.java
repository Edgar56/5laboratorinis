/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5praktinisdarbas;

/**
 *
 * @author VerGil
 */
public class Kredit {
    
    
    private double palukanos = 0.0;
    private double Paskola = 0.0;
    private int laikotarpis = 0;
    private double MonthPmt = 0.0;
    private double R = 0.0;
    private double F = 0.0;
    private double Total = 0.0;
    private double Pajamos = 0.0;
    private double Pelnas = 0.0;
    private double vaikuislaidos = 0.0;
    private double isiskolinimai = 0.0;
    private int vaikukiekis = 0;

    public double getPalukanos() {
        return palukanos;
    }

    public double getPaskola() {
        return Paskola;
    }

    public int getLaikotarpis() {
        return laikotarpis;
    }

    public double getMonthPmt() {
        return MonthPmt;
    }

    public double getR() {
        return R;
    }

    public double getF() {
        return F;
    }

    public double getTotal() {
        return Total;
    }

    public double getPajamos() {
        return Pajamos;
    }

    public double getPelnas() {
        return Pelnas;
    }

    public double getVaikuislaidos() {
        return vaikuislaidos;
    }

    public double getIsiskolinimai() {
        return isiskolinimai;
    }

    public int getVaikukiekis() {
        return vaikukiekis;
    }

    public void setPalukanos(double palukanos) {
        this.palukanos = palukanos;
    }

    public void setPaskola(double Paskola) {
        this.Paskola = Paskola;
    }

    public void setLaikotarpis(int laikotarpis) {
        this.laikotarpis = laikotarpis;
    }

    public void setMonthPmt(double MonthPmt) {
        this.MonthPmt = MonthPmt;
    }

    public void setR(double R) {
        this.R = R;
    }

    public void setF(double F) {
        this.F = F;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setPajamos(double Pajamos) {
        this.Pajamos = Pajamos;
    }

    public void setPelnas(double Pelnas) {
        this.Pelnas = Pelnas;
    }

    public void setVaikuislaidos(double vaikuislaidos) {
        this.vaikuislaidos = vaikuislaidos;
    }

    public void setIsiskolinimai(double isiskolinimai) {
        this.isiskolinimai = isiskolinimai;
    }

    public void setVaikukiekis(int vaikukiekis) {
        this.vaikukiekis = vaikukiekis;
    }
    
    /**
     *
     * @return
     */
    double Check_Paskola ()
    {
        return 0.4 * getPajamos() * (getIsiskolinimai() - (getVaikukiekis() * getVaikuislaidos()));          
        }
    double Check_Paskola_2 (){
       return 0.4 * getPajamos() * (getIsiskolinimai() - (getVaikukiekis() * getVaikuislaidos()));
    }
    }
    

