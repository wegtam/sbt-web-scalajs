sys.props.get("plugin.version") match {
  case Some(version) => addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % version)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

// fast development turnaround when using sbt ~re-start
addSbtPlugin("io.spray"           % "sbt-revolver"             % "0.9.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-native-packager"      % "1.2.2")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "1.0.0-M3")
addSbtPlugin("org.portable-scala" % "sbt-crossproject"         % "0.3.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.3.1")
addSbtPlugin("com.typesafe.sbt"   % "sbt-twirl"                % "1.3.12")
