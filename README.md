```
------------------------------------------------------------
 Purpose of this repo
------------------------------------------------------------
 This is just a repo to help devs diff the guacamole tutorial on custom authentication in the earliest commit, with my working version of the custom authentication with just a few minor changes on my latest commit with most changes due to the latest guacamole source code or eliminating deprecated classes.
```
```
------------------------------------------------------------
 As is Tutorial Compile errors as of 2015-10-28 v0.9.8
------------------------------------------------------------
``` 
```
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] <some path>/guacamole-auth-custom-tutorial/src/main/java/org/glyptodon/guacamole/auth/TutorialProperties.java:[5,8] class TutorialGuacamoleProperties is public, should be declared in a file named TutorialGuacamoleProperties.java
[ERROR] <some path>/guacamole-auth-custom-tutorial/src/main/java/org/glyptodon/guacamole/auth/TutorialAuthenticationProvider.java:[9,8] org.glyptodon.guacamole.auth.TutorialAuthenticationProvider is not abstract and does not override abstract method getIdentifier() in org.glyptodon.guacamole.net.auth.AuthenticationProvider
[ERROR] <some path>/guacamole-auth-custom-tutorial/src/main/java/org/glyptodon/guacamole/auth/TutorialAuthenticationProvider.java:[18,13] cannot access org.glyptodon.guacamole.auth.TutorialProperties
  bad source file: <some path>/guacamole-auth-custom-tutorial/src/main/java/org/glyptodon/guacamole/auth/TutorialProperties.java
    file does not contain class org.glyptodon.guacamole.auth.TutorialProperties
    Please remove or make sure it appears in the correct subdirectory of the sourcepath.
[INFO] 3 errors
```

