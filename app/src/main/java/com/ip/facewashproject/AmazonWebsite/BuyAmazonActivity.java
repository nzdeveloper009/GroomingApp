package com.ip.facewashproject.AmazonWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.ip.facewashproject.Interfaces.BuyBtnID;
import com.ip.facewashproject.Interfaces.ConstantURI;
import com.ip.facewashproject.R;

public class BuyAmazonActivity extends AppCompatActivity {

    WebView webView;
    private String webUrl;
    ProgressBar progressBarweb;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_amazon);

        type = getIntent().getStringExtra("type");

        checkUri();


        webView=(WebView)findViewById(R.id.webview);
        progressBarweb=(ProgressBar)findViewById(R.id.progressBar);
        webView.loadUrl(webUrl);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        webView.setWebChromeClient(new WebChromeClient()
        {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressBarweb.setVisibility(view.VISIBLE);
                progressBarweb.setProgress(newProgress);
                if(newProgress==100){

                    progressBarweb.setVisibility(view.GONE);

                }

                super.onProgressChanged(view, newProgress);
            }
        });
    }

    private void checkUri() {
        //oil skin
        if(type.equals(BuyBtnID.OIL_SKIN_P1_BTN_ID))
        {
            webUrl= ConstantURI.nivea_all_pump_facewash;
        }
        else if(type.equals(BuyBtnID.OIL_SKIN_P2_BTN_ID)){
            webUrl = ConstantURI.garnier_clear_deep_cleansing_facewash;
        }
        else if(type.equals(BuyBtnID.OIL_SKIN_P3_BTN_ID)){
            webUrl = ConstantURI.beardo_activated_charcoal_pollution_control;
        }
        else if(type.equals(BuyBtnID.OIL_SKIN_P4_BTN_ID)){
            webUrl = ConstantURI.loreal_paris_expert_control_charcoal;
        }// dry skin
        else if(type.equals(BuyBtnID.DRY_SKIN_P1_BTN_ID)){
            webUrl = ConstantURI.loreal_paris_expert_white_brightening;
        }
        else if(type.equals(BuyBtnID.DRY_SKIN_P2_BTN_ID)){
            webUrl = ConstantURI.loreal_expert_anti_acne_volcano_brightening;
        }// normal skin
        else if(type.equals(BuyBtnID.NORMAL_SKIN_P1_BTN_ID)){
            webUrl = ConstantURI.nivea_dark_spot_reduction_facewash;
        }
        else if(type.equals(BuyBtnID.NORMAL_SKIN_P2_BTN_ID)){
            webUrl = ConstantURI.garnier_power_white_double_action;
        }// Oily skin scrub
        else if(type.equals(BuyBtnID.OILY_SKIN_SCRUB_BTN_ID)){
            webUrl = ConstantURI.oil_free_acne_face_scrub_neutrogena;
        }// dry skin scrub
        else if(type.equals(BuyBtnID.DRY_SKIN_SCRUB_BTN_ID)){
            webUrl = ConstantURI.normal_skin;
        }// moisturize products
        else if(type.equals(BuyBtnID.MOISTURIZER_SKIN_P1_BTN_ID)){
            webUrl = ConstantURI.men_expert_vita_lift_5_anti_ageing_daily_moisturizer;
        }
        else if(type.equals(BuyBtnID.MOISTURIZER_SKIN_P2_BTN_ID)){
            webUrl = ConstantURI.neutrogena_b003nspof2;
        }// Shaving products
        else if(type.equals(BuyBtnID.SHAVING_GEL_P1_BTN_ID)){
            webUrl = ConstantURI.gels_foam_creams_for_mens;
        }
        else if(type.equals(BuyBtnID.SHAVING_GEL_P2_BTN_ID)){
            webUrl = ConstantURI.gels_foam_creams_gillete_mach3;
        }// Whiting products
        else if(type.equals(BuyBtnID.WHITENING_P1_BTN_ID)){
            webUrl = ConstantURI.vasline_antispot_whitening_fairness;
        }
        else if(type.equals(BuyBtnID.WHITENING_P2_BTN_ID)){
            webUrl = ConstantURI.fair_lovely_max_fairness_for_men;
        }// Perfume products
        else if(type.equals(BuyBtnID.PERFUME_P1_BTN_ID)){
            webUrl = ConstantURI.hugo_boss_men_the_scent_pure_accord_eau_de_toilette_fragrance_for_men;
        }
        else if(type.equals(BuyBtnID.PERFUME_P2_BTN_ID)){
            webUrl = ConstantURI.dolce_gabbana_k_eau_de_toilette_fragance_for_men;
        }
        else if(type.equals(BuyBtnID.PERFUME_P3_BTN_ID)){
            webUrl = ConstantURI.axe_deodorant_body_spray;
        }// Body Wash
        else if(type.equals(BuyBtnID.BODY_WASH_P1_BTN_ID)){
            webUrl = ConstantURI.fa_men_volcano_force_3_in_1_body_hair_face_shower_gel;
        }
        else if(type.equals(BuyBtnID.BODY_WASH_P2_BTN_ID)){
            webUrl = ConstantURI.dove_men_cre_deep_clean_body_and_face_bar_soap;
        }
        else if(type.equals(BuyBtnID.BODY_WASH_P3_BTN_ID)){
            webUrl = ConstantURI.axe_body_wash_alaska_scent;
        }// Body Care
        else if(type.equals(BuyBtnID.BODY_CARE_P1_BTN_ID)){
            webUrl = ConstantURI.ponds_lotion;
        }
        else if(type.equals(BuyBtnID.BODY_CARE_P2_BTN_ID)){
            webUrl = ConstantURI.nievea_for_men_revitalizing_body_lotion;
        }
        else if(type.equals(BuyBtnID.BODY_CARE_P3_BTN_ID)){
            webUrl = ConstantURI.vaseline_men_healing_moisture_cooling_body_lotion;
        }// Hair Spray
        else if(type.equals(BuyBtnID.HAIR_SPRAY_P1_BTN_ID)){
            webUrl = ConstantURI.shop_zone_sabalon_hair_styling_spray;
        }
        else if(type.equals(BuyBtnID.HAIR_SPRAY_P2_BTN_ID)){
            webUrl = ConstantURI.flawless_curls_defining_hair_gel_with_coconu_oil;
        }
        else if(type.equals(BuyBtnID.HAIR_SPRAY_P3_BTN_ID)){
            webUrl = ConstantURI.nova_gold_hair_spray_unisex;
        }
        else if(type.equals(BuyBtnID.HAIR_SPRAY_P4_BTN_ID)){
            webUrl = ConstantURI.gatsby_water_gloss_soft_hair_gel;
        } // Oil Products
        else if(type.equals(BuyBtnID.OIL_PRODUCTS1_BTN_ID)){
            webUrl = ConstantURI.organic_care_hair_oil;
        }
        else if(type.equals(BuyBtnID.OIL_PRODUCTS2_BTN_ID)){
            webUrl = ConstantURI.world_of_promotions_essential_oil_bread_growth;
        }
        else if(type.equals(BuyBtnID.OIL_PRODUCTS3_BTN_ID)){
            webUrl = ConstantURI.cocnut_hair_oi;
        }//Shampoo products
        else if(type.equals(BuyBtnID.SHAMPOO_P1_BTN_ID)){
            webUrl = ConstantURI.dove_men_care_aqua_impact_fortifying_shampoo;
        }
        else if(type.equals(BuyBtnID.SHAMPOO_P2_BTN_ID)){
            webUrl = ConstantURI.oriflame_men_subzero_hair_body_wash;
        }// Normal Product
        else if(type.equals(BuyBtnID.NORMAL_SKIN_SCRUB_BTN_ID)){
            webUrl = ConstantURI.normal_skin;
        }



    }

}