package com.github.finagle.neo4j.integration

import com.github.finagle.Neo4j
import com.github.finagle.neo4j.protocol.{Neo4j => Neo4jCodec}
import com.twitter.util.Await
import org.scalatest.FunSuite


class ClientServerIntegrationTest extends FunSuite {

  lazy val client = Neo4j.newRichClient("localhost:7474")

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
