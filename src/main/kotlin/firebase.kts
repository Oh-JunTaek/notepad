firebase는 서버 db중 하나이다. (https://console.firebase.google.com/?hl=ko)
        1. gradle을 먼저 설정한다.(module : app 단계에서 수행한다.)
plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

dependencies {
    implementation("com.google.firebase:firebase-firestore-ktx:24.7.1")
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation(platform("com.google.firebase:firebase-bom:32.2.3"))
}
        2. 프로젝트 수준의 grdle을 수정한다.
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.10")
    }
}

allprojects {
    repositories {
        google()
    }
}