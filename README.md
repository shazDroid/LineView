<!-- logo -->
<p align="center">
  <img width='300' src="shazdroid_logo.png">
</p>

<!-- tag line -->
<h3 align='center'> LineView Android ! </h3>


## ☢️ What's a LineView ?

LineView can be used to display book like lines e.g in note taking app, or any scribble app

<strong>Any feedback please DM 😊

<br/>



## 🌻 Usage

```xml
<com.shazdroid.lineview.LineView
        android:id="@+id/lineView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/white"/>
```
There are some custom options below.
  
## Kotlin
```kotlin
  val lineView = findViewById<LineView>(R.id.lineView)
  
  // change width of strokes //
  lineView.setLineWidth(2.5f)
  
  // change color of strokes //
  lineView.setLineColor(Color.BLACK)
  
  // change line height (takes Int values)//
  lineView.setLineHeight(10)  
```



<br/>


## Installation
```gradle
dependencies {
   implementation 'com.github.shazDroid:stateLayout:0.1.3'
}
```
<br/>


## 💙 Contributing

PR's are welcome !

Found a Bug ? Create an Issue.

<br/>




## 💖 Like this project ?

Leave a ⭐ If you think this project is cool.

[Share with the world](https://github.com/shazDroid/stateLayout) ✨

<br/>




## 👨‍💻 Author

### Shahbaz Ansari

shahbazansari52@gmail.com

<br/>




## 🍁 Licence

**MIT**
