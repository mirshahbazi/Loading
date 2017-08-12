# Loading
ball loading view for android


![Hero Image](https://github.com/mirshahbazi/Loading/blob/master/app/preview/sample.gif)


## Using with gradle
- Add the JitPack repository to your root build.gradle:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

- Add the dependency to your sub build.gradle:
```gradle
dependencies {
    compile 'com.github.mirshahbazi:Loading:master-SNAPSHOT'
}
```
## Using with maven
- Add the JitPack repository to your build file
```maven:
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
 ``` 
-  Add the dependency
 ```maven: 
  	<dependency>
	    <groupId>com.github.mirshahbazi</groupId>
	    <artifactId>Loading</artifactId>
	    <version>master-SNAPSHOT</version>
	</dependency>
```

How to use:
 Add this code to your xml layout:


    <loading.mam.com.mamloadingview.MAMBallView
        android:id="@+id/metaball"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"/>
	
## Java
```java        
        
 // and in your activity or fragment add this :
  
    mamBallView = (MAMBallView) this.findViewById(R.id.metaball);
    
    //for change the color use this:
    
     mamBallView.SetColor(Color.GREEN);
    
    //for change the paint mode use this:
    
      mamBallView.setPaintMode(0);
      
'''      

  


