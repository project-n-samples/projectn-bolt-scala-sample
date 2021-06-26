# AWS Sample Application in Scala for Bolt

Sample AWS Application in Scala that demonstrates the usage of
[Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java).

This function can be built using any of the standard Java IDEs
(including IntelliJ IDEA and Eclipse IDE for Java Developers) using the included project files.

### Requirements

- [Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java)
- Scala 2.13.6 or later
- sbt (1.5.3 or higher)

### Build From Source

* Download and build the `Java SDK for Bolt` by following the instructions given 
  [here](https://gitlab.com/projectn-oss/projectn-bolt-java)
  
* Download the source and copy the `Java SDK for Bolt` package (`bolt-java-sdk.jar`), built in the previous step,
  into the `lib` directory.
  
```bash
git clone https://gitlab.com/projectn-oss/projectn-bolt-scala-sample.git
cd projectn-bolt-scala-sample
mkdir lib

# copy Bolt Java SDK package into the lib directory.

$ ls lib
bolt-java-sdk.jar
```

### Usage

The Sample AWS Application in Scala illustrates the usage of `List Objects V2` operation with Bolt using 
[Java SDK for Bolt](https://gitlab.com/projectn-oss/projectn-bolt-java).

Please ensure that `Bolt` is deployed and a `<bucket>` is crunched before testing the sample AWS application. 
If you haven't deployed `Bolt`, follow the instructions given 
[here](https://xyz.projectn.co/installation-guide#estimate-savings) to deploy `Bolt`.

* Set the `BOLT_URL` environment variable
  ```bash
  export BOLT_URL="<url>"
  ```

* Following is an example to list objects in a bolt bucket:
  ```bash
  sbt "run <bucket>"
  ```

### Getting Help

For additional assistance, please refer to [Project N Docs](https://xyz.projectn.co/) or contact us directly
[here](mailto:support@projectn.co)