package com.example.test
 
import org.scalatest.FunSpec
import com.example.Basic
 
class BasicTest extends FunSpec {

    describe("Basic") {

        it("should return 'Blue'") {
            new Basic().colour
        }

        it("should return 'Awesome'") {
            new Basic().disposition
        }
    }
}