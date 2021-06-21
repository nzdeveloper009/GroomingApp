package com.ip.facewashproject.YoutubeVideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ip.facewashproject.Interfaces.ActivityID;
import com.ip.facewashproject.Interfaces.ConstantURI;
import com.ip.facewashproject.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class YoutubeVideoActivity extends AppCompatActivity {

    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_skin_type_video);

        type = getIntent().getStringExtra("type");

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                if(type.equals(ActivityID.FACE_WASH_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_check_skin_type,0);
                }
                else if(type.equals(ActivityID.FACE_SCRUB_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_scrub,0);
                }
                else if(type.equals(ActivityID.MOISTURIZE_PRODUCT_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_moisturizer,0);
                }
                else if(type.equals(ActivityID.WHITING_PRODUCT_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_cream,0);
                }
                else if(type.equals(ActivityID.PERFUME_PRODUCT_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_perfume_and_deodorants,0);
                }
                else if(type.equals(ActivityID.HAIR_SPRAY_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_hair_sparay,0);
                }
                else if(type.equals(ActivityID.OIL_PRODUCTS_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_oil_hair,0);
                }
                else if(type.equals(ActivityID.SHAMPOO_PRODUCTS_ID))
                {
                    youTubePlayer.loadVideo(ConstantURI.how_to_apply_shampoo_on_hair,0);
                }
            }
        });
    }
}