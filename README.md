# AWS Sample Application in Scala for Bolt

Sample AWS Application in Scala that demonstrates the usage of
[Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java).

This function can be built using any of the standard Java IDEs
(including IntelliJ IDEA and Eclipse IDE for Java Developers) using the included project files.

### Requirements

- [Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java)
- Scala 2.13.6 or later
- sbt (1.5.3 or higher)

### Using Java SDK for Bolt

#### Sbt
* Import the SDK into your project by adding the following to your build definition (`build.sbt`):

```bash
libraryDependencies += "com.gitlab.projectn-oss" % "projectn-bolt-aws-java" % "1.0.0"
```

### Usage

The Sample AWS Application in Scala illustrates the usage of `List Objects V2` operation with Bolt using
[Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java).

Please ensure that `Bolt` is deployed and a `<bucket>` is crunched before testing the sample AWS application.
If you haven't deployed `Bolt`, follow the instructions given
[here](https://xyz.projectn.co/installation-guide#estimate-savings) to deploy `Bolt`.

* Download the source and run the sample application using `sbt`.

```bash
git clone https://gitlab.com/projectn-oss/projectn-bolt-scala-sample.git
cd projectn-bolt-scala-sample
```

* Set the `BOLT_URL` environment variable
  ```bash
  export BOLT_URL="<url>"
  ```

* Following is an example to list objects in a bolt bucket:
  ```bash
  sbt "run <bucket>"
  ```

### Getting Help

Please refer [ProjectN Bolt Java Lambda Sample](https://gitlab.com/projectn-oss/projectn-bolt-java-sample) for a sample
AWS Lambda Application in Java that utilizes Java SDK for Bolt

For additional assistance, please refer to [Project N Docs](https://xyz.projectn.co/) or contact us directly
[here](mailto:support@projectn.co)