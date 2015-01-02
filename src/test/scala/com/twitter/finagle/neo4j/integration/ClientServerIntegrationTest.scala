package com.twitter.finagle.neo4j.integration

import com.twitter.finagle.Neo4j
import com.twitter.finagle.neo4j.protocol.{Neo4j => Neo4jCodec}
import com.twitter.util.Await
import org.scalatest.FunSuite


class ClientServerIntegrationTest extends FunSuite {

  lazy val client = Neo4j.newRichClient("127.0.0.1:7474")

  test("A client should set and get") {
    val f = for {
      (txOpt, rs) <- client.select("MATCH (n) RETURN COUNT(n), n") {
        row => row
      }
    } yield rs
    Await.result(f)
    assert(true)
  }
}
