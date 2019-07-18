//
// PostFloatingRatesRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostFloatingRatesRequest: Codable {

    public var name: String?
    public var isBaseLendingRate: Bool?
    public var isActive: Bool?
    public var ratePeriods: [PostFloatingRatesRatePeriods]?

    public init(name: String?, isBaseLendingRate: Bool?, isActive: Bool?, ratePeriods: [PostFloatingRatesRatePeriods]?) {
        self.name = name
        self.isBaseLendingRate = isBaseLendingRate
        self.isActive = isActive
        self.ratePeriods = ratePeriods
    }


}

