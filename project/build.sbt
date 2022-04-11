addSbtPlugin("org.portable-scala"  %  "sbt-scalajs-crossproject" % "1.2.0")

Compile/ unmanagedSourceDirectories  += file("src/main/scala/org/typelevel").getAbsoluteFile