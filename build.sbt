name := "sbt-dependency-range"

organization := "com.joescii"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers += "rubygems-release" at "http://rubygems-proxy.torquebox.org/releases"

libraryDependencies ++= Seq(
  "rubygems" % "cowsay" % "0.1.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "middleman" % "3.3.7" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "middleman-sprockets" % "3.3.10" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "haml" % "4.0.5" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "sass" % "3.4.7" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "compass-import-once" % "1.0.5" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "compass" % "1.0.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "uglifier" % "2.5.3" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "coffee-script" % "2.3.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "execjs" % "2.2.2" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "kramdown" % "1.5.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "bundler" % "1.7.5" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "rack" % "1.5.2" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "erubis" % "2.7.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "hooks" % "0.4.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "rack-test" % "0.6.2" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "thor" % "0.19.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "activesupport" % "4.1.7" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "padrino-helpers" % "0.12.4" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "listen" % "2.7.11" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "i18n" % "0.6.11" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "uber" % "0.0.11" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "json" % "1.8.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "tzinfo" % "1.2.2" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "minitest" % "5.4.2" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "thread_safe" % "0.3.4" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "padrino-support" % "0.12.4" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "celluloid" % "0.16.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "rb-fsevent" % "0.9.4" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "rb-inotify" % "0.9.5" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "timers" % "4.0.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "ffi" % "1.9.6" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "sprockets" % "2.12.3" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "sprockets-sass" % "1.2.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "sprockets-helpers" % "1.1.0" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "hike" % "1.2.3" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "multi_json" % "1.10.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "tilt" % "2.0.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "compass-core" % "1.0.1" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "chunky_png" % "1.3.3" excludeAll(ExclusionRule(organization = "rubygems")),
  "rubygems" % "coffee-script-source" % "1.8.0" excludeAll(ExclusionRule(organization = "rubygems"))
)

scalacOptions <<= scalaVersion map { v: String =>
  val opts = "-deprecation" :: "-unchecked" :: Nil
  if (v.startsWith("2.9.")) opts else opts ++ ("-feature" :: "-language:postfixOps" :: Nil)
}

