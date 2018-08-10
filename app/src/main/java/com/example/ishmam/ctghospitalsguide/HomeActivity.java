package com.example.ishmam.ctghospitalsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    ListView mylist;
    String hospital[]={"Al-Zahar Hospital Ltd.","B.B.M.H","Centre Point Hospital (Pvt)Ltd.","Chattagram Metropoliton Hospital (Pvt) Ltd.","Chittagong Diabetic Hospital","Chittagong General Hospital","Chittagong Maa-O-Shishu Hospital","Chittagong Medical College & Hospital","Chittagong Poly Chinic (Pvt.) Ltd","Chittagram Metropolitan Hospital","Combined Military Hospital","Chittagong Urology & General Hospital","CSTC","Delta Health Care, Chittagong Ltd","Desh Medical Services","Holly Health Hospital Pvt. Ltd,","Ekushey Hospital Private Ltd","General Hospital","Halishahar General Hospital","Holy Crescent Hospital (Pvt.) Ltd.","Institute Of Community Opthalmology","Lions Eye Hospital","Jameson Red Crescent Maternity Hospital","Lancet Hospital","Lions General Hospital","Medical Center","Ma Moni Hospital","Max Hospital and Diagnostics limited","Medicare Services Ltd","Mouni Hospital & Diagnostic Centre","National Hospital Chittagong","Panorama Hospital (Pvt) Ltd","Parkview Hospital Ltd","Premier Hospital","Public Hospital Private Limited","Surgiscope Hospital Ltd(unit-1)","Surgiscope Hospital Ltd(unit-2)","Memon Maternity Hospital Chittagong","Upasham Hospital","ChildCare Hospitial","Chittagong Shishu Hospital (Pvt.) Ltd.","Royal Hospital (Pvt.) Limited","Chevron Clinical Laboratory Pte. Ltd.","Bangladesh Eye Hospital, Chattogram","Chittagong Port Hospital"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mylist=findViewById(R.id.list_view);
        ArrayAdapter adapter=new ArrayAdapter(HomeActivity.this,R.layout.support_simple_spinner_dropdown_item,hospital);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name",hospital[position]);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Opening Details.....", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
