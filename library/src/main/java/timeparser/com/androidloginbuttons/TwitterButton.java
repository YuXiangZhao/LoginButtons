package timeparser.com.androidloginbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Shaishav on 8/15/2016.
 */
public class TwitterButton extends BaseButton {

    public TwitterButton(Context context, AttributeSet attrs) {
        super(context,attrs,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context) {
        super(context);
    }

}
