// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.6.4")
// Set the version dynamically to the git hash
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.3.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.2.0")

// The Cinnamon Telemetry plugin
addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.14.4")

//addSbtPlugin("com.lightbend.sbt" % "sbt-javaagent" % "0.1.5")