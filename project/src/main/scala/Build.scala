import sbt._
import sbt.Keys._

object Build extends sbt.Build {
  import com.typesafe.sbt.SbtNativePackager
  import com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging
  import com.typesafe.sbt.SbtNativePackager.autoImport._

  val root = project.in(file("."))
  val core = project
             .in(file("core"))
             .settings(
               maintainer := "me"
             )
             .enablePlugins(SbtNativePackager)
  val core2 = project
              .settings(
                maintainer := "me"
              ).in(file("core2"))
              .enablePlugins(JavaServerAppPackaging)

}
