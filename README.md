# Loading
ball loading view for android

![Demo](http://mam1365.us.cube.filecorn.com/ezgif.com-crop.gif)

How to:

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle:
Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  	dependencies {
	        compile 'com.github.mirshahbazi:Loading:master-SNAPSHOT'
	}
maven:
Step 1. Add the JitPack repository to your build file
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
  Step 2. Add the dependency
  
  	<dependency>
	    <groupId>com.github.mirshahbazi</groupId>
	    <artifactId>Loading</artifactId>
	    <version>master-SNAPSHOT</version>
	</dependency>

How to use:
 Add this code to your xml layout:
 
    <loading.mam.com.mamloadingview.MAMBallView
        android:id="@+id/metaball"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"/>
        
        
  and in your activity or fragment add this :
  
    mamBallView = (MAMBallView) this.findViewById(R.id.metaball);
    
    for change the color use this:
    
     mamBallView.SetColor(Color.GREEN);
    
    for change the paint mode use this:
    
      mamBallView.setPaintMode(0);
      
      

  


