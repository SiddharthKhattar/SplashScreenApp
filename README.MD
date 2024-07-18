Starting in Android 12, the SplashScreen API lets apps launch with animation, including an into-app motion at launch, a splash screen showing your app icon, and a transition to your app itself. A SplashScreen is a Window and therefore covers an Activity.

The splash screen experience brings standard design elements to every app launch, but it's also customizable so your app can maintain its unique branding.

I've built the splash screen using the Handler.postDelayed() function along with supportActionBar?.hide() to hide the top part of the screen.

