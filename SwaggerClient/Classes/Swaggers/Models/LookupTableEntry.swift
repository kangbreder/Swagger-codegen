//
// LookupTableEntry.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LookupTableEntry: Codable {

    public var valueFrom: Int?
    public var valueTo: Int?
    public var score: Double?

    public init(valueFrom: Int?, valueTo: Int?, score: Double?) {
        self.valueFrom = valueFrom
        self.valueTo = valueTo
        self.score = score
    }


}

