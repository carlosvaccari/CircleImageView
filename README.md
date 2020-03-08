# CircleImageView

## Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.carlosvaccari:CircleImageView:Tag'
	}
  
## In your layout_file.xml (if you want to switch between text initials and image)

    <com.cvaccari.circleimageview.AvatarImageView
        android:id="@+id/avatar"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:src="@mipmap/ic_launcher"
        app:avatarBackgroundColor="@android:color/white"
        app:highlightEnable="false"
        android:layout_margin="16dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:strokeWidth="2dp"
        app:textColor="@android:color/black"
        app:strokeColor="@android:color/holo_blue_dark"
        app:text="Algum Texto"
        app:view_state="INITIAL"
        app:textSize="16sp"
        app:layout_constraintTop_toTopOf="parent" />
        
## or (if you want a simple circle imageview)

    <com.cvaccari.circleimageview.CircleImageView
        android:id="@+id/circle"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_margin="16dp"
        android:src="@mipmap/ic_launcher"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toBottomOf="@id/avatar"
        app:strokeColor="@android:color/holo_blue_dark"
        app:strokeWidth="2dp"
        app:textColor="@android:color/black"
        app:textSize="16sp" />
