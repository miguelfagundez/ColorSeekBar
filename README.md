# ColorSeekBar
ColorSeekBar Library

**For more details:** https://github.com/rtugeek/ColorSeekBar

## Gradle

**Include in Build.Gradle (Project):**
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

**Include in Build.Gradle (Module:app):**
```
    // ColorSeekBar
    implementation 'com.github.rtugeek:colorseekbar:1.7.7'
```


## Layout file (main_activity.xml):

```
   <com.rtugeek.android.colorseekbar.ColorSeekBar
     android:id="@+id/colorSlider"
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     app:colorSeeds="@array/material_colors"
     ... />
```

## Create an arrays.xml file into values/

Include a list of colors (3 or more)

```
<resources>
    <array name="myColors">
        <item>#000000</item>
        <item>#EF4545</item>
        <item>#76ED5D</item>
        <item>#4D97EA</item>
        <item>#EFED60</item>
        <item>#F8F8F8</item>
    </array>
</resources>
```

## MainActivity.java

Check website for more details.

```
private ColorSeekBar colorSeekBar;
...
colorSeekBar = findViewById(R.id.colorSlider);
...
colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener() {
      @Override
      public void onColorChangeListener(int colorBarPosition, int alphaBarPosition, int color) {
           textView.setTextColor(color);
           // Do whatever you want..
      }
});
```

## Final result:
<p align = "center">
<img src="/images/01.gif" width="300"> <img src="/images/02.gif" width="300">
</p>
