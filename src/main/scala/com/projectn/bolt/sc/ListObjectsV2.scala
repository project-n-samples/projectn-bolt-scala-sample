package com.projectn.bolt.sc

import com.projectn.bolt.BoltS3Client
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request

import scala.jdk.CollectionConverters._

object ListObjectsV2 extends App {

  var bucketName: String = args(0)

  val boltS3 = BoltS3Client.builder.build

  val req = ListObjectsV2Request.builder.bucket(bucketName).build

  val resp = boltS3.listObjectsV2(req)

  val s3Objects = resp.contents().asScala
  for (s3Object <- s3Objects) {
    println(s3Object.key())
  }
}
