package com.example.ishmam.ctghospitalsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView hospitalname,location,contact;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        hospitalname=findViewById(R.id.name);
        location=findViewById(R.id.location);
        contact=findViewById(R.id.contact);
        img=findViewById(R.id.img);

        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Al-Zahar Hospital Ltd.")){

            hospitalname.setText("Al-Zahar Hospital Ltd.");
            location.setText("1062, Love Lane (1st Floor),Chittagong");
            img.setImageResource(R.drawable.alzahar);
            contact.setText("619378, 624494");
        }
        else if(getName.equals("B.B.M.H")){
            hospitalname.setText("B.B.M.H");
            location.setText("U.S.T.C Foy’s lake,Chittagong");
            img.setImageResource(R.drawable.ustc);
            contact.setText("031-659070-7");
        }
        else if (getName.equals("Centre Point Hospital (Pvt)Ltd.")){
            hospitalname.setText("Centre Point Hospital (Pvt)Ltd.");
            location.setText("100, Momin Road, Chittagong – 4000");
            img.setImageResource(R.drawable.centerponit);
            contact.setText("639025 – 7");
        }else if (getName.equals("Chattagram Metropoliton Hospital (Pvt) Ltd.")){
            hospitalname.setText("Chattagram Metropoliton Hospital (Pvt) Ltd.");
            location.setText("948, O.R. Nizam Road,Chittagong");
            img.setImageResource(R.drawable.metropoliton);
            contact.setText("031-651242");
        }else if (getName.equals("Chittagong Diabetic Hospital")){
            hospitalname.setText("Chittagong Diabetic Hospital");
            location.setText("427, Ansari Mansion, Batali Road,Chittagong");
            img.setImageResource(R.drawable.diabetic);
            contact.setText("031-617495");
        }else if (getName.equals("Chittagong General Hospital")){
            hospitalname.setText("Chittagong General Hospital");
            location.setText("Andarkillah, Ctg");
            img.setImageResource(R.drawable.general);
            contact.setText("611407");
        }else if (getName.equals("Chittagong Maa-O-Shishu Hospital")){
            hospitalname.setText("Chittagong Maa-O-Shishu Hospital");
            location.setText("Agrabad, Ctg");
            img.setImageResource(R.drawable.maoshishu);
            contact.setText("711236, 500063");
        }else if (getName.equals("Chittagong Medical College & Hospital")){
            hospitalname.setText("Chittagong Medical College & Hospital");
            location.setText("Fazlul Kader Road,Chittagong");
            img.setImageResource(R.drawable.cmc);
            contact.setText("619597");
        }else if (getName.equals("Chittagong Poly Chinic (Pvt.) Ltd")){
            hospitalname.setText("Chittagong Poly Chinic (Pvt.) Ltd");
            location.setText("33, Panchlaish R/A,Chittagong");
            img.setImageResource(R.drawable.poly);
            contact.setText("031-650911, 653094");
        }else if (getName.equals("Chittagram Metropolitan Hospital")){
            hospitalname.setText("Chittagram Metropolitan Hospital");
            location.setText("487/B, O.R. Nizam Road, Ctg.");
            img.setImageResource(R.drawable.metropoliton);
            contact.setText("620634, 637235");
        }else if (getName.equals("Combined Military Hospital")){
            hospitalname.setText("Combined Military Hospital");
            location.setText("Chittagong Cantt. Ctg");
            img.setImageResource(R.drawable.cmh);
            contact.setText("681551-8");
        }else if (getName.equals("Chittagong Urology & General Hospital")){
            hospitalname.setText("Chittagong Urology & General Hospital");
            location.setText("Sanonda R/A, Sholoshohor 2no Gate, near by Polish Super Office and opposite of Badsha miya patrol pamp\n" +
                    "Chittagong");
            img.setImageResource(R.drawable.urology);
            contact.setText(" 01556-499005");
        }else if (getName.equals("CSTC")){
            hospitalname.setText("CSTC (Chittagong Specialized Treatment & Trauma Center)");
            location.setText("100, O.R.Nizam Road, Panchlaish, Chittagong (opposite Prabartak school), Chittagong, ,Bangladesh");
            img.setImageResource(R.drawable.treatment);
            contact.setText("01973-553335");
        }else if (getName.equals("Desh Medical Services")){
            hospitalname.setText("Desh Medical Services");
            location.setText("31, K.B. Fazlul Kader Road, Panchlaish R/A,Chittagong");
            img.setImageResource(R.drawable.desh);
            contact.setText("031-651591, 654960");
        }else if (getName.equals("Ekushey Hospital Private Ltd")){
            hospitalname.setText("Ekushey Hospital Private Ltd");
            location.setText("Sugandha Rd 2, Chittagong, Bangladesh");
            img.setImageResource(R.drawable.ekushe);
            contact.setText("031-657629");
        }else if (getName.equals("General Hospital")){
            hospitalname.setText("General Hospital");
            location.setText("Anderkillah,Chittagong");
            img.setImageResource(R.drawable.general);
            contact.setText("031-220404, 224634");
        }else if (getName.equals("Halishahar General Hospital")){
            hospitalname.setText("Halishahar General Hospital");
            location.setText("1733/A P C road, West Rumpur Sabuj bag,Chittagong");
            img.setImageResource(R.drawable.halishohor);
            contact.setText("031-715166");
        }else if (getName.equals("Holy Crescent Hospital (Pvt.) Ltd.")){
            hospitalname.setText("Holy Crescent Hospital (Pvt.) Ltd.");
            location.setText("500/A, Zakir Hossain Road, Khulshi, Ctg.");
            img.setImageResource(R.drawable.holycrecsent);
            contact.setText("620025-8");
        }else if (getName.equals("Institute Of Community Opthalmology")){
            hospitalname.setText("Institute Of Community Opthalmology");
            location.setText("729, Pahartoly,Chittagong");
            img.setImageResource(R.drawable.eyehospital);
            contact.setText("031-615710");
        }else if (getName.equals("Lions Eye Hospital")){
            hospitalname.setText("Lions Eye Hospital");
            location.setText("O. R. Nizam Road, Ctg.");
            img.setImageResource(R.drawable.lions);
            contact.setText("616652");
        }else if (getName.equals("Lancet Hospital")){
            hospitalname.setText("Lancet Hospital");
            location.setText("125 K.B. Fazlul Kader Rd, Chittagong, Bangladesh.");
            img.setImageResource(R.drawable.lancet);
            contact.setText(" 01971-899990");
        }else if (getName.equals("Lions General Hospital")){
            hospitalname.setText("Lions General Hospital");
            location.setText("Zakir Hossain Road, Nasirabad, Ctg.");
            img.setImageResource(R.drawable.lionsgeneral);
            contact.setText("622443");
        }else if (getName.equals("Ma Moni Hospital")){
            hospitalname.setText("Ma Moni Hospital");
            location.setText("37, K.B Fazlu Kader Road,Chittagong");
            img.setImageResource(R.drawable.mamoni);
            contact.setText("031-651558, 651648");
        }else if (getName.equals("Max Hospital and Diagnostics limited")){
            hospitalname.setText("Max Hospital and Diagnostics limited");
            location.setText("35/36, Mehedibag Road, Chittagong, Bangladesh");
            img.setImageResource(R.drawable.max);
            contact.setText(" 031-622519");
        }else if (getName.equals("Medicare Services Ltd")){
            hospitalname.setText("Medicare Services Ltd");
            location.setText("Lalkhan Bazar,Chittagong");
            img.setImageResource(R.drawable.logo1);
            contact.setText("031-616905, 637391");
        }else if (getName.equals("Mouni Hospital & Diagnostic Centre")){
            hospitalname.setText("Mouni Hospital & Diagnostic Centre");
            location.setText("Chittagong, 21, Road-Surson Road, Kazir Dewri, Chittagong");
            img.setImageResource(R.drawable.logo1);
            contact.setText("88031623262");
        }else if (getName.equals("National Hospital Chittagong")){
            hospitalname.setText("National Hospital Chittagong");
            location.setText("30, Mehdibag");
            img.setImageResource(R.drawable.national);
            contact.setText("031-623713, 623753");
        }else if (getName.equals("Panorama Hospital (Pvt) Ltd")){
            hospitalname.setText("Panorama Hospital (Pvt) Ltd");
            location.setText("99/A, Chatteswary Road,Chittagong");
            img.setImageResource(R.drawable.panoroma);
            contact.setText("031-613874, 619921, 630549");
        }else if (getName.equals("Parkview Hospital Ltd")){
            hospitalname.setText("Parkview Hospital Ltd");
            location.setText(" 94/103, Katalgonj Road, Panchlaish, Chittagong, Bangladesh");
            img.setImageResource(R.drawable.parkview);
            contact.setText(" +880 312555072 ");
        }else if (getName.equals("Premier Hospital")){
            hospitalname.setText("Premier Hospital");
            location.setText("576/77 O.R. Nizam Road, Chittagong");
            img.setImageResource(R.drawable.premier);
            contact.setText("31655968");
        }else if (getName.equals("Public Hospital Private Limited")){
            hospitalname.setText("Public Hospital Private Limited");
            location.setText("1226, Chatteswari Road,Chittagong");
            img.setImageResource(R.drawable.logo1);
            contact.setText("031-635744");
        }else if (getName.equals("Upasham Hospital")){
            hospitalname.setText("Upasham Hospital");
            location.setText("45, Panchalaish R/A,Chittagong");
            img.setImageResource(R.drawable.upasham);
            contact.setText("031-654230");
        }else if (getName.equals("ChildCare Hospitial")){
            hospitalname.setText("ChildCare Hospitial");
            location.setText("Panchlaish R/A, Chittagong, Bangladesh");
            img.setImageResource(R.drawable.childcare);
            contact.setText("+880 31-653812");
        }else if (getName.equals("Chittagong Shishu Hospital (Pvt.) Ltd.")){
            hospitalname.setText("Chittagong Shishu Hospital (Pvt.) Ltd.");
            location.setText("Fazlul Kader Road,Chittagong");
            img.setImageResource(R.drawable.ctgchildhospital);
            contact.setText("Not available..");
        }else if (getName.equals("Royal Hospital (Pvt.) Limited")){
            hospitalname.setText("Royal Hospital (Pvt.) Limited");
            location.setText("G.E.C Circle, O.R Nizam Road, Chittagong");
            img.setImageResource(R.drawable.royel);
            contact.setText(" 031-658842");
        }else if (getName.equals("Chevron Clinical Laboratory Pte. Ltd.")){
            hospitalname.setText("Chevron Clinical Laboratory Pte. Ltd.");
            location.setText("12/12 OR Nizam Road, Panchlaish, Chittagong");
            img.setImageResource(R.drawable.chevron);
            contact.setText("(+880-31) 652860, 652963, 652533");
        }else if (getName.equals("Bangladesh Eye Hospital, Chattogram")){
            hospitalname.setText("Bangladesh Eye Hospital, Chattogram");
            location.setText("Probartak Sangha Building ( 4th & 5th Floor )\n" +
                    "Probartak Circle, Panchlaish, Chittagong.");
            img.setImageResource(R.drawable.bdeye);
            contact.setText(" 01839392525, 01768225275");
        }else if (getName.equals("Chittagong Port Hospital")){
            hospitalname.setText("Chittagong Port Hospital");
            location.setText("Port Colony Rd,Chittagong");
            img.setImageResource(R.drawable.bondor);
            contact.setText(" 031-724179");
        }else if (getName.equals("Holly Health Hospital Pvt. Ltd,")){
            hospitalname.setText("Holly Health Hospital Pvt. Ltd,");
            location.setText("20/A, K B Fazlul Kader Road, Chittagong ");
            img.setImageResource(R.drawable.holyhealth);
            contact.setText("+88 031 657116");
        }else if (getName.equals("Delta Health Care, Chittagong Ltd")){
            hospitalname.setText("Delta Health Care, Chittagong Ltd");
            location.setText("28, Katalgonj, Mirzapul Road, Panchalish,Chittagong 4212");
            img.setImageResource(R.drawable.delta);
            contact.setText(" 312550005");
        }else if (getName.equals("Surgiscope Hospital Ltd(unit-1)")){
            hospitalname.setText("Surgiscope Hospital Ltd(unit-1)");
            location.setText("53/1, Panchlaish R/A, Chittagong - 4203");
            img.setImageResource(R.drawable.surgiscope1);
            contact.setText("01777-222884");
        }else if (getName.equals("Surgiscope Hospital Ltd(unit-2)")){
            hospitalname.setText("Surgiscope Hospital Ltd(unit-2)");
            location.setText("445/466, Katalgonj Road; 4203 Chittagong");
            img.setImageResource(R.drawable.surgiscope2);
            contact.setText(" 031‑652038, 653882, 652721.");
        }else if (getName.equals("Memon Maternity Hospital Chittagong")){
            hospitalname.setText("Memon Maternity Hospital Chittagong");
            location.setText("55- Sadarghat Road. Chittagong-4000");
            img.setImageResource(R.drawable.memon);
            contact.setText(" 031-617169");
        }else if (getName.equals("Jameson Red Crescent Maternity Hospital")){
            hospitalname.setText("Jameson Red Crescent Maternity Hospital");
            location.setText("395, Andarkillah; 4000 Chittagong");
            img.setImageResource(R.drawable.jemison);
            contact.setText("031-639540");
        }
        else if(getName.equals("Medical Center")){
            hospitalname.setText("Medical Center");
            location.setText("953, O. R. Nizam Road, Chittagong - 4203");
            img.setImageResource(R.drawable.medicalcenter);
            contact.setText(" 031-651054");
        }
    }
}
