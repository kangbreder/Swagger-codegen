//
// FloatingRate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct FloatingRate: Codable {

    public var _id: Int64?
    public var name: String?
    public var floatingRatePeriods: [FloatingRatePeriod]?
    public var createdBy: AppUser?
    public var modifiedBy: AppUser?
    public var createdOn: Date?
    public var modifiedOn: Date?
    public var active: Bool?
    public var baseLendingRate: Bool?
    public var new: Bool?

    public init(_id: Int64?, name: String?, floatingRatePeriods: [FloatingRatePeriod]?, createdBy: AppUser?, modifiedBy: AppUser?, createdOn: Date?, modifiedOn: Date?, active: Bool?, baseLendingRate: Bool?, new: Bool?) {
        self._id = _id
        self.name = name
        self.floatingRatePeriods = floatingRatePeriods
        self.createdBy = createdBy
        self.modifiedBy = modifiedBy
        self.createdOn = createdOn
        self.modifiedOn = modifiedOn
        self.active = active
        self.baseLendingRate = baseLendingRate
        self.new = new
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case floatingRatePeriods
        case createdBy
        case modifiedBy
        case createdOn
        case modifiedOn
        case active
        case baseLendingRate
        case new
    }


}

