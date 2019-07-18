//
// GetFloatingRatesFloatingRateIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetFloatingRatesFloatingRateIdResponse: Codable {

    public var _id: Int?
    public var name: String?
    public var isBaseLendingRate: Bool?
    public var isActive: Bool?
    public var createdBy: String?
    public var createdOn: String?
    public var modifiedBy: String?
    public var modifiedOn: String?
    public var ratePeriods: [GetFloatingRatesRatePeriods]?

    public init(_id: Int?, name: String?, isBaseLendingRate: Bool?, isActive: Bool?, createdBy: String?, createdOn: String?, modifiedBy: String?, modifiedOn: String?, ratePeriods: [GetFloatingRatesRatePeriods]?) {
        self._id = _id
        self.name = name
        self.isBaseLendingRate = isBaseLendingRate
        self.isActive = isActive
        self.createdBy = createdBy
        self.createdOn = createdOn
        self.modifiedBy = modifiedBy
        self.modifiedOn = modifiedOn
        self.ratePeriods = ratePeriods
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case isBaseLendingRate
        case isActive
        case createdBy
        case createdOn
        case modifiedBy
        case modifiedOn
        case ratePeriods
    }


}

