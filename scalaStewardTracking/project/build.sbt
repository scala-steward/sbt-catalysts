addSbtPlugin("org.portable-scala"  %  "sbt-scalajs-crossproject" % "1.3.1")


Compile/ unmanagedSourceDirectories  += file("../src/main/scala/org/typelevel").getAbsoluteFile