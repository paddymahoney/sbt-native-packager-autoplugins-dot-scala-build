val sbtNativePackager = "com.typesafe.sbt" % "sbt-native-packager" % "1.0.0-M1"

addSbtPlugin(sbtNativePackager)

dependencyOverrides += sbtNativePackager
