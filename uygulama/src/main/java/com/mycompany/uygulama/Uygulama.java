/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uygulama;

/**
 *
 * @author koses
 */

import java.util.Scanner;
public class Uygulama {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        
    System.out.println("Kaç adet topçu verisi girilecek?");
    int n=scn.nextInt();
    scn.nextLine();//bunu yazmamızın sebebi kullanıcıdan üst üste alınan aynı cins verinin sonunda sistemde karışıklık olmaması için farklı bir veri tipi kullanarak,o çıktı almadan çıkmasını sağlamaktı. bunu birkaç farklı yerde de kullandık.
    int i;
    
    String[] topcu=new String[n]; //futbolcu adları için bir dizi oluşturduk.
    for(i=0;i<n;i++){
        System.out.println((i+1)+(". topçunun adını giriniz:"));
        topcu[i]=scn.nextLine();
    }
    
    int[] mac=new int[n];
    for(i=0;i<n;i++){
        System.out.println(topcu[i]+" maç sayısı");
        mac[i]=scn.nextInt();
        scn.nextLine();
    }
    double[] maas=new double[n];
    for(i=0;i<n;i++){
        
        if(mac[i]<15){ //15 maçı olmayan topçu bu konuda değerlendirilemez dedik.
                System.out.println(topcu[i]+" uzun süreli sakatlık yaşadı mı?(evet-hayir)");
                String cevap=scn.nextLine();
                
                if(cevap.equals("evet")){
                    maas[i]=400000;
                }else if(cevap.equals("hayir")){
                    maas[i]=410000;
                }else{
                    System.out.println("Lütfen düzgün cevaplayınız.");
                }
            
        }else{
            double[] performans=new double[n]; //futbolcu performansları için bir dizi oluşturduk.
            System.out.println(topcu[i]+" performansı:");
            performans[i]=scn.nextDouble();
            scn.nextLine();
            
            if(performans[i]<=6.8){ //performansa göre maaş belirledik.
                maas[i]=500000-(6.8-performans[i])*50000;
                }else if(performans[i]<=7.1){
                maas[i]=1000000-(7.1-performans[i])*50000;
                }else if(performans[i]<=7.4){
                maas[i]=1800000-(7.4-performans[i])*50000;   
                }else{
                maas[i]=2500000-(10.0-performans[i])*10000;
                }
            }
        
        }
            for(i=0;i<n;i++){ //ve sonuç,yazdırıyoruz artık.
                System.out.println(topcu[i]+" çıktığı " +mac[i]+" sayısı sonucunda "+maas[i]+" almaya hak kazanmıştır." );
        }
    
    }
}
