# TagView  

1、LabelView
Sometimes, we need to show a label above an ImageView or any other views. Well, LabelXXView will be able to help you. It's easy to implement as well!  

![image](https://github.com/yuanbaoyu/TagView/raw/master/preview/img1.png)  

![image](https://github.com/yuanbaoyu/TagView/raw/master/preview/img3.png)  

Parameter Description

![image](https://github.com/yuanbaoyu/TagView/raw/master/preview/img2.png)  

If you need Label in your custom View

  1、create an new view class extends YourView
  2、use LabelViewHelper as your Member objects
  3、In Constructor function and onDraw function call LabelViewHelper method.
  4、Call the LabelViewHelper method in other functions
  
### like as follows
    public class LabelXXXView extends YourView {
    LabelViewHelper utils;
    public LabelXXXView(Context context) {
        this(context, null);
    }
    public LabelXXXView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public LabelXXXView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        utils = new LabelViewHelper(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        utils.onDraw(canvas, getMeasuredWidth(), getMeasuredHeight());
    }
    public void setLabelHeight(int height) {
        utils.setLabelHeight(this, height);
    }
    public int getLabelHeight() {
        return utils.getLabelHeight();
    }
    public void setLabelDistance(int distance) {
        utils.setLabelDistance(this, distance);
    }
    public int getLabelDistance() {
        return utils.getLabelDistance();
    }
    public boolean isLabelVisual() {
        return utils.isLabelVisual();
    }
    public void setLabelVisual(boolean enable) {
        utils.setLabelVisual(this, enable);
    }
    public int getLabelOrientation() {
        return utils.getLabelOrientation();
    }
    public void setLabelOrientation(int orientation) {
        utils.setLabelOrientation(this, orientation);
    }
    public int getLabelTextColor() {
        return utils.getLabelTextColor();
    }
    public void setLabelTextColor(int textColor) {
        utils.setLabelTextColor(this, textColor);
    }
    public int getLabelBackgroundColor() {
        return utils.getLabelBackgroundColor();
    }
    public void setLabelBackgroundColor(int backgroundColor) {
        utils.setLabelBackgroundColor(this, backgroundColor);
    }
    public String getLabelText() {
        return utils.getLabelText();
    }
    public void setLabelText(String text) {
        utils.setLabelText(this, text);
    }
    public int getLabelTextSize() {
        return utils.getLabelTextSize();
    }
    public void setLabelTextSize(int textSize) {
        utils.setLabelTextSize(this, textSize);
    }
}

