//
// FloatingRatePeriod.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct FloatingRatePeriod: Codable {

    public var _id: Int64?
    public var fromDate: Date?
    public var interestRate: Double?
    public var createdBy: AppUser?
    public var modifiedBy: AppUser?
    public var createdOn: Date?
    public var modifiedOn: Date?
    public var active: Bool?
    public var differentialToBaseLendingRate: Bool?
    public var floatingRatesId: FloatingRate?
    public var new: Bool?

    public init(_id: Int64?, fromDate: Date?, interestRate: Double?, createdBy: AppUser?, modifiedBy: AppUser?, createdOn: Date?, modifiedOn: Date?, active: Bool?, differentialToBaseLendingRate: Bool?, floatingRatesId: FloatingRate?, new: Bool?) {
        self._id = _id
        self.fromDate = fromDate
        self.interestRate = interestRate
        self.createdBy = createdBy
        self.modifiedBy = modifiedBy
        self.createdOn = createdOn
        self.modifiedOn = modifiedOn
        self.active = active
        self.differentialToBaseLendingRate = differentialToBaseLendingRate
        self.floatingRatesId = floatingRatesId
        self.new = new
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case fromDate
        case interestRate
        case createdBy
        case modifiedBy
        case createdOn
        case modifiedOn
        case active
        case differentialToBaseLendingRate
        case floatingRatesId
        case new
    }


}

