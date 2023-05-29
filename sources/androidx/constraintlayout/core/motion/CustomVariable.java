package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;

public class CustomVariable {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private float mFloatValue = Float.NaN;
    private int mIntegerValue = Integer.MIN_VALUE;
    String mName;
    private String mStringValue = null;
    private int mType;

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - ((float) i);
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | ViewCompat.MEASURED_STATE_MASK;
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public CustomVariable(CustomVariable customVariable) {
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        this.mIntegerValue = customVariable.mIntegerValue;
        this.mFloatValue = customVariable.mFloatValue;
        this.mStringValue = customVariable.mStringValue;
        this.mBooleanValue = customVariable.mBooleanValue;
    }

    public CustomVariable(String str, int i, String str2) {
        this.mName = str;
        this.mType = i;
        this.mStringValue = str2;
    }

    public CustomVariable(String str, int i, int i2) {
        this.mName = str;
        this.mType = i;
        if (i == 901) {
            this.mFloatValue = (float) i2;
        } else {
            this.mIntegerValue = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.mName = str;
        this.mType = i;
        this.mFloatValue = f;
    }

    public CustomVariable(String str, int i, boolean z) {
        this.mName = str;
        this.mType = i;
        this.mBooleanValue = z;
    }

    public static String colorString(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public String toString() {
        String str = this.mName + ':';
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /*900*/:
                return str + this.mIntegerValue;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
                return str + this.mFloatValue;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                return str + colorString(this.mIntegerValue);
            case TypedValues.Custom.TYPE_STRING /*903*/:
                return str + this.mStringValue;
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                return str + Boolean.valueOf(this.mBooleanValue);
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                return str + this.mFloatValue;
            default:
                return str + "????";
        }
    }

    public int getType() {
        return this.mType;
    }

    public boolean getBooleanValue() {
        return this.mBooleanValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public int getColorValue() {
        return this.mIntegerValue;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public boolean isContinuous() {
        int i = this.mType;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setBooleanValue(boolean z) {
        this.mBooleanValue = z;
    }

    public void setIntValue(int i) {
        this.mIntegerValue = i;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public int numberOfInterpolatedValues() {
        return this.mType != 902 ? 1 : 4;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /*900*/:
                return (float) this.mIntegerValue;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
                return this.mFloatValue;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case TypedValues.Custom.TYPE_STRING /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /*900*/:
                fArr[0] = (float) this.mIntegerValue;
                return;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
                fArr[0] = this.mFloatValue;
                return;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                int i = this.mIntegerValue;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case TypedValues.Custom.TYPE_STRING /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        boolean z = true;
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /*900*/:
            case TypedValues.Custom.TYPE_REFERENCE /*906*/:
                this.mIntegerValue = (int) fArr[0];
                return;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                this.mFloatValue = fArr[0];
                return;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                this.mIntegerValue = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow((double) fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow((double) fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow((double) fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case TypedValues.Custom.TYPE_STRING /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                if (((double) fArr[0]) <= 0.5d) {
                    z = false;
                }
                this.mBooleanValue = z;
                return;
            default:
                return;
        }
    }

    public boolean diff(CustomVariable customVariable) {
        int i;
        if (customVariable == null || (i = this.mType) != customVariable.mType) {
            return false;
        }
        switch (i) {
            case TypedValues.Custom.TYPE_INT /*900*/:
            case TypedValues.Custom.TYPE_REFERENCE /*906*/:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
                if (this.mFloatValue == customVariable.mFloatValue) {
                    return true;
                }
                return false;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case TypedValues.Custom.TYPE_STRING /*903*/:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                if (this.mBooleanValue == customVariable.mBooleanValue) {
                    return true;
                }
                return false;
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                if (this.mFloatValue == customVariable.mFloatValue) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public CustomVariable(String str, int i) {
        this.mName = str;
        this.mType = i;
    }

    public CustomVariable(String str, int i, Object obj) {
        this.mName = str;
        this.mType = i;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case TypedValues.Custom.TYPE_INT /*900*/:
            case TypedValues.Custom.TYPE_REFERENCE /*906*/:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_STRING /*903*/:
                this.mStringValue = (String) obj;
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        int clamp = clamp((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
        int clamp2 = clamp((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp << 16) | (clamp2 << 8) | clamp((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i = this.mType;
        boolean z = true;
        switch (i) {
            case TypedValues.Custom.TYPE_INT /*900*/:
                motionWidget.setCustomAttribute(this.mName, i, (int) fArr[0]);
                return;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                motionWidget.setCustomAttribute(this.mName, i, fArr[0]);
                return;
            case TypedValues.Custom.TYPE_COLOR /*902*/:
                int clamp = clamp((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                int clamp2 = clamp((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                motionWidget.setCustomAttribute(this.mName, this.mType, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp << 16) | (clamp2 << 8) | clamp((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case TypedValues.Custom.TYPE_STRING /*903*/:
            case TypedValues.Custom.TYPE_REFERENCE /*906*/:
                throw new RuntimeException("unable to interpolate " + this.mName);
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                String str = this.mName;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                motionWidget.setCustomAttribute(str, i, z);
                return;
            default:
                return;
        }
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int clamp = clamp((int) (f * 255.0f));
        int clamp2 = clamp((int) (f2 * 255.0f));
        return (clamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i = this.mType;
        switch (i) {
            case TypedValues.Custom.TYPE_INT /*900*/:
            case TypedValues.Custom.TYPE_COLOR /*902*/:
            case TypedValues.Custom.TYPE_REFERENCE /*906*/:
                motionWidget.setCustomAttribute(this.mName, i, this.mIntegerValue);
                return;
            case TypedValues.Custom.TYPE_FLOAT /*901*/:
            case TypedValues.Custom.TYPE_DIMENSION /*905*/:
                motionWidget.setCustomAttribute(this.mName, i, this.mFloatValue);
                return;
            case TypedValues.Custom.TYPE_STRING /*903*/:
                motionWidget.setCustomAttribute(this.mName, i, this.mStringValue);
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /*904*/:
                motionWidget.setCustomAttribute(this.mName, i, this.mBooleanValue);
                return;
            default:
                return;
        }
    }

    public String getName() {
        return this.mName;
    }
}
