name := "GettingWorkDoneWithExtensibleEffects"

version := "0.1"

scalaVersion := "2.12.1"

val commonSettings = Seq(
  scalaVersion := "2.12.1",
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
    "org.typelevel" %% "cats" % "0.9.0",
    "org.atnos" %% "eff" % "4.1.0"
  ),
  // to write types like Reader[String, ?]
  addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3"),
  // to get types like Reader[String, ?] (with more than one type parameter) correctly inferred for scala 2.12.x
  scalacOptions += "-Ypartial-unification"
)

lazy val exercise1 = (project in file("exercise1")).settings(commonSettings)

lazy val exercise2 = (project in file("exercise2")).settings(commonSettings)

lazy val exercise3 = (project in file("exercise3")).settings(commonSettings)

