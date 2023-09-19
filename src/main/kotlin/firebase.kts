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


        2. 프로젝트 수준의 gradle을 수정한다.
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

        3. Firestore Database 설정
//규칙예시. id값이 일치하는 사람에게 읽기 쓰기 권한을 준다.
rules_version = '2';
service cloud.firestore {
    match /databases/{database}/documents {
        // Ensure the logged in user matches the ID of the user document
        match /users/{userId} {
            allow read, write: if request.auth != null && request.auth.uid == userId;
        }
    }
}

        4. 프로젝트 설정
                4-1 SDK설정 및 구성.
SHA 인증서 지문(SHA-1)[디지털지문]을 추가한다.
                4-2 json파일을 올바른 경로에 추가한다.
