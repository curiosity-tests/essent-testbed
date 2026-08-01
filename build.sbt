organization := "ucsc.edu"

version := "0.8"

name := "essent.testbed"

mainClass in (Compile, run) := Some("essent.testbed.Launcher")

scalaVersion := "2.13.18"

scalacOptions ++= Seq("-deprecation", "-feature", "-language:reflectiveCalls")

libraryDependencies += "edu.berkeley.cs" %% "firrtl" % "1.6.0"

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.5.6"

libraryDependencies += "edu.berkeley.cs" %% "firrtl-interpreter" % "1.5.6"

libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "2.5.6"

lazy val essent = (project in file("essent"))

lazy val root = (project in file(".")).dependsOn(essent)
