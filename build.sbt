organization := "ucsc.edu"

version := "0.8"

name := "essent.testbed"

mainClass in (Compile, run) := Some("essent.testbed.Launcher")

scalaVersion := "2.13.10"
val chiselVersion = "3.5.6"

allowUnsafeScalaLibUpgrade := true

scalacOptions ++= Seq("-deprecation", "-feature", "-language:reflectiveCalls")

libraryDependencies += "edu.berkeley.cs" %% "firrtl" % "1.6.0"

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % chiselVersion

libraryDependencies += "edu.berkeley.cs" %% "firrtl-interpreter" % "1.5.6"

libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "2.5.6"

addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full)

lazy val essent = (project in file("essent"))

lazy val root = (project in file(".")).dependsOn(essent)
