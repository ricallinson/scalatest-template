package com.example.test
 
import org.scalatest.FunSpec
import com.example.Basic
 
class BasicTest extends FunSpec {

    describe("Basic") {

        it("should return 'Blue'") {
            assert(new Basic().colour === "Blue")
        }

        it("should return 'Awesome'") {
            assert(new Basic().disposition === "Awesome")
        }
    }
}